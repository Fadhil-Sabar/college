library(ggplot2)
library(DT)

pilihan_visualisasi <- list(
  "Scatter Plot Interaktif" = "scatter",
  "Line Plot Interaktif"    = "line",
  "Bar Plot Interaktif"     = "bar",
  "Tabel Data Interaktif"   = "table"
)

ui <- fluidPage(
  titlePanel("Tugas 3"),
  
  sidebarLayout(
    sidebarPanel(
      
      fileInput("file1", "Pilih file"),
      
      selectInput(
        inputId = "jenis_plot",
        label = "Pilih Jenis Visualisasi:",
        choices = pilihan_visualisasi
      ),
      
      uiOutput("pilihan_kolom_ui"),
      uiOutput("pilihan_kolom_ui_y")
    ),
    
    mainPanel(
      uiOutput("dynamic_output")
    )
  )
)

server <- function(input, output) {
  dataInput <- reactive({
    req(input$file1)
    
    df <- readxl::read_excel(path = input$file1$datapath, skip = 1)
    ext <- tools::file_ext(input$file1$datapath)
    validate(need(ext == "xlsx", "Please upload a xlsx file"))
    
    return(df)
  })
  
  list_kolom_reaktif <- reactive({
    df <- dataInput()

    list_kolom <- names(df)
    return(list_kolom)
  })
  
  jenis_plot_reactive <- reactive(input$jenis_plot)
  
  output$dynamic_output <- renderUI({
    if (input$jenis_plot == "table") {
        DTOutput("table_output")  # Tabel
    } else {
        plotOutput("plot_data_output")  # Plot
    }
  })

  #function render table
  output$table_output <- renderDT({
    df <- dataInput()
    datatable(df)
  })
  
  #function render plot
  output$plot_data_output <- renderPlot({
    df <- dataInput()
    
    req(input$kolom_dipilih)
    
    req(input$kolom_dipilih_y)
    
    x_var <- input$kolom_dipilih
    y_var <- input$kolom_dipilih_y
    
    if (input$jenis_plot == "line") {
      if (!is.numeric(df[[x_var]])) {
        df[[x_var]] <- factor(df[[x_var]], levels = unique(df[[x_var]]))
      }
      if (!is.numeric(df[[y_var]])) {
        df[[y_var]] <- as.numeric(df[[y_var]])
      }
    }
    
    p <- ggplot(data = df, aes(x = .data[[x_var]], y = .data[[y_var]])) +
        labs(title = paste(input$jenis_plot, "Plot: ", x_var, "vs", y_var),
            x = x_var, 
            y = y_var)
        
    if (input$jenis_plot == "scatter") {
        p <- p + geom_point() # Scatter Plot
    } else if (input$jenis_plot == "line") {
        p <- p + geom_line()  # Line Plot
    } else if (input$jenis_plot == "bar") {
      p <- p + geom_col()  # Bar Plot
    }
    
    p <- p + theme_minimal()
    
    return(p)
  })
  
  # untuk x
  output$pilihan_kolom_ui <- renderUI({
    kolom_names <- list_kolom_reaktif()
    
    if (length(kolom_names) > 0) {
      selectInput(
        inputId = "kolom_dipilih",
        label = "Pilih Kolom X untuk Divisualisasikan:",
        choices = kolom_names,
        selected = kolom_names[1]
      )
    }
  })
  
  # untuk y
  output$pilihan_kolom_ui_y <- renderUI({
    kolom_names <- list_kolom_reaktif()
    
    if (length(kolom_names) > 0) {
      selectInput(
        inputId = "kolom_dipilih_y",
        label = "Pilih Kolom Y untuk Divisualisasikan:",
        choices = kolom_names,
        selected = kolom_names[2]
      )
    }
  })
}

# Run the application
shinyApp(ui = ui, server = server)