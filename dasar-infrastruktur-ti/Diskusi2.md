Komponen perangkat keras apa saja yang harus dipersiapkan?
Bagaimana peran sistem storage dalam menjaga kinerja dan keamanan data?G
Mengapa perangkat jaringan menjadi bagian penting dalam infrastruktur TI?

Komponen perangkat keras sendiri merupakan bagian dari komputer yang menjadi inti dari komputer itu sendiri. Pada awalnya komputer diciptakan untuk membantu perhitungan atau compute, yang mengolah input menjadi output. Kemudian pada akhirnya berkembang hingga saat ini.

Pada studi kasus yang dilakukan di sebuah klinik kecantikan dengan berbasis Kernel-based Virtual Machine (Adhiwibowo, 2013) didapatkan beberapa informasi.

> Komponen perangkat keras apa saja yang harus dipersiapkan?

Komponen perangkat keras yang harus disiapkan ada beberapa yaitu:
1. Komputer server, dimana komputer server ini berfungsi untuk menjalankan sistem operasi melalui virtualisasi dan menampung semua mesin virtual.
2. Storage, penyimpanan yang digunakan sebesar 80 GB untuk menyimpan sistem operasi, basis data maupun file aplikasi.
3. Perangkat jaringan, perangkat ini digunakan untuk menghubungkan server, mesin virtual dan seluruh office. Perangkatnya berupa Switch hub untuk menghubungkan keseluruhan server.

> Bagaimana peran sistem storage dalam menjaga kinerja dan keamanan data?

Peran pertama adalah sebagai objek yang harus diamankan sebelum perubahan sistem. Ketika instalasi, proxmox menghapus dan memformat ulang seluruh isi hardisk secara otomatis, sehingga backup seluruh data server menjadi prasyarat mutlak. Sehingga perannya terletak pada urutan prosedur storage tersebut.

Peran kedua, sebagai penentu kinerja melalui pembagian kapasitas. Hardisk 80 GB dibagi menjadi 16 GB untuk VPS1 dan 32 GB untuk VPS2. Sehingga kedua alokasi tersebut menghabiskan 48 GB, sehingga sekitar 32 GB tersisa untuk sistem operasi virtualisasi dan keperluan lain. Pembagian ini mencerminkan perbedaan bobot sistem, di mana sistem baru memperoleh ruang dua kali lebih besar daripada sistem lama.

> Mengapa perangkat jaringan menjadi bagian penting dalam infrastruktur TI?

Pada infrastruktur ini, jaringan menjadi kendali utama pada keseluruhan infrastruktur vritual. Proxmox diakses dari browser ke IP server melalui port 8006. Dari sini menunjukkan bahwa semua pekerjaan seperti pembuatan virtual machine, instalasi ISO dan pemantauan koneksi dilakukan melalui jaringan.

Lalu jaringan menjadi penting sebagai jalur distribusi ke pengguna operasional. Desain LAN digunakan untuk menghubungkan seluruh server ke tiga titik kerja yaitu front office, kasir dan back office.

Jaringan menjadi penting juga sebagai batas keamanan, pada studi kasus tersebut jaringan dibuat dalam koneksi yang tertutup tidak terhubung ke internet maupun wifi sehingga memperkecil kemungkinan untuk terjadinya hack dari jaringan luar.

Sumber referensi:
- Adhiwibowo, W. (2013). Kernel-based virtual machine untuk virtualisasi database sebagai solusi kebutuhan perangkat keras studi kasus implementasi sistem informasi klinik kecantikan. Jurnal Transformatika, 10(2), 89–98. https://doi.org/10.26623/transformatika.v10i2.74
- BMP MSIM4304 Modul 2
