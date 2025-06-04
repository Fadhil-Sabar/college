##### Nama: Fadhil Andriawan <br/> NIM: 053497355 <br> Prodi: Sistem Informasi <br> UPBJJ Jakarta

> Seorang peneliti ingin mengetahui apakah rata-rata banyaknya bekteri per unit volume pada suatu air danau masih berada di bawah batas aman yaitu 200 bakteri/per unit volume. Dari sampel sebanyak 10 diperoleh rata rata 194,8 bakteri/per unit volume dengan deviasi standar (simpangan baku) s=13,14 bakteri/per unit volume. Dengan asumsi data berasal dari populasi normal, apakah data menunjukkan bahwa banyak bakteri masih di bawah batas aman? Untuk menjawab pertanyaan tersebut ikuti langkah-langkah penyelesaian berikut.

> - Tentukan hipotesis uji (hipotesis nul dan hipotesis alternatif)
> - Tentukan statistik uji untuk kasus tersebut dengan menggunakan taraf signifikansi a=0,01
> - Tentukan daerah kritis uji
> - Tentukan kesimpulan Anda

- Hipotesis uji
  $H_0: \mu >= 200 $
  $H_1: \mu < 200 $

- Statistik uji:
  $  z = \frac{\bar{x} - \mu_0} {s/ \sqrt{n}} $

  Dengan diketahui
  $\bar{x} = 194,8$ rata rata sampel
  $\mu_0 = 200$ rata rata hipotesis nol
  $s = 13,14$ simpangan baku sampel
  $n = 10$ ukuran sampel

  $ z = \frac{194,8 - 200} {13,14/ \sqrt{10}} = \frac{-5,2}{13,14/3,16} = \frac{-5,2}{4,15} = 1,25$

  Maka statistik uji = 1,25
  Derajat kebebasan $df = n - 1 = 10-1 = 9$

- Daerah kritis uji:
  - $\alpha = 0,01$
  - Uji satu arah dengan derajat kebebasan $df = 9$
  - Nilai kritis $t_{\alpha, df} = t_{0.01 , 9} = -2,821$ berdasarkan tabel distribusi t
  - Daerah kritis: tolak $H_0$ jika $t < -2,821$

- Kesimpulan
  Dengan perbandingan statistik uji $t = -1,25 > -2,821$, sehigga tidak ada di daerah kritis

  Maka gagal menolak $H_0$.

  Kesimpulan, pada taraf signifikansi $\alpha = 0,01$, tidak ada cukup bukti untuk menyimpulkan rata rata jumlah bakteri per unit volume di air danau sebesar 200 bakteri per unit volume, sehingga data tidak cukup kuat untuk mendukung bahwa air danau aman berdasarkan data tersebut.

Sumber referensi:
- https://www.criticalvaluecalculator.com/
- BMP SATS4121 Modul 8