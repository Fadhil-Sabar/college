Selamat malam, berikut untuk jawaban saya.

Kegagalan proyek "E-Gov Smart City" Kota X sebenarnya bisa dicegah jika manajemen risiko diterapkan sejak awal, baik dengan menggunakan pendekatan reaktif untuk mengatasi masalah yang sudah muncul maupun pendekatan proaktif untuk mencegah masalah sebelum terjadi.

Berikut adalah analisis langkah-langkah yang seharusnya dilakukan untuk mengidentifikasi, memperkirakan, dan mengelola risiko menggunakan strategi tersebut:
1. Identifikasi resiko dan jenis resiko perangkat lunak
- Resiko teknis, resiko seperti masalah kompatibilitas seperti komputer lama tidak mampu menjalankan sistem baru, performa & skalabilitas dimana sistem crash saat diakses ribuan pengguna secara bersamaan karena arsitektur tidak siap menangani beban real-time.
- Resiko proyek, resiko seperti spesifikasi proyek terus berubah dan membengkak karena permintaan fitur tambahan dari pemerintah tanpa kontrol timeline. Lalu miskomunikasi karena kegagalan ebutuhan pengguna akhir (end-user) akibat buruknya jalur komunikasi antara vendor dan pemangku kepentingan.
- Resiko bisnis, kegagalan proyek memberikan dampak negatif terhadap keuangan. Dana yang seharusnya menjadi manfaat malah menjadi sia sia karena proyek yang tidak berlangsung.

Untuk identifikasi resiko sejak awal, bisa dilakukan dengan mengkategorikan kedalam dua resiko yaitu resiko umum dan resiko khusus. Salah satu metodenya adalah dengan menggunakan check list pada resiko yang mungkin akan terjadi seperti:
- Ukuran proyek perangkat lunak untuk semua jenis device
- Dampak bisnis seperti tantangan dari manajemen dan pasar
- Karakteristik stakeholder terkait kemungkinan penambahan fitur terus menerus

2. Strategi Pengelolaan Risiko Proaktif dan Reaktif
A. Strategi Proaktif (Pencegahan di Awal)
- Mengatasi Risiko Teknis (Kompatibilitas & Performa):
Vendor melakukan pre-deployment audit (pemeriksaan awal) ke komputer instansi sebelum arsitektur dibuat. Sistem dirancang menggunakan arsitektur Microservices dan berbasis web (thin-client) agar ringan dijalankan di komputer lama, serta menggunakan auto-scaling cloud untuk menahan lonjakan ribuan pengguna.

- Mengatasi Risiko Proyek
Membuat Change Control Procedure yang ketat dalam kontrak. Setiap ada permintaan fitur baru, pemerintah harus menandatangani adendum konsekuensi penambahan waktu/biaya.

Menggunakan metodologi Agile Development seperti Scrum dengan melakukan Review Meeting setiap 2 minggu bersama perwakilan pengguna akhir untuk memastikan kesesuaian fitur.

- Mengatasi Risiko Bisnis (Kerugian Finansial):
Menerapkan pengembangan berbasis Minimum Viable Product (MVP). Sistem diluncurkan per modul, bukan sekaligus di akhir bulan ke-18. Jika ada kegagalan, dana tidak langsung habis sia-sia.

B. Strategi Reaktif (Rencana Kontingensi saat Masalah Terjadi)
- Ketika Masalah Performa Terjadi di Bulan ke-12:
Tim teknis langsung melakukan database indexing refactoring, mengaktifkan sistem caching (seperti Redis), dan membatasi kuota akses simultan per menit untuk mencegah crash total.

- Ketika Regulasi Menolak Sistem karena Masalah Keamanan:
Menghentikan sementara perilisan fitur baru, lalu membentuk tim khusus untuk melakukan enkripsi pada database dan melakukan penetration testing ulang demi memenuhi standar otoritas siber nasional.

Kegagalan proyek tersebut disebabkan dari akumulasi risiko teknis, proyek, dan bisnis yang diabaikan sejak fase perencanaan. Dari kegagalan ini, dapat disimpulkan beberapa poin penting sebagai pembelajaran:
- Pentingnya keseimbangan strategi, manajemen resiko seharusnya dilakukan dengan pendekatan proaktif, seperti melakukan beberapa hal yang disebutkan di atas.
- Skalabilitas, proyek berskala besar yang memiliki target waktu dinamis lebih aman dikelola dengan metodolagi agile. Peluncuran sistem per modul dapat memitigasi risiko bisnis berupa kerugian finansial total, sekaligus memberikan ruang evaluasi berkala bersama pemangku kepentingan.
- Aspek non fungsional, keamanan data dan regulasi menjadi pilar utama dalam sistem pemerintahan. engabaikan aspek ini sejak awal arsitektur dibuat akan berakibat fatal pada penolakan sistem oleh otoritas siber dan hilangnya kepercayaan masyarakat secara permanen.

Secara keseluruhan, integrasi antara identifikasi risiko yang akurat melalui checklist dan eksekusi strategi pengelolaan yang disiplin adalah penentu utama apakah sebuah proyek digitalisasi pemerintahan akan menjadi percontohan nasional atau berakhir sebagai kegagalan implementasi.

Sumber referensi:
- BMP MSIM4303 Modul 8