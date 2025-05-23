#### File System (Sistem Berkas)

Data yang ada pada perangkat penyimpanan memiliki bentuk berupa berkas/files.
Untuk menyimpan dan mengambil berkas, OS menyediakan mekanisme yang disebut sistem berkas, yang bertanggung jawab untuk melakukan manajemen dan organisasi dari berbagai macam berkas di dalam sistem.

Dua komponen utama sistem berkas, **kumpulan dari berkas** dan **struktur direktori**.
> Kumpulan berkas: tempat untuk menyimpan data
> Struktur direktori: menyediakan informasi tentang semua berkas di dalam sistem

A. Berkas: konsep dasar
> Berkas adalah kumpulan dari berbagai macam data yang saling berhubungan dan diberi nama pada perangkat penyimpanan.

B. Berkas: atribut pada berkas
Penamaan bisa berupa karakter, numerik atau sebagian simbol.
> 1. Nama (name)
> 2. Ukuran (size)
> 3. Tipe (type)
> 4. Pengidentifikasi (identifier)
> 5. Lokasi (location)
> 6. Tanggal dan waktu (date and time)
> 7. Proteksi (protection)

C. Berkas: operasi pada berkas
> 1. Create
> 2. Open
> 3. Write
> 4. Read
> 5. Close
> 6. Delete
> 7. Rename

D. Berkas: jenis berkas
OS bisa menangani berkas secara tepat jika sistem mengenali dan mendukung tipe dari berkas tersebut.
Teknik yang umum digunakan, dengan ekstensi dari file.
> Ekstensi berkas punya panjang 1-3 karakter, mengindikasikan tipe dari berkas dan operation (read, write, execute).

Contoh, `test.txt`.

E. Berkas: struktur berkas
> Mengacu pada struktur internal dari berkas, gimana berkas disimpen di dalam sistem.

1. **Byte Sequence**, setiap berkas teridiri dari rangkaian 8-bit byte yang tidak punya struktur yang tetap. Struktur jadi tanggung jawab program untuk menafsirkan berkas ke struktur yang tepat.
2. **Record Sequence**, terdiri dari rangkaian record dengan panjang yang tetap, nomor record dapat dibaca atau ditulis oleh berkas.
3. **Tree Structure**, berkas terdiri dari pohon blok disk. Tiap blok memegang nomor dari record yang punya panjang bervariasi. Tipe ini digunakan untuk sistem mainframe, biasas disebut ISAM (Indexed Sequential Access Method).

F. Berkas: akses berkas
> Informasi yang disimpan pada berkas bisa diakses dengan dua cara.

1. **Sequential Access**, diakses dengan urutan satu record setelah record lain.
2. **Direct Access**, dengan size disk yang makin besar, akses dengan sequential jadi panjang dan lama. Data disimpan dalam bentuk blok dan nomor indeks yang akan membantu membaca dan menulis data ke disk dengan urutan yang bebas **(random atau direct access)**.

G. Berkas: tipe akses
> Cara melindungi berkas adalah dengan membatasi hak akses pada berkas tersebut.

Akses operasi berkas:
1. Read
2. Write
3. Execute
4. Append
5. Copy
6. Rename
7. Edit
8. Delete

H. Berkas: akses kontrol berkas
1. Kata sandi / password
2. Akses kontrol list / access control list.
   > Versi terbatas dari akses list mengelompokkan pengguna sistem ke tiga kategori.
   1. Owner
   2. Group
   3. Universe

I. Direktori
