library(ggplot2)
library(dplyr)
library(broom)
library(ggpubr)

#poin a
pendapatan <- as.numeric(Tugas_2_data_pendapatan$pendapatan) * 10000
kebahagiaan <- as.numeric(Tugas_2_data_pendapatan$kebahagiaan)

hist(kebahagiaan)

#poin b

plot(pendapatan, kebahagiaan)

#poin c
model_regresi <- lm(kebahagiaan ~ pendapatan)
summary(model_regresi)

#poin d
par(mfrow = c(2, 2))
plot(model_regresi)

#poin e
data_plot <- data.frame(
  pendapatan = pendapatan,
  kebahagiaan = kebahagiaan
)

p <- ggplot(data_plot, aes(x = pendapatan, y = kebahagiaan)) +
  geom_point(color = "blue") + # 1. Plot data points
  geom_smooth(method = "lm", se = FALSE, color = "red") + # 2. Garis regresi linear
  stat_regline_equation( # 3. Persamaan garis linear
    aes(label = after_stat(eq.label)),
    label.x = min(data_plot$pendapatan),
    label.y = max(data_plot$kebahagiaan)
  ) +
  labs( # 4. Judul dan label sumbu
    title = "Plot Regresi Linear",
    x = "Pendapatan (dikali 10.000)",
    y = "Tingkat Kebahagiaan"
  ) +
  theme_minimal()

p
