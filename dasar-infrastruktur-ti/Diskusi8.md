Selamat siang Bapak / Ibu Tutor, berikut jawaban saya.

Keamanan informasi merupakan upaya melindungi informasi dari berbagai ancaman yang dapat mengganggu ketersediaan, integritas, dan kerahasiaannya. Bagi perguruan tinggi, data mahasiswa seperti NIK, alamat, nomor HP, KRS, dan nilai adalah aset yang harus dijaga. Kasus kebocoran data ini menunjukkan bahwa perlindungan aset tersebut belum berjalan dengan baik.

1. Peran keamanan informasi berdasarkan CIA Triad

- Confidentiality (kerahasiaan), menjamin data hanya dapat diakses oleh orang yang berwenang, baik saat disimpan maupun dikirim. Pada kasus ini aspek inilah yang paling dilanggar, karena data pribadi mahasiswa sudah berpindah ke tangan pelaku. Data seperti NIK dan nomor HP bisa dipakai untuk penipuan atau phishing lanjutan yang mengatasnamakan kampus.
- Integrity (keutuhan), menjamin data tetap akurat dan tidak berubah dari aslinya. Jika pelaku sudah masuk ke basis data, ada kemungkinan data akademik ikut diubah, seperti nilai atau status kelulusan. Sehingga kampus perlu memeriksa apakah data yang tersisa masih sama dengan aslinya.
- Availability (ketersediaan), menjamin pengguna yang berhak tetap bisa mengakses sistem saat dibutuhkan. Saat insiden, SIAKAD biasanya dimatikan sementara untuk investigasi, sehingga kegiatan seperti pengisian KRS dan input nilai ikut terhambat.

Ketiga aspek ini saling berkaitan. Kebocoran data adalah pelanggaran confidentiality, tetapi dampaknya dapat merembet ke integrity dan availability.

2. Kemungkinan jenis serangan dan metodologi pelaku

Kebocoran data termasuk bentuk serangan interception, yaitu pihak yang tidak berwenang berhasil mengakses atau menyalin data secara tidak sah. Jenis serangan yang mungkin dipakai pelaku antara lain:
- SQL injection, memanfaatkan celah pada form login atau pencarian di aplikasi web kampus dengan sintaks SQL untuk mengambil isi basis data.
- Phishing, mengirim email palsu yang tampilannya mirip email resmi kampus agar staf atau dosen memasukkan username dan password di halaman palsu.
- Sniffing, menyadap trafik jaringan, terutama jika aplikasi masih memakai HTTP tanpa enkripsi.
- Trojan, software jahat yang dipasang di komputer staf untuk mencuri password dan mengambil alih sistem.

Menurut saya, yang paling mungkin terjadi adalah gabungan phishing dan SQL injection. Hal ini sesuai dengan temuan Triyanto dkk. (2026) bahwa phishing, pencurian data pribadi, dan social engineering adalah ancaman yang paling dominan di perguruan tinggi, dan hanya 40% mahasiswa yang mampu mengenali phishing secara mandiri.

Metodologi pelaku biasanya mengikuti lima tahap:
- Reconnaissance, mengumpulkan informasi tentang kampus, seperti alamat portal, nama pegawai TI, atau email staf dari website dan media sosial.
- Scanning, memindai port dan celah keamanan server kampus dengan port scanner atau vulnerability scanner.
- Gaining access, masuk ke sistem lewat celah yang ditemukan, seperti celah aplikasi atau akun staf hasil phishing.
- Maintaining access, memasang backdoor, trojan, atau rootkit agar bisa kembali masuk kapan saja.
- Clearing tracks, menghapus atau mengubah log agar aktivitasnya tidak terlacak.

3. Mekanisme pengamanan dan penerapan defense in depth

Defense in depth adalah pengamanan secara berlapis, dimana jika satu lapisan berhasil ditembus, lapisan berikutnya masih bisa menahan serangan. Rekomendasi penerapannya untuk kampus:
- Lapisan kebijakan, prosedur, dan awareness: membuat kebijakan password dan klasifikasi data, serta pelatihan rutin mengenali phishing untuk staf, dosen, dan mahasiswa.
- Lapisan fisik: server ditempatkan di ruang data center yang terkunci dan hanya bisa dimasuki petugas tertentu.
- Lapisan perimeter: memasang firewall di antara jaringan internal kampus dan internet.
- Lapisan jaringan: memisahkan jaringan server dengan jaringan Wi-Fi mahasiswa dan lab, serta memasang Network IDS untuk mendeteksi trafik mencurigakan.
- Lapisan host: melakukan hardening dan patch sistem operasi server secara rutin, serta memasang IDS berbasis host.
- Lapisan aplikasi: menerapkan pemrograman yang aman agar tidak ada celah SQL injection, memakai HTTPS, dan menambahkan autentikasi dua faktor untuk akun admin dan dosen.
- Lapisan data: mengenkripsi data sensitif seperti NIK, mengatur hak akses ke basis data, dan membuat backup berkala.

Triyanto dkk. (2026) juga menekankan bahwa lapisan manusia adalah yang paling menentukan, karena teknologi yang kuat tetap bisa ditembus jika penggunanya mudah tertipu. Menurut saya, kampus juga perlu memiliki prosedur tanggap insiden, sehingga ketika terjadi kebocoran sudah jelas siapa yang menangani, kapan mahasiswa diberi tahu, dan langkah pemulihannya. Selain itu, perlu diingat bahwa semakin ketat pengamanan, kemudahan penggunaan sistem bisa berkurang, sehingga kampus harus mencari titik seimbang agar sistem tetap aman tetapi masih nyaman dipakai.

###### Kesimpulan

Kasus kebocoran data kampus terutama melanggar aspek confidentiality, dan dampaknya bisa merembet ke integrity dan availability. Pelaku kemungkinan masuk melalui phishing atau SQL injection dengan tahapan reconnaissance sampai clearing tracks. Untuk mencegahnya, kampus perlu menerapkan defense in depth dari lapisan kebijakan sampai lapisan data, dengan perhatian khusus pada edukasi pengguna.

Sumber referensi:
- Arifin, Z., & Nugroho, K. (2020). Dasar infrastruktur teknologi informasi (Edisi 1, Modul 6: Tata Kelola dan Keamanan Teknologi Informasi). Universitas Terbuka.
- Triyanto, J., Prabowo, F. Y., Hidayat, M. H. N., Alfatoni, R., & Baehaqi, A. (2026). Analisis keamanan digital perguruan tinggi terhadap ancaman siber Generasi Z melalui metode defense-in-depth. Jurnal Sains dan Teknologi Informasi, 5(3), 155-163. https://doi.org/10.47065/jussi.v5i3.10311
