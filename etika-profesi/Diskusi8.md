Selamat siang Bapak / Ibu Tutor, berikut jawaban saya.

ITU-T merupakan sektor standardisasi dari International Telecommunication Union (ITU), badan PBB yang mengurus teknologi informasi dan komunikasi. Standar keamanannya dibuat oleh kelompok studi SG17 (Security). Rekomendasi X.800 membahas arsitektur keamanan untuk model OSI (Open Systems Interconnection), sedangkan X.805 membahas arsitektur keamanan untuk sistem yang berkomunikasi secara end-to-end. X.805 masih memakai banyak istilah dari X.800, sehingga keduanya sering dibahas bersama.

Arsitektur keamanan X.805 menjawab tiga pertanyaan, yaitu perlindungan apa yang dibutuhkan, perangkat apa yang perlu dilindungi, dan aktivitas jaringan apa yang perlu dilindungi. Ketiganya dijawab oleh tiga komponen, yaitu dimensi keamanan, lapisan keamanan (infrastruktur, layanan, aplikasi), dan bidang keamanan (manajemen, kontrol, pengguna akhir). Prinsip layanan keamanannya ada pada dimensi keamanan, yang terdiri dari delapan dimensi, yaitu:

1. Kontrol akses (access control)
Dimensi ini mengatur siapa yang boleh memakai sumber daya jaringan, data, layanan, dan aplikasi. Di dalamnya ada konsep AAA, yaitu authentication, authorization, dan accounting, dimana setiap aktivitas pengguna dicatat agar bisa dipertanggungjawabkan. Sebagai contoh, pada SIAKAD kampus mahasiswa hanya bisa melihat nilainya sendiri, sedangkan dosen bisa mengisi nilai untuk kelas yang diampu saja. Pembagian hak seperti ini disebut Role-Based Access Control (RBAC).

2. Autentikasi (authentication)
Autentikasi memastikan identitas pihak yang berkomunikasi memang benar, baik itu orang, perangkat, maupun aplikasi. Ancaman utamanya adalah spoofing, yaitu memakai identitas orang lain. Sebagai contoh, login internet banking dengan username dan password lalu ditambah kode OTP atau sidik jari di smartphone.

3. Nirsangkal (non-repudiation)
Dimensi ini mencegah seseorang menyangkal tindakan yang sudah ia lakukan, karena sistem menyimpan bukti. Sebagai contoh, pembeli yang sudah mengirim pesanan lewat email atau checkout di e-commerce tidak bisa mengaku tidak pernah memesan, karena ada catatan transaksi dan tanda tangan digital.

4. Kerahasiaan data (data confidentiality)
Kerahasiaan data menjaga agar isi data tidak bisa dipahami oleh pihak yang tidak berwenang. Caranya bisa dengan enkripsi, daftar kontrol akses, dan izin file. Sebagai contoh, data pribadi nasabah di aplikasi e-wallet disimpan dalam bentuk terenkripsi sehingga tidak terbaca walaupun file basis datanya bocor.

5. Keamanan komunikasi (communication security)
Dimensi ini memastikan informasi hanya mengalir di antara dua titik yang sah dan tidak dialihkan atau disadap di tengah jalan. Ancamannya dikenal sebagai man in the middle. Sebagai contoh, penggunaan HTTPS atau VPN ketika mengakses e-learning dari Wi-Fi publik di kafe.

6. Integritas data (data integrity)
Integritas menjamin data tetap benar dan tidak diubah, dihapus, atau ditambah tanpa izin. Teknik yang dipakai seperti hash function, message authentication code, dan digital signature. Sebagai contoh, nilai mahasiswa yang sudah dikunci di sistem akademik tidak boleh berubah tanpa persetujuan pihak yang berwenang.

7. Ketersediaan (availability)
Ketersediaan memastikan pengguna yang sah tetap bisa mengakses sistem saat dibutuhkan. Gangguan bisa datang dari bencana alam, kerusakan server, sampai serangan yang disengaja seperti DoS. Pengamanannya dengan backup dan disaster recovery center (DRC). Sebagai contoh, sistem pendaftaran ujian yang down saat batas akhir pendaftaran akan merugikan banyak mahasiswa.

8. Privasi (privacy)
Privasi melindungi informasi yang bisa diketahui dari pengamatan aktivitas jaringan, seperti situs yang dikunjungi, lokasi pengguna, dan alamat IP. Sebagai contoh, penyedia internet tidak boleh membagikan riwayat situs yang dikunjungi pelanggannya kepada pihak lain.

Kedelapan dimensi ini diterapkan pada setiap lapisan dan setiap bidang keamanan. Hal ini terlihat pada penelitian Sianturi dan Ramli (2022), yang memakai X.805 bersama ISO/IEC 27001 dan NIST SP 800-161 untuk menyusun kerangka keamanan pertukaran data host-to-host di sebuah organisasi. Mereka memetakan delapan dimensi keamanan ke lima ancaman, yaitu malicious insider, denial of service, pembajakan akun dan trafik, replay attack, dan API yang tidak aman. Dari pemetaan itu, kontrol akses menjadi dimensi yang terkait dengan kelima ancaman tersebut.

Menurut saya, kelebihan X.805 adalah sifatnya yang tidak bergantung pada teknologi jaringan tertentu. Sebagai mahasiswa sistem informasi, delapan dimensi ini dapat dipakai sebagai daftar periksa ketika merancang aplikasi, agar keamanan dipikirkan sejak awal dan tidak ditambahkan belakangan secara tambal sulam.

###### Kesimpulan

Rekomendasi ITU-T X.800 dan X.805 memberikan prinsip layanan keamanan yang dibagi menjadi delapan dimensi, yaitu kontrol akses, autentikasi, nirsangkal, kerahasiaan data, keamanan komunikasi, integritas data, ketersediaan, dan privasi. X.805 kemudian menerapkan kedelapan dimensi tersebut pada tiga lapisan dan tiga bidang keamanan, sehingga keamanan jaringan dapat dilihat secara menyeluruh dari ujung ke ujung.

Sumber referensi:
- Sukoco, H., & Widiastuti, I. A. M. S. (2021). Etika profesi (MSIM4408, Edisi 1, Modul 5). Universitas Terbuka.
- Sianturi, T. M., & Ramli, K. (2022). A security framework for secure host-to-host environments. Jurnal RESTI (Rekayasa Sistem dan Teknologi Informasi), 6(3), 380-386. https://doi.org/10.29207/resti.v6i3.4018
