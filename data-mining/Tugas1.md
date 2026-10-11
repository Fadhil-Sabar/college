Nama: Fadhil Andriawan

NIM: 053497355

Program Studi: Sistem Informasi

Tugas 1 Data Mining

> 1. Jelaskan apakah kegiatan menghitung total pendapatan perusahaan termasuk data mining atau bukan, beserta alasannya.

Data mining merupakan proses menemukan pola, hubungan, atau informasi yang berguna dari sekumpulan data menggunakan teknik seperti statistik, machine learning, dan pengenalan pola. Data mining digunakan dalam berbagai sektor, seperti kesehatan, analisis pasar, pendidikan, dan manufaktur.

Menurut analisis saya, kegiatan menghitung total pendapatan perusahaan tidak termasuk data mining apabila hanya dilakukan dengan menjumlahkan pendapatan dari seluruh transaksi. Kegiatan tersebut merupakan agregasi data untuk menghasilkan ringkasan, bukan untuk menemukan pola atau hubungan yang sebelumnya belum diketahui. Jumlah data yang besar dan penggunaan komputer tidak otomatis menjadikan kegiatan tersebut sebagai data mining.

Sebagai contoh, Takdirillah (2020) menerapkan algoritma Apriori pada data transaksi penjualan untuk menemukan keterkaitan antarproduk. Informasi yang dihasilkan digunakan sebagai pendukung strategi penjualan, seperti menentukan paket produk, memberikan rekomendasi kepada pembeli, dan mengatur penempatan barang. Dalam penelitian tersebut, data transaksi dianalisis untuk menghasilkan informasi mengenai hubungan antarproduk.

Berdasarkan contoh tersebut, perbedaannya terletak pada tujuan dan hasil pengolahan data. Menghitung total pendapatan hanya menghasilkan informasi mengenai berapa pendapatan yang telah diperoleh perusahaan. Sebaliknya, penerapan data mining dapat menghasilkan informasi mengenai pola pembelian pelanggan, seperti produk apa saja yang cenderung dibeli secara bersamaan. Artikel tersebut menjadi contoh penerapan data mining, sedangkan penilaian bahwa penjumlahan pendapatan merupakan agregasi adalah kesimpulan dari perbandingan kedua kegiatan tersebut.

> 2. Jelaskan tujuan normalisasi data.

Normalisasi data merupakan metode dalam memproses ulang data dalam skala yang lebih kecil seperti 0,0 sampai 1,0 atau -1.0 - 1.0 dengan tujuan menyeimbangkan nilai dari setiap atribut untuk digunakan dalam proses analisis data.

Pemrosesan data lainnya juga dilakukan dengan tujuan memahami data, meingkatkan kualitas hingga efisiensi dalam memproses data mining nantinya.

> Lakukan normalisasi linear pada dua fitur berikut:


> 3. Pengelola tempat wisata ingin memprediksi jumlah pengunjung untuk 5 bulan ke depan

Sebutkan teknik dan algoritma yang digunakan.

Menurut saya, teknik yang dapat digunakan adalah prediksi atau peramalan (forecasting), yang termasuk dalam predictive data mining. Teknik ini digunakan untuk memperkirakan nilai pada masa mendatang berdasarkan pola dalam data historis. Pada kasus tempat wisata, data yang digunakan berupa jumlah pengunjung setiap bulan yang disusun secara berurutan sebagai data runtun waktu (time series).

Algoritma yang dapat digunakan adalah neural network. Dalam BMP MSIM4403 Modul 3, neural network digunakan untuk memprediksi harga saham berdasarkan data runtun waktu. Pendekatan tersebut dapat diterapkan pada kasus ini dengan menjadikan jumlah pengunjung sebagai nilai yang diprediksi.

Cara kerjanya adalah sebagai berikut:
1. Mengumpulkan dan menyiapkan data tahun sebelumnya
Pengelola mengumpulkan data jumlah pengunjung bulanan dari beberapa tahun sebelumnya untuk kemudian data diperiksa untuk menangani pencatatan yang salah atau data yang hilang, kemudian dinormalisasi agar lebih sesuai untuk proses pelatihan.
2. Menyusun data masukan dan target
Jumlah pengunjung pada beberapa bulan sebelumnya digunakan sebagai masukan, sedangkan jumlah pengunjung pada bulan berikutnya digunakan sebagai target. Dengan demikian, model mempelajari hubungan antara riwayat kunjungan dan jumlah pengunjung pada periode selanjutnya.
3. Melatih neural network
Model menghasilkan prediksi, kemudian membandingkannya dengan jumlah pengunjung yang sebenarnya. Selisih antara keduanya digunakan untuk menyesuaikan bobot jaringan secara berulang agar kesalahan prediksi berkurang.
4. Menguji kemampuan model
Data dibagi berdasarkan urutan waktu. Periode yang lebih awal digunakan untuk pelatihan, sedangkan periode yang lebih baru digunakan untuk pengujian. Pengujian ini diperlukan untuk mengetahui kemampuan model memprediksi data yang belum pernah dipelajari
5. Memprediksi lima bulan ke depan
Setelah model dinilai memadai, data kunjungan terakhir dimasukkan untuk memprediksi bulan pertama. Hasil tersebut dapat digunakan kembali sebagai bagian dari masukan untuk memprediksi bulan berikutnya, hingga diperoleh perkiraan selama lima bulan. Pada pendekatan bertahap ini, kesalahan dapat terakumulasi sehingga hasilnya perlu ditafsirkan secara hati-hati.

Sehingga teknik prediksi atau peramalan digunakan untuk memperkirakan jumlah pengunjung lima bulan ke depan. Hasilnya dapat menjadi bahan pertimbangan dalam menyiapkan petugas, fasilitas, dan strategi promosi

Sumber referensi:
- BMP MSIM4403 Data Mining Modul 1 - 3
- Takdirillah, R. (2020). Penerapan data mining menggunakan algoritma Apriori terhadap data transaksi sebagai pendukung informasi strategi penjualan. Edumatic: Jurnal Pendidikan Informatika, 4(1), 37–46. https://e-journal.hamzanwadi.ac.id/index.php/edumatic/article/download/2081/1152

