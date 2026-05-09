Nama: Fadhil Andriawan

NIM: 053497355

> 1. Dalam pengembangan perangkat lunak, tahapan rekayasa yang baik sangat penting untuk keberhasilan proyek. Jelaskan mengapa tahapan rekayasa perangkat lunak yang terstruktur diperlukan dan apa dampaknya jika tahapan tersebut diabaikan? Berikan contoh nyata dari proyek perangkat lunak yang berhasil atau gagal akibat perencanaan yang baik atau buruk.

Rekayasa perangkat lunak berarti pembangunan dengan menggunakan prinsip atau konsep rekayasa yang memiliki tujuan untuk menghasilkan perangkat lunak bernilai ekonomi maupun manfaat secara efisien menggunakan komputer.

Fokus utama pada rekayasa perangkat lunak adalah pada fokus dengan kriteria:
- Maintainability, artinya program terus dipelihara
- Dependability dan robust, artinya dapat diandalkan dengan proses bisnis yang ada
- Efisien dari segi sumber daya
- Usability, mampu dipakai sesuai kebutuhan

Tahapan rekayasa perangkat lunak yang terstruktur mutlak diperlukan karena seluruh fase tersebut saling terintegrasi untuk menjamin terciptanya sistem yang efisien dalam penggunaan sumber daya, mudah dipelihara di masa depan (maintainability), kuat terhadap ancaman dalam proses bisnis (dependability), dan tepat sasaran bagi pengguna (usability).

Jika tahapan ini diabaikan, maka akan berdampak langsung pada kegagalan dalam memenuhi kriteria tersebut, menghasilkan aplikasi dengan hutang teknis yang menumpuk, boros biaya infrastruktur dan rentan terhadap kegagalan operasional seperti pada kasus sistem IT Horizon di Kantor Pos Inggris, sementara penerapan fase yang disiplin sejak desain hingga pengujian terbukti mampu menghasilkan sistem berskala masif namun tetap stabil dan sangat andal seperti pada keberhasilan arsitektur awal WhatsApp.

> Anda sedang mengembangkan sistem informasi akademik untuk universitas. Identifikasi minimal 5 kebutuhan utama sistem berdasarkan perspektif: (1) Mahasiswa, (2) Dosen, dan (3) Administrasi Universitas. Jelaskan mengapa kebutuhan tersebut penting dan bagaimana pengaruhnya terhadap kinerja sistem secara keseluruhan.

Dalam rekayasa perangkat lunak, tahap analisis kebutuhan (requirements analysis) merupakan tahap yang sangat krusial sebelum sistem dikembangkan. Kebutuhan sistem harus diidentifikasi dari sudut pandang seluruh stakeholder yang terlibat. Dalam konteks Sistem Informasi Akademik (SIAKAD) universitas, terdapat tiga kelompok pengguna utama yaitu mahasiswa, dosen, dan administrasi universitas.

##### 1. Kebutuhan fungsional adalah kebutuhan yang menjelaskan fungsi-fungsi apa saja yang harus dimiliki oleh sistem.

Perspektif Mahasiswa:
- Sistem harus menyediakan fitur daftar mata kuliah secara online
- Sistem harus menampilkan nilai dan transkrip akademik secara real-time
- Sistem harus menyediakan informasi jadwal kuliah dan ujian

Perspektif Dosen:
- Sistem harus menyediakan fitur input dan pengelolaan nilai mahasiswa
- Sistem harus menyediakan fitur pencatatan absensi digital per pertemuan
- Sistem harus memungkinkan dosen mengupload materi dan tugas perkuliahan

Perspektif Administrasi:
- Sistem harus mampu mengelola data seluruh mahasiswa dan dosen
- Sistem harus menghasilkan laporan akademik secara otomatis termasuk pelaporan ke PDDIKTI
- Sistem harus mengintegrasikan data pembayaran dengan status akademik mahasiswa

Kebutuhan ini menjadi penting karena kebutuhan fungsional adalah inti dari sistem. Jika fungsi-fungsi utama tidak berjalan dengan baik, maka sistem tidak akan memberikan manfaat apapun bagi penggunanya. Misalnya, jika fitur input nilai tidak berfungsi, maka seluruh proses evaluasi akademik mahasiswa akan terhambat.

Pengaruhnya pada setiap fungsi yang berjalan dengan baik akan meningkatkan efisiensi proses akademik secara keseluruhan. Sistem dengan kebutuhan fungsional yang lengkap dan terimplementasi dengan baik akan mengurangi kesalahan proses manual, mempercepat layanan, dan meningkatkan kepuasan seluruh pengguna.

##### 2. Kebutuhan Pengembangan, merupakan kebutuhan yang berkaitan dengan proses, metode dan standar yang digunakan dalam membangun sistem.

Perspektif Mahasiswa:
- Tampilan harus dirancang dengan prinsip user-friendly agar mudah digunakan oleh semua kalangan mahasiswa.
- Sistem harus bisa diakses dari semua perangkat (responsive design)
Perspektif Dosen:
- Sistem harus dikembangkan dengan fitur validasi data yang ketat agar nilai tidak dapat diubah sembarangan.
- Sistem harus menyediakan role-based access control sehingga dosen hanya dapat mengakses data kelas yang merupakan tanggung jawabnya.
Perspektif Administrasi:
- Sistem harus dikembangkan menggunakan standar keamanan data yang tinggi seperti enkripsi dan autentikasi berlapis
- Sistem harus mudah dipelihara (maintainable) dan dapat dikembangkan lebih lanjut sesuai kebutuhan universitas di masa mendatang

Kebutuhan ini menjadi penting karena kebutuhan pengembangan menentukan kualitas jangka panjang sistem. Sistem yang dikembangkan tanpa standar yang jelas akan sulit diperbaiki, rentan terhadap kerusakan, dan tidak dapat berkembang mengikuti kebutuhan yang berubah.

Kebutuhan ini mempengaruhi kinerja sistem dari segi proses pengembangan yang terstruktur dan menggunakan metodologi yang tepat seperti metode terstruktur dengan DFD atau berorientasi objek dengan UML akan menghasilkan sistem yang lebih stabil, aman, dan mudah dikembangkan di masa mendatang.


##### 3. Kebutuhan Kinerja adalah kebutuhan yang berkaitan dengan seberapa baik sistem harus bekerja dalam kondisi tertentu, seperti kecepatan, kapasitas, dan ketersediaan sistem.

Perspektif Mahasiswa:
- Sistem harus mampu menangani ribuan pengguna secara bersamaan terutama saat periode pendaftaran mata kuliah dan pengumuman nilai tanpa mengalami gangguan atau crash
- Waktu respons sistem tidak boleh lebih dari 3 detik untuk setiap transaksi normal

Perspektif Dosen:
- Sistem harus memastikan data nilai yang diinput tersimpan secara real-time dan tidak hilang akibat gangguan koneksi
- Fitur absensi digital harus dapat berjalan bahkan dalam kondisi koneksi internet yang terbatas

Perspektif Administrasi:
- Sistem harus memiliki tingkat ketersediaan / uptime minimal 99% agar layanan akademik tidak terganggu
- Proses generate laporan harus dapat diselesaikan dalam waktu singkat meskipun data yang diolah sangat besar

Kebutuhan kinerja menjadi penting atau sangat krusial karena sistem akademik digunakan oleh ribuan pengguna setiap harinya. Sistem yang lambat akan menimbulkan kerugian besar terutama saat momen-momen kritis seperti periode ujian atau pendaftaran mata kuliah.

Pengaruhnya terhadap sistem, kinerja sistem yang baik akan meningkatkan kepercayaan seluruh pengguna terhadap sistem. Sebaliknya, sistem yang lambat dan tidak stabil akan menurunkan produktivitas akademik secara keseluruhan dan menciptakan ketidakpercayaan terhadap teknologi yang digunakan universitas.

##### 4. Kebutuhan Dokumentasi, kebutuhan yang berkaitan dengan segala hal terkait project seperti dokumen perencanaan, analisis, desain dll.

Perspektif Mahasiswa:
- Sistem harus menyediakan panduan penggunaan yang jelas dan mudah dipahami agar mahasiswa tidak mengalami kesulitan saat menggunakan sistem untuk pertama kali
- Sistem harus menyediakan fitur atau FAQ yang dapat diakses langsung dalam aplikasi

Perspektif Dosen:
- Harus tersedia dokumentasi teknis terkait cara penggunaan fitur input nilai, absensi, dan pengelolaan materi
- Sistem harus menyimpan log aktivitas dosen sebagai bukti dokumentasi proses akademik yang dapat diaudit sewaktu-waktu

Perspektif Administrasi:
- Seluruh proses bisnis yang berjalan dalam sistem harus terdokumentasi dalam bentuk flowchart, DFD, atau diagram UML sebagai acuan pengembangan dan pemeliharaan sistem
- Sistem harus menyimpan riwayat perubahan data sebagai bentuk akuntabilitas dan keamanan data institusi

Dokumentasi yang lengkap memudahkan proses pelatihan pengguna baru, mempercepat proses troubleshooting saat terjadi masalah, dan menjadi acuan penting saat sistem perlu dikembangkan atau diperbaiki oleh tim yang berbeda.

Sistem yang terdokumentasi dengan baik akan lebih mudah dipelihara dan dikembangkan sehingga masalah teknis dapat diselesaikan lebih cepat. Dokumentasi yang buruk seringkali menjadi penyebab utama lambatnya penanganan gangguan sistem yang pada akhirnya mengganggu seluruh proses akademik.

##### 5. Kebutuhan Pendukung, yaitu kebutuhan yang berkaitan setelah sistem informasi digunakan seperti adanya pelatihan bagi calon pengguna.

Perspektif Mahasiswa:
- Harus tersedia layanan atau pusat bantuan yang responsif untuk menangani keluhan dan pertanyaan mahasiswa terkait penggunaan sistem
- Sistem harus didukung oleh infrastruktur jaringan internet yang memadai di seluruh area kampus

Perspektif Dosen:
- Harus tersedia pelatihan penggunaan sistem bagi dosen terutama saat ada pembaruan fitur yang signifikan
- Sistem harus didukung oleh tim teknis yang siap membantu dosen mengatasi masalah teknis saat proses perkuliahan berlangsung

Perspektif Administrasi:
- Sistem harus didukung oleh infrastruktur server yang andal dengan mekanisme backup data otomatis secara berkala untuk mencegah kehilangan data
- Harus tersedia anggaran pemeliharaan sistem yang terencana agar sistem selalu diperbarui sesuai perkembangan teknologi dan regulasi pemerintah

Kebutuhan pendukung sering diabaikan namun sangat menentukan keberlangsungan sistem dalam jangka panjang. Sistem yang canggih sekalipun tidak akan berjalan optimal tanpa infrastruktur dan dukungan teknis yang memadai.

Dukungan infrastruktur dan layanan teknis yang baik akan memastikan sistem selalu berjalan dengan optimal, pembaruan dapat dilakukan tepat waktu, dan setiap gangguan dapat ditangani dengan cepat sehingga proses akademik tidak terhambat dalam jangka panjang.

> Dalam suatu proyek sistem informasi rumah sakit, klien kesulitan mendefinisikan kebutuhan mereka secara detail dan sering mengubah spesifikasi selama pengembangan. Model pengembangan perangkat lunak apa yang paling sesuai untuk menangani kondisi ini? Jelaskan alasan pemilihan model tersebut dan bagaimana cara Anda memastikan proyek tetap berjalan dengan baik meskipun spesifikasi sering berubah

Model pengembangan yang paling sesuai untuk kondisi ini adalah Model Agile, khususnya dengan pendekatan Scrum.

Model Agile merupakan pendekatan yang bersifat iteratif dan inkremental, yang dimana sistem dikembangkan secara bertahap dalam siklus pendek yang disebut Sprint. Setiap Sprint menghasilkan bagian sistem yang sudah dapat berfungsi dan siap didemonstrasikan kepada klien untuk mendapatkan umpan balik.

1. Fleksibel terhadap Perubahan Kebutuhan

Model Agile dirancang untuk mengakomodasi perubahan kebutuhan kapan saja selama proses pengembangan berlangsung. Berbeda dengan model Waterfall yang bersifat linier dan kaku, Agile memungkinkan tim pengembang untuk menyesuaikan spesifikasi di setiap akhir Sprint tanpa harus mengulang seluruh proses dari awal. Ini sangat sesuai dengan kondisi klien rumah sakit yang sering mengubah spesifikasi.

2. Keterlibatan Klien
Dalam Agile, klien dilibatkan secara aktif di setiap tahap pengembangan melalui sesi review dan demo di akhir setiap Sprint. Hal ini membantu klien yang kesulitan mendefinisikan kebutuhan secara detail karena mereka dapat melihat langsung hasil kerja tim dan memberikan masukan secara bertahap berdasarkan sistem yang sudah berjalan.

3. Cocok untuk Sistem yang Kompleks
Sistem informasi rumah sakit adalah sistem yang sangat kompleks karena melibatkan banyak modul seperti pendaftaran pasien, rekam medis, farmasi, laboratorium, dan keuangan. Agile memungkinkan kompleksitas ini ditangani secara bertahap dan terstruktur.

Model Agile dengan pendekatan Scrum adalah pilihan yang paling tepat untuk proyek sistem informasi rumah sakit ini karena sifatnya yang fleksibel, iteratif, dan selalu melibatkan klien dalam setiap tahap pengembangan. Dengan menerapkan langkah-langkah ini, proyek dapat tetap berjalan dengan baik dan terarah meskipun spesifikasi sering berubah dan akan menghasilkan sistem informasi rumah sakit yang benar-benar sesuai dengan kebutuhan klien dan selesai tepat waktu.

Sumber referensi:
- BMP MSIM4303 Modul 1 - 3
- https://en.wikipedia.org/wiki/British_Post_Office_scandal
- https://ethora.com/blog/how-does-whatsapp-work-inside-its-architecture-design/
- https://www.binar.co.id/blog/mengenali-konsep-agile-scrum-dan-sprint
