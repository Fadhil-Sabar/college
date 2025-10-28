Nama: Fadhil Andriawan
NIM: 053497355
Prodi: Sistem Informasi

1. Jawaban
   a. Terlampir di file pdf atau https://studentutac-my.sharepoint.com/:w:/g/personal/053497355_ecampus_ut_ac_id/EfCGmTW_c-1NocQ4mVpq9r8B8AMaiNzos7k0sH6x6wquVQ?e=9Mjoi9
   b. Sejarah java
   Java pada awalnya dikembangkan oleh James Gosling di Sun Microsystems dan dirilis tahun 1995. Awalnya Java diberi nama Oak namun diganti karena sudah digunakan oleh perusahaan Oak Technology. Java diciptakan dengan rancangan konsep "Write Once, Run Anywhere" yang bisa menjalankan kode di berbagai platform menggunakan JVM atau Java Virtual Machine.
   Kemudian pada tahun 2010 diakuisisi oleh Oracle dan terus berkembang dengan bermacam-macam fitur seperti Lambda Expression, Modularization, dan Virtual Threads.
   Contoh aplikasi yang menggunakan bahasa pemrograman Java:
   1. Minecraft, merupakan game yang dibuat oleh Mojang Studios.
   2. Netflix, merupakan aplikasi streaming video dan Spring Boot (framework dari Java) digunakan sebagai backend.

2. Jawaban
> Flowchart terlampir di file pdf

> Pseudocode

Program perhitungan gaji

Mulai
Deklarasi:
    integer gaji
    integer gaji_pokok
    integer gaji_lembur
    string golongan
    integer jam_lembur

Input(golongan)
Jika golongan == 'A' maka
    gaji_pokok <- 5000000
Jika golongan == 'B' maka
    gaji_pokok <- 6500000
Jika golongan == 'C' maka
    gaji_pokok <- 9500000
Jika tidak maka
    gaji_pokok <- 0

Input(jam_lembur)
Jika jam_lembur == 1 maka
    gaji_lembur <- 30/100 * gaji_pokok
Jika jam_lembur == 2 maka
    gaji_lembur <- 32/100 * gaji_pokok
Jika jam_lembur == 3 maka
    gaji_lembur <- 34/100 * gaji_pokok
Jika jam_lembur == 4 maka
    gaji_lembur <- 36/100 * gaji_pokok
Jika jam_lembur >= 5 maka
    gaji_lembur <- 38/100 * gaji_pokok
Jika tidak maka
    gaji_lembur <- 0

Formulasi Gaji
   Gaji <- gaji_pokok + gaji_lembur
Tampilkan:
    Cetak gaji

Selesai

Sumber referensi:
- BMP MSIM4203
- https://enigmacamp.com/blog/bahasa-pemrograman-java-adalah
- https://careerwithhina.medium.com/netflix-tech-stack-9e120b072a8
- https://id.wikipedia.org/wiki/Minecraft