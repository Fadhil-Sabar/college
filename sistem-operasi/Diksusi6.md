Selamat siang, berikut jawaban saya.

> 1. Jelaskan bagaimana sistem operasi mengelola berkas dan struktur direktori untuk mengatur penyimpanan data!
> 2. Sebutkan dan jelaskan lima operasi utama yang dapat dilakukan pada berkas dalam sistem operasi!
> 3. Berikan contoh jenis-jenis berkas yang umum digunakan dalam sistem operasi beserta fungsinya!

1. Sistem operasi mengelola berkas dengan menggunakan sistem berkas, yang memiliki fungsi melakukan manajemen dan organisasi dari berbagai macam berkas di dalam sistem.
   Dalam sistemnya, sistem operasi memiliki beberapa operasi pada berkas, yaitu *create, open, write, read, close, delete, rename*.
   Kemudian untuk mengakses sebuah berkas, sistem operasi memiliki dua cara yaitu:
   > **Sequential Access**, dimana data dibaca secara urut dari satu record ke record berikutnya.
   > **Direct Access**, dimana data diakses secara acak berdasarkan blok dan nomor indeks yang dimiliki setiap berkas.
   
   Sistem operasi mengelola direktori dengan struktur *single-level, two-level* dan *hierarchical*, dan operasi yang bisa dilakukan pada direktori adalah create *a file, search a file, list of directory, rename a file, delete a file, traverse the file system*.

2. Terdapat beberapa operasi berkas pada sistem operasi yaitu:
   1. Create, operasi ini menciptakan sebuah *file* atau direktori kosong, yang kemudian sistem berkas memberikan atribut berkas seperti pemilik berkas *(owner)*, waktu dibuat *(create date)*, perizinan *(permission)* berkas.
   2. Open, operasi ini akan membuka sebuah berkas yang memerlukan nama berkas dan melakukan pengecekan apakah *user* memiliki izin *(access)* untuk mengakses berkas tersebut.
   3. Write, operasi ini akan membuka sebuah berkas yang memperlukan nama berkas yang akan ditulis dan kemudian datanya akan menjadi parameter.
   4. Read, operasi ini akan membaca sebuah berkas, yang memerlukan nama berkas, *size* atau jumlah data yang dibaca.
   5. Delete, operasi ini akan menghapus sebuah berkas, yang memerlukan nama atau direktori berkas yang ingin dihapus.
3. Jenis berkas berfungsi untuk mengenali secara otomatis program aplikasi yang sesuai, dan diidentifikasikan dengan ekstensi.
   Contoh tipe berkas:
   - zip, tar, rar, tipe file ini berfungsi untuk meng-*compress* beberapa file atau folder menjadi satu.
   - bat, sh, berfungsi untuk menyimpan serangkaian operasi atau perintah.
   - exe, com, bin, tipe berkas ini berfungsi untuk menjalankan aplikasi.
   - jpeg, gif, png, tipe file ini berupa gambar dan grafik.

Sumber referensi:
- BMP MSIM420101 Modul 6