Nama: Fadhil Andriawan

NIM: 053497355

Prodi: Sistem Informasi

1. Dalam perancangan tampilan, terdapat lima langkah urutan perancangan. Berdasarkan lima langkah urutan tersebut, rancanglah sebuah sistem berbasis pengisian borang (formulir) untuk menyimpan data buku pada suatu perpustakaan.

Dalam melakukan rancangan terdapat 5 urutan perancangan, yaitu:
- Pemilihan ragam dialog
Ragam dialog yang dipilih adalah form-fill interface (Antarmuka pengisian formulir), karena kebutuhan utama adalah input data buku yang terstruktur (judul, pengarang, tahun, dll.). Formulir memungkinkan pengguna mengisi data secara sistematis, mudah divalidasi, dan familiar bagi pustakawan.

Contoh ragam dialog pendukung:
    - menu dialog untuk navigasi antar form seperti tambah, edit, cari, hapus
    - confirmation dialog untuk konfirmasi simpan data

- Perancangan struktur dialog
Struktur dari dialog yang dirancang yaitu menggunakan hierarki sekuensial dengan percabangan sederhana. 

Alur dialog:
1. Menu utama memilih opsi:
    1. Tambah buku
    2. Lihat semua buku
    3. Cari buku
    4. Keluar
2. Tambah buku baru:
    1. Fromulir input data buku
    2. Validasi input
    3. Jika sukses simpan ke database
    4. Menampilkan pesan sukses
    5. kembali ke menu utama. Jika gagal: tampilkan pesan error
    6. Ulangi input field yang salah
3. Lihat semua buku:
    1. Tampilkan daftar buku dalam bentuk tabel
    2. Tekan tombol kembali
4. Cari buku:
    1. Input kata kunci
    2. Tampilkan hasil pencarian

- Perancangan format pesan
Untuk perancangan format pesan, menggunakan prinsip berikut:
    - Singkat, jelas, dan konsisten.
    - Setiap label field mudah dipahami.
    - Gunakan warna atau simbol untuk status (sukses/gagal/info).

Contoh dari format pesan pada formulir:
Form Tambah Buku Perpustakaan

Judul Buku      : ...

Pengarang       : ...

Penerbit        : ...

Tahun Terbit    : ...  (contoh: 2025)

Jumlah Halaman  : ... 

ISBN            : ...

Kategori        : ([ ] Fiksi  [ ] Non-fiksi  [ ] Referensi)


Pesan konfirmasi:
Data buku "Pemrograman Dasar" berhasil disimpan.

Pesan validasi gagal:
Terjadi kesalahan:
- Tahun terbit harus 4 digit angka.
- ISBN wajib diisi.

- Perancangan penanganan kesalahan
Perancangan penanganan kesalahan pada sistem formulir penyimpanan data buku perpustakaan dirancang untuk meminimalkan kehilangan data dan memberikan umpan balik yang jelas kepada pengguna. Beberapa jenis kesalahan yang ditangani meliputi:
- Kesalahan field kosong (misalnya judul buku, pengarang, atau ISBN tidak diisi) akan terdeteksi melalui validasi client-side sebelum data dikirim. Sistem akan menampilkan pesan berwarna merah di bawah field yang kosong, serta memfokuskan kursor ke field pertama yang bermasalah, sehingga pengguna segera tahu bagian mana yang perlu diperbaiki.
- Kesalahan format input seperti tahun terbit yang bukan angka 4 digit, jumlah halaman yang berisi huruf, atau ISBN yang panjangnya tidak sesuai standar akan dicek secara bersamaan saat tombol simpan ditekan. Setiap kesalahan akan disebutkan secara spesifik, misalnya: "Tahun terbit harus diisi dengan 4 digit angka", dan data lain yang sudah diisi dengan benar akan tetap dipertahankan agar pengguna tidak perlu mengulang dari awal.
- Kesalahan koneksi database atau waktu habis (timeout) akan ditangani dengan menampilkan pesan yang baik seperti "Gagal menyimpan data karena masalah jaringan atau server. Silakan periksa koneksi Anda dan coba lagi." Selain itu, sistem akan mencatat kesalahan tersebut ke dalam log error untuk keperluan pemeliharaan, namun tidak menampilkan detail teknis langsung ke pengguna.

Dengan pendekatan ini, pengguna dapat dengan mudah memperbaiki kesalahan tanpa kehilangan data yang sudah diisi, sekaligus mendapatkan pesan yang informatif dan tidak membingungkan.

- Perancangan struktur data
Dalam merancang struktur data untuk sistem perpustakaan, akan mencakup perancangan table database dan representasi data pada formulir. Berikut strukturnya:
- Di database relasional, tabel buku memiliki id_buku (INT, PK, auto-increment), isbn (VARCHAR(20), UNIQUE, NOT NULL), judul (VARCHAR(255), NOT NULL), pengarang (VARCHAR(100), NOT NULL), penerbit (VARCHAR(100), opsional), tahun_terbit (YEAR(4)), jumlah_halaman (INT(5)), kategori (ENUM 'Fiksi', 'Non-fiksi', 'Referensi'), dan created_at (TIMESTAMP, otomatis). 
- Struktur data pada sisi klien (client-side) direpresentasikan dalam bentuk JSON seperti:

{ "isbn": "978-602-04-1234-5", "judul": "Belajar Pemrograman Web", "pengarang": "Ahmad S", "penerbit": "Gramedia", "tahun_terbit": 2024, "jumlah_halaman": 350, "kategori": "Non-fiksi" }

Struktur ini memudahkan proses validasi, pengiriman data ke server, serta penyimpanan sementara sebelum data disimpan secara permanen.

- Batasan dan aturan data, memiliki aturan ISBN unik, judul & pengarang wajib, tahun ≤ tahun berjalan, halaman > 0. Untuk SQLite/JSON, tahun disimpan sebagai string YYYY dan kategori sebagai string biasa.

Sehingga dengan struktur data yang jelas, proses penyimpanan, pencarian, pembaruan, dan penghapusan data buku dapat dilakukan secara akurat dan efisien, serta memudahkan pengembangan fitur tambahan di masa depan seperti laporan atau statistik koleksi perpustakaan.

2. Terdapat enam aspek penting untuk menciptakan lingkungan kerja yang nyaman. Apakah tempat lingkungan kerja Anda sekarang sudah sesuai dengan enam aspek penting tersebut? Silakan jelaskan dengan lengkap!

Di lingkungan tempat saya bekerja, terdapat beberapa aspek yang belum memenuhi dan ada pula yang sudah terpenuhi.
- Aspek ergonomik dari stasiun kerja
Dari segi ergonomik, lingkungan kerja saya belum benar benar memenuhi aspek ini. 
    - Posisi keyboard, karena di tempat kerja menggunakan laptop sehingga posisi keyboard sejajar dengan meja
    - Posisi monitor, begitu pula dengan posisi monitor karena berupa laptop sehingga sedikit menunduk
    - Posisi telapak tangan, posisi telapak tangan dan tangan tidak selalu lurus karena posisi yang tidak ergonomik
    - Siku belum sesuai dengan ilustrasi stasiun kerja pada Modul 9.32 MSIM4208.

- Pencahayaan
Dari segi pencahayaan, tempat kerja saya sudah cukup nyaman karena tidak membelakangi atau menghadap ke sumber cahaya seperti langit atau matahari, juga disertakan penutup jendela agar tidak terkena cahaya serta sudah sesuai dengan gambar 9.19.


- Kualitas udara
Kualitas udara tergolong cukup baik karena AC menyala dan ada exhaust fan untuk menarik udara dan memasukkan udara bersih ke dalam.

Akan tetapi suhu terkadang menjadi masalah, di momen ketika sering hujan seringkali cuaca terlalu dingin sehingga mengganggu pekerjaan dan fisik. Adakalanya AC bermasalah sehingga suhu menjadi sangat panas dan tidak nyaman.

- Gangguan suara
Gangguan suara dari luar sangat minim, kecuali di beberapa moment karena terletak di pinggir jalan raya utama, sehingga sesekali ada suara yang masuk.

- Kesehatan dan keamanan kerja
Untuk device yang digunakan sudah sesuai dengan aspek kesehatan dan keamanan kerja. Komputer pribadi maupun dari kantor sudah memiliki layar yang tersertifikasi, sehingga menjadikan layar aman untuk dilihat lama.

- Kebiasaan bekerja
Dalam keseharian bekerja, saya seringkali dalam posisi tegang yang menyebabkan otot saya menjadi lelah, saya juga sering mengetik dalam jangka waktu yang lama secara tidak sadar. Sehingga aspek ini saya rasa belum sepenuhnya diterapkan di lingkungan kerja saya.

Sumber referensi:
- BMP MSIM4208 Modul 8-9