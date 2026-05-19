NIM: 053407355

Nama: Fadhil Andriawan


> Jika kita perhatikan, pada setiap perangkat mobile terdapat aplikasi/tempat untuk memutar file audio dan video dengan format .mp3 dan .mp4.
> - Jelaskan tentang variasi menu yang terdapat pada aplikasi tersebut!
> - Carilah kelemahan manipulasi langsung mungkin muncul didalamnya dan tuliskan!
> - Buatlah rancangan prosedur/cara untuk memperbaiki kelemahan pada aplikasi tersebut.

![alt text](./shapes%20at%2026-05-16%2014.18.16.png)

##### Aplikasi Pemutar Musik
Untuk aplikasi yang saya gunakan disini adalah mi music, dimana ini merupakan aplikasi bawaan xiaomi untuk memutar file mp3.

Pada aplikasi tersebut terlihat beberapa variasi menu.

Ketika sedang memainkan music terlihat beberapa fitur ini:
- Tombol panah bawah, menu berbasis ikon
- Tombol ikon baju, menu berbasis ikon
- Tombol titik 3, menu tarik yang memunculkan opsi pada gambar kedua
- Tombol bintang, menu berbasis ikon
- Progress bar music, menu penggeser
- Tombol ulangi, menu berbasis ikon
- Tombol play, menu berbasis ikon
- Tombol previous dan next, menu berbasis ikon
- Tombol daftar menu, menu berbasis ikon
- Tombol di dalam gambar kedua pada menu tarik, berisi menu berbasis icon

![alt text](./shapes%20at%2026-05-16%2014.19.32.png)


##### Aplikasi Pemutar Video

Aplikasi yang saya gunakan adalah galeri bawaan dari xiaomi.

Pada aplikasi ini terdapat beberapa menu dan jenisnya.
- Tombol arah panah kiri, menu berbasis icon
- Tombol rotasi, menu berbasis icon
- Tombol suara, menu berbasis icon
- Tombol play, menu berbasis icon
- Tombol titik tiga, menu tarik atau dropdown

Lalu ketika tombol titik tiga ditekan akan muncul opsi additional settings:
- Tombol loop one, menu biner
- Playback speed, menu tarik

Ketika tombol playback speed ditekan memunculkan opsi gambar ketiga:
- Pilihan speed, menu combo box atau kotak kombo


##### Kelemahan

Pada aplikasi pemutar audio terdapat beberapa kelemahan yaitu:
- Pada bagian progress bar ukurannya terlalu kecil hingga sulit untuk digeser dan jari akan menutupi bagian tersebut
- Ikon seperti play, previous dan next yang terlalu kecil dan berdekatan memungkinkan untuk salah tekan
- Tombol bintang atau favorit yang mudah tertekan tidak sengaja karena posisinya dekat tombol lain

Pada aplikasi pemutar video terdapat beberapa kelemahan yaitu:
- Tombol rotai yang dipicu tombol ikon bisa bentrok dengan sensor auto-rotate perangkat, menyebabkan tampilan berputar dua kali atau malah kembali ke orientasi asal secara tiba-tiba
- Tombol playback speed hanya berupa nilai tetap, tidak ada slider sehingga pengguna tidak bisa memilih kecepatan di antaranya
- Ketika menu combo box playback speed muncul, tidak ada preview langsung, jadi pengguna harus trial-and-error

##### Prosedur perbaikan

Untuk perbaikan pada aplikasi pemutar audio agar lebih baik untuk digunakan yaitu:
- Memperbesar area sentuh progress bar minimal 48x48 px agar lebih mudah untuk ditekan, terutama pada perangkat yang kecil
- Menambah bubble preview di atas jari saat melakukan scrubbing, menampilkan timestamp yang dituju agar tidak tertutup jari
- Menambah jarak minimal 8 px antar tombol dan pastikan setiap tombol memiliki touch target minimal 48x48 px
- Memindahkan posisi tombol bintang agar tidak terlalu dekat dengan tombol utama

Untuk perbaikan pada aplikasi pemutar video yaitu:
- Saat pengguna menekan tombol rotasi manual, nonaktifkan sementara auto-rotate sensor selama sesi video berlangsung agar tidak bentrok dan membuat pengguna kessulitan
- Mengimplementasikan geser jari ke atas/bawah di sisi kiri layar untuk mengatur volume secara langsung tanpa menekan tombol apapun, sehingga akan memudahkan pengguna dalam mengontrol secara presisi
- Untuk playback speed, ganti combo box dengan slider kontinu dari 0.25x hingga 2.0x serta ada titik snap untuk beberapa preset untuk memudahkan pengguna
- Memindahkan Loop dan Playback Speed ke layar utama pemutar sebagai kontrol yang selalu terlihat dan pengguna bisa melihat hasil tanpa harus kembali ke video dahulu

##### Kesimpulan

Berdasarkan analisis dua aplikasi tersebut, bisa disimpulkan bahwa kedua aplikasi tersebut telah menyediakan berbagai variasi menu yang cukup lengkap untuk mendukung aktivitas pemutaran file audio dan video. 

Akan tetapi terdapat beberapa kelemahan dalam aspek manipulasi langsung seperti ukuran area sentuh yang terlalu kecil, penempatan tombol yang kurang ergonomis, serta keterbatasan kontrol pada fitur tertentu seperti playback speed dan rotasi layar. 

Kelemahan-kelemahan tersebut dapat diperbaiki melalui berbagai pendekatan, antara lain memperbesar touch target, menambahkan umpan balik visual yang lebih jelas, menerapkan kontrol berbasis gestur, serta menampilkan fitur-fitur penting secara langsung di layar utama tanpa perlu melalui menu tersembunyi.

Sumber referensi:
- BMP MSIM4208 Modul 6