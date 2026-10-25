Izin menanggapi diskusi sesi 6.

Virtualisasi merupakan konsep yang membagi satu komputer fisik menjadi beberapa lingkungan kerja yang berjalan bersamaan. Setiap lingkungan ini disebut virtual machine (VM) dan bisa menjalankan sistem operasinya sendiri seolah-olah memakai komputer yang terpisah. Pembagian sumber daya seperti CPU, RAM, disk, dan network adapter diatur oleh hypervisor.

1. Keuntungan virtualisasi server dibandingkan server fisik terpisah
- Biaya perangkat keras lebih rendah, karena beberapa server cukup dijalankan di satu mesin fisik.
- Backup dan recovery lebih mudah, karena setiap VM tersimpan dalam bentuk file yang bisa disalin dan dipindahkan.
- Deployment lebih cepat, karena server baru cukup dibuat sebagai VM tanpa membeli mesin baru.
- Pemakaian listrik dan panas berkurang, begitu pula kebutuhan ruang untuk menyimpan server.
- Pemeliharaan dan pengelolaan lebih mudah karena terpusat di satu host.
- Perangkat keras virtual menjadi seragam (standar), sehingga penggantian atau pemindahan server lebih mudah.

2. Peran sistem operasi server di lingkungan virtual
Sistem operasi bertugas mengelola sumber daya perangkat keras dan menjalankan perangkat lunak lain. Di lingkungan virtual, sistem operasi server dipasang di dalam VM sebagai guest OS, seperti Ubuntu Server. Sistem operasi inilah yang menyediakan layanan jaringan bagi pengguna, seperti DHCP untuk pembagian alamat IP otomatis, DNS untuk menerjemahkan nama domain ke alamat IP, web server untuk menyajikan situs, dan FTP untuk unggah dan unduh file (Arifin & Nugroho, 2020). Karena setiap VM punya sistem operasi sendiri, satu layanan bisa ditempatkan di satu VM. Jika satu layanan bermasalah, layanan di VM lain tidak ikut terganggu.

3. Tantangan implementasi virtualisasi
- Satu titik kegagalan: jika host fisik rusak, semua VM di dalamnya ikut mati.
- Kebutuhan spesifikasi tinggi: host harus cukup kuat menjalankan hypervisor dan banyak VM sekaligus.
- Perebutan sumber daya: VM yang boros CPU atau RAM bisa memperlambat VM lain.
- Keamanan: celah pada hypervisor atau konfigurasi jaringan virtual yang salah dapat berdampak ke banyak VM.
- Biaya lisensi dan kompetensi SDM: sebagian hypervisor berbayar, dan tim TI perlu belajar cara mengelolanya.

4. Solusi
- Menyediakan backup otomatis dan berkala, serta menerapkan failover atau clustering agar VM bisa dipindah ke host lain saat terjadi gangguan.
- Merencanakan kapasitas sejak awal, yaitu menghitung kebutuhan RAM, CPU, dan disk setiap VM lalu menyediakan host dengan kapasitas lebih besar dari kebutuhan minimal.
- Membatasi alokasi sumber daya per VM dan memantau kinerjanya secara rutin.
- Memperbarui hypervisor dan guest OS secara berkala, serta memisahkan jaringan virtual sesuai fungsi (bridge, NAT, atau host-only).
- Memilih hypervisor sesuai anggaran (Proxmox atau VirtualBox untuk opsi gratis, VMware atau Hyper-V untuk opsi berlisensi) dan memberi pelatihan kepada tim TI.

5. Contoh penerapan
Sebuah perusahaan sebelumnya memakai tiga server fisik untuk web, DNS, dan DHCP. Setelah virtualisasi, ketiganya dipindahkan ke satu server fisik yang menjalankan hypervisor seperti VMware atau Proxmox. Di atasnya dibuat tiga VM berbasis Ubuntu Server, masing-masing menjalankan satu layanan. VM dihubungkan ke jaringan kantor dengan mode bridge supaya bisa diakses komputer karyawan. Snapshot dan backup VM dijadwalkan setiap hari, dan disiapkan host kedua sebagai cadangan failover. Dengan cara ini, perusahaan menghemat biaya perangkat keras, listrik, dan ruang, sementara layanan tetap berjalan terpisah.

Sumber referensi
- Arifin, Z., & Nugroho, K. (2020). Dasar infrastruktur teknologi informasi (Edisi 1, Modul 5: Implementasi Virtualisasi dan Sistem Operasi). Universitas Terbuka.
