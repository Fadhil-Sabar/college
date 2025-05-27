##### Nama: Fadhil Andriawan <br/> NIM: 053497355 <br> Prodi: Sistem Informasi <br> UPBJJ Jakarta

#### Soal nomor 1
> 1. Kemudahan dalam mengakses langsung suatu disk memberikan fleksibilitas dalam mengimplementasikan sebuah berkas. Masalah utama dalam mengimplementasi sebuah berkas yaitu bagaimana mengalokasikan berkas ke dalam disk sehingga disk dapat dimanfaatkan dengan efektif dan diakses dengan cepat. Jelaskan tiga metode utama untuk mengalokasikan ruang disk yang umum digunakan?

Terdapat 3 metode utama untuk mengalokasikan ruang disk yang umum digunakan:
1. Alokasi berdekatan *(contiguous allocation)*, pada alokasi ini setiap berkas harus menempati blok yang berdekatan pada disk. Dimana alamat disk mencatat urutan pada disk, dan urutan ini head disk bergerak hanya dari satu jalur ke satu jalur selanjutnya.
   Masalah alokasi ini adalah ketika mencari ruang baru. dimana masalah ini merupakan masalah dari dynamic storage-allocation, ketika memenuhi permintaan n dari daftar ruang yang kosong. Strategi nya adalag first fit dan best fit untuk memilih ruang kosong dari set ruang kosong yang ada. Tapi strateginya menimbulkan masalah ketika berkas dialokasikan dan dihapus, maka ruang kosong terpecah jadi kepingan kecil dan tidak dapat menyimpan data karena tidak cukup besar.
2. Alokasi *linked allocation*, alokasi ini menyelesaikan masalah yang ada pada *contiguous allocation*, dimana setiap berkas yang menggunakan *linked allocation* adalah linked list dari blok list. Setiap direktori terdapat penunjuk di bagian awal dan akhir dari berkas. Tiap blok, terdapat penunjuk untuk blok selanjutnya.
   
   Kelemahan dari alokasi ini adalah, alokasi ini berjalan efektif hanya pada *sequential access*, dimana untuk menemukan blok ke "i" dari sebuah berkas, diperlukan untuk mencari dari awal berkas sampai blok "i" ditemukan. Alokasi ini tidak efektif untuk *direct access* dari berkas dengan *linked allocation*.

3. Indexed allocation, alokasi ini mampu menyelesaikan masalah *linked allocation* yang tidak mendukung *direct access* karena penunjuk dari blok tersebar di seluruh disk dan harus diambil secara berurutan. *Indexed allocation* menyelesaikan masalah dengan membawa penunjuk pada satu lokasi, yaitu index block.
   Tiap berkas punya indeks blok masing masing dan berupa array berisi alamat blok disk. Alokasi ini bisa mendukung *direct access* karena tiap blok yang kosong di disk bisa memenuhi permintaan untuk ruang tambahan. Masalah pada alokasi ini adalah masalah tentang ruang yang terbuang.
   
#### Soal nomor 2
> 2. Sebagai seorang staff IT yang bertugas mengatur perijinan file ataudirektori di server Linux, Anda perlu memahami bagaimana mengelolapermissions untuk memastikan keamanan dan akses yang tepat.
     1. Jelaskan tiga jenis perijinan (permissions) yang dapat diterapkanpada file atau direktori di sistem operasi Linux!
     2. Bagaimana cara menggunakan perintah chmod untuk mengubahperijinan file atau direktori di Linux? Berikan contohpenggunaannya!
     3. Apa yang dimaksud dengan owner, group, dan others dalamkonteks perijinan di Linux? Jelaskan hak akses yang dapat diberikankepada masing-masing!

1. Tiga jenis perijinan di sistem operasi linux:
   1. Read, perijinan ini akan memberi otoritas kepada pengguna untuk melihat daftar direktori, membuka, dan membaca file.
   2. Write, perijinan ini memberi otoritas kepada pengguna untuk memodifikasi file. Pada perijinan ini bisa menambah, menghapus atau mengubah nama sebuah file dan direktori.
   3. Execute, perijinan ini memberi otoritas pengguna agar bisa mengeksekusi dengan sebuah program.
2. Contoh
   > chmod u+x tugas7.md
   
   Perintah chmod untuk mengubah *permission*, u+x menambahkan akses execute di user owner, dan tugas7.md nama file yang ingin diubah perijinannya.

3. Owner, group, others.
Owner, adalah user yang membuat file tersebut. Group adalah user-user yang diberikan akses sama ke file tersebut. Sedangkan others adalah user selain owner dan tidak ada di dalam group owner yang memiliki akses ke file tersebut.

   Untuk melihat kepemilikan dan perijinan dari file bisa menggunakan command `ls -l namafile`. 

   ###### Contoh hasil command
   <img src="../assets/Screenshot from 2025-05-27 10-33-33.png">

   Untuk hasilnya pada bagian kiri terdapat file permission `-rw-rw-r--`, kemudian `dhil` pertama adalah owner, `dhil` kedua adalah group owner. Lalu untuk mengubah kepemilikan bisa menggunakan perintah `chgrp` dan `chown`.

#### Soal nomor 3
> Berkas dan direktori merupakan komponen penting dalam sistem operasi yang perlu dijaga keamanannya, baik saat digunakan maupun saat terjadi kegagalan sistem.
> 1. Jelaskan metode yang digunakan sistem operasi untuk pemulihan berkas setelah terjadi kegagalan atau crash!
> 2. Sebutkan dan jelaskan beberapa mekanisme proteksi berkas yang digunakan untuk mencegah kerusakan data dalam sistem berkas!
> 3. Apa perbedaan antara pencadangan (backup) dan pemulihan (recovery) dalam konteks sistem berkas?

1. Metode yang digunakan setelah disk mengalami kerusakan adalah backup dan restore, dimana sistem program menggunakan data backup dari disk pada media penyimpanan lain.
2. Salah satu metode yang bisa digunakan adalah RAID *(Redundant Array of Independent Disks)* yaitu teknologi yang digunakan untuk fitur toleransi kesalahan pada sebuah disk atau media penyimpanan, dengan cara melakukan redundansi (penumpukan).
   Konsep utama RAID mirip dengan *mirroring*, dimana menduplikat data ke lebih dari satu hardisk, kemudian striping yaitu pemecahan data ke beberapa harddisk.
3. Perbedaannya terdapat pada definisi nya masing masing, dimana backup adalah melakukan salinan data dari sebuah disk ke disk lain. Sedangkan restore adalah mengembalikan data dari hasil backup yang sudah pernah dilakukan.

Sumber referensi:
- BMP MSIM420101 Modul 6, 7