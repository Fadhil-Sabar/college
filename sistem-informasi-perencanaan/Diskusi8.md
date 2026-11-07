Selamat malam Bapak / Ibu tutor, berikut jawaban saya.

![[Diskusi8-peta-bumiayu.png]]

> Coba Anda jelaskan sistem koordinat apa yang digunakan peta di atas!

1. Sistem koordinat pada peta

Peta Administrasi Kecamatan Bumiayu menggunakan sistem koordinat geografis atau lintang-bujur. Hal ini terlihat dari keterangan peta, yaitu Projection: Geographic (Longitude/Latitude), Datum: WGS 1984, dan Unit: Degree Minute Second.

Pada sistem ini, letak suatu tempat dinyatakan dengan sudut. Lintang menunjukkan posisi di utara atau selatan khatulistiwa (0° - 90°), sedangkan bujur menunjukkan posisi di timur atau barat Greenwich (0° - 180°). Acuannya adalah bumi berbentuk elipsoid, dalam hal ini datum WGS 84 yang juga dipakai oleh GPS. Satuannya derajat, menit, dan detik, bukan meter.

Grid pada pinggir peta menunjukkan Bumiayu berada di sekitar 108°57′ - 109°03′ BT dan 7°12′ - 7°18′ LS.

> Kemudian coba Anda uraikan apakah sistem koordinat tersebut dapat secara langsung mengukur besaran spasial seperti luas dan jarak?

2. Kemampuan mengukur luas dan jarak

Menurut saya, sistem koordinat ini tidak dapat langsung dipakai untuk mengukur luas dan jarak, karena:
- Satuannya berupa sudut (derajat), sedangkan luas dan jarak membutuhkan satuan panjang seperti meter.
- Permukaan bumi melengkung, sedangkan rumus jarak dan luas yang biasa dipakai berlaku untuk bidang datar.

Sehingga peta perlu diproyeksikan terlebih dahulu ke sistem koordinat bersatuan meter, seperti UTM (Universal Transverse Mercator). Pada UTM, permukaan bumi didatarkan dan dibagi menjadi 60 zona selebar 6° bujur, sehingga koordinatnya bisa langsung dipakai menghitung jarak, keliling, dan luas. Bumiayu termasuk zona UTM 49S, jadi di QGIS layer peta dapat di-reproject ke WGS 84 / UTM zone 49S sebelum menghitung luas desa atau jarak antardesa.

###### Kesimpulan

Peta Bumiayu memakai sistem koordinat geografis dengan datum WGS 1984 dan satuan derajat, menit, detik. Sistem ini tepat untuk menunjukkan lokasi, tetapi untuk mengukur luas dan jarak peta perlu diubah dulu ke sistem proyeksi bersatuan meter seperti UTM.

Sumber referensi:
- Sitawati, A., & Situmorang, R. (2022). Sistem informasi perencanaan (Edisi 2, Modul 9: Analisis dengan Metode Keruangan). Universitas Terbuka.
- Cahyono, T. (2018). Sistem koordinat dan pengetahuan peta (Modul Diklat Pembuatan Peta Desa). Badan Informasi Geospasial. https://big.go.id/uploads/ebook/EBookGeospasial/39/SistemKoordinatdanPengetahuanPeta.pdf
- Esri. (t.t.). Spatial references. Esri Developer. https://developers.arcgis.com/documentation/spatial-references
