NIM: 053497355

Nama: Fadhil Andriawan

##### Pertanyaan nomor 1

> 1. Identifikasi minimal 5 kebutuhan fungsional yang harus dimiliki oleh
sistem marketplace ini.
> 2. Sebutkan minimal 3 kebutuhan non-fungsional yang penting untuk sistem
ini.
> 3. Analisis dampak jika salah satu kebutuhan tersebut tidak terpenuhi

1. Kebutuhan fungsional

Kebutuhan fungsional merupakan kebutuhan terkait fungsi sebuah produk seperti sistem harus mampu mencetak laporan, menampilkan grafik atau fungsi yang lainnya.

Berdasarkan kasus tersebut kasus kebutuhan fungsionalnya adalah
- Pengguna dapat melakukan registrasi
- Pengguna dapat melihat produk
- Pengguna dapat membeli produk
- Sistem dapat menyimpan data pelanggan
- Sistem dapat menampilkan produk
- Pengguna dapat menambahkan ke keranjang
- Pengguna dapat melakukan pemesanan
- Sistem dapat menyediakan pembayaran
- Pengguna dapat memberikan review produk

2. Kebutuhan non fungsional
- Kebutuhan dokumentasi user manual, untuk menjelaskan cara penggunaan aplikasi
- Kebutuhan pendukung, untuk menangani pengajuan refund atau komplain dari pengguna
- Kebutuhan Deployment, diperlukan untuk menentukan spesifikasi yang diperlukan untuk menjalankan aplikasi ini tergantung dari load nya

3. Dampak
Jika salah satu dari kebutuhan fungsional tidak terpenuhi, maka akan terjadi kebingungan dari sisi pengguna. Bayangkan saja kita ada di posisi pengguna, jika salah satu fitur untuk menambahkan keranjang, melakukan pembayaran atau mereview produk tidak ada, maka user akan menjadi bingung dan berpotensi pengguna beralih ke platform lain.

Jika salah satu dari kebutuhan non fungsional tidak terpenuhi, maka akan terjadi hal yang sama. Jika tidak ada dokumentasi maka user yang tidak terlalu paham akan kesulitan dalam beradaptasi. Begitu juga dengan kebutuhan lainnya, harus ada penanganan terkait keluhan atau komplain, karena ada kemungkinan aplikasi tidak berjalan mulus.

##### Pertanyaan nomor 2
![alt text](./Tugas%202%20Use%20Case.drawio.png)
![alt text](./Activity%20diagram.drawio.png)
![alt text](./Sequence%20diagram.drawio.png)

##### Pertanyaan nomor 3
1. Apakah perlu?

Menurut saya, ketiga diagram tersebut diperlukan karena semuanya dibutuhkan apalagi untuk project skala besar seperti ini.

- Use case diagram, diagram ini memiliki fungsi untuk menyamakan persepsi antara tim pengembang dan klien tentang siapa yang bertanggung jawab atas apa, sebelum kode ditulis. Untuk marketplace yang punya banyak aktor seperti pelanggan, penjual, admin, dan bank, diagram ini sangat membantu menghindari kesalahpahaman di kemudian hari.
- Activity diagram, diagram ini penting untuk menggambarkan alur yang kompleks, misalnya proses pemesanan hingga pengiriman barang. Developer bisa langsung melihat logika percabangan yang terjadi, seperti apa yang harus dilakukan sistem jika pembayaran gagal atau jika stok barang habis.
- Sequence diagram, diagram ini penting untuk marketplace karena melibatkan komunikasi antar sistem yang berbeda, seperti Payment Gateway dan bank. Backend developer sangat membutuhkan diagram ini saat mengintegrasikan API dari pihak ketiga, agar urutan komunikasi antar sistem tidak salah dan tidak menimbulkan error.

2. Fitur refund otomatis
Jika ada fitur refund otomatis maka akan terdapat beberapa tambahan di diagram berikut.

- Sequence diagram baru, diagram ini berfungsi untuk menggambarkan komunikasi antara pelanggan - marketplace - bank - payment gateway ketika refund otomatis. Diagram perlu dipisah karena alurnya berbeda dari transaksi biasa.
- Activity diagram, perlu dibuatkan logika percabangan refund seperti apakah refund memenuhi syarat, berapa lama proses verifikasi, apakah pengembalian dana sebagian atau sepenuhnya.
- Use case diagram, diagram ini perlu dibuat karena pada diagram sebelumnya, belum ada step by step seperti ini:
Pesanan dibuat - dibayar - diproses - dikirim - selesai - refund diajkuan- diverifikasi - dana dikembalikan.

Sehingga dalam kasus ini perlu disesuaikan diagram diagram tersebut untuk mengakomodir fitur yang baru.

Sumber referensi:
- BMP MSIM4303 Modul 2 - 5