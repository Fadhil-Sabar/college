Selamat sore Bapak / Ibu Dosen, berikut untuk jawaban saya.

> 1. Sampai kapan analisis DFD dilakukan? Bagaimana menentukan bahwa DFD sudah cukup detail dan tidak perlu diturunkan lebih lanjut?

Data Flow Diagram digunakan untuk merepresentasikan sebuah sistem atau perangkat lunak menjadi beberapa level abstraksi dimulai dari level paling awal hingga informasi mendetail.

Untuk tingkatan analisa DFD dilakukan tergantung dari seberapa kompleks sistem yang akan dibangun.

Level 0 (Context Diagram)
Pada level ini, sistem digambarkan sebagai sebuah entitas tunggal yang berinteraksi dengan pengguna atau sistem lain. Context Diagram hanya menunjukkan gambaran besar sistem secara keseluruhan tanpa merinci proses di dalamnya. Pada level ini belum ada detail proses, hanya menggambarkan batas sistem (system boundary) dan hubungannya dengan entitas luar.

DFD Level 1
Pada level ini, mulai didetailkan modul-modul utama yang ada pada sistem yang akan dikembangkan. Setiap proses besar dari Context Diagram dipecah menjadi beberapa sub-proses yang lebih spesifik beserta aliran datanya.

DFD level 2, modul yang sudah dipecahkan dari level 1 dipecah kembali secara lebih detail tergantung dari kebutuhan modul tersebut. Apabila sudah cukup mendetail maka tidak perlu didetailkan lebih lanjut.

DFD level 3 dan seterusnya, pada level ini merupakan breakdown dari level sebelumnya. Dimana aturannya sama seperti pada level sebelumnya

Sehingga, analisis DFD dilakukan selama masih ada proses yang dianggap terlalu kompleks untuk langsung diimplementasikan. Ketika setiap proses dalam DFD sudah bersifat atomik, jelas, dan dapat langsung diimplementasikan, maka analisis DFD sudah cukup dan tidak perlu diturunkan ke level yang lebih dalam lagi.

> 2. Apa dampak dari DFD yang terlalu sederhana atau terlalu kompleks dalam pengembangan sistem berbasis pemrograman terstruktur?

Jika sebuah DFD terlalu sederhana, akibatnya adalah sebuah sistem tidak dapat dipahami secara mendetail tentang fungsi fungsinya. Dari fungsi yang tidak terdefinisi ini, menjadi hambatan untuk menentukan paradigma pemrograman, bahasa pemrograman yang akan digunakan dalam membuat program.

Akan tetapi jika terlalu mendetail, dampak yang ditimbulkan menjadi sebaliknya, seperti sulit dipahami oleh semua pihak, waktu dan biaya menjadi tidak efisien, project sulit untuk dikelola dan diperbarui.

Sehingga DFD yang ideal adalah DFD yang berada pada tingkat detail yang seimbang, yaitu cukup detail untuk dipahami dan diimplementasikan oleh pengembang, namun tidak terlalu kompleks sehingga tetap mudah dikomunikasikan kepada klien. Dalam pemrograman terstruktur, keseimbangan ini sangat penting karena DFD menjadi dasar utama dalam menentukan struktur program, pembagian fungsi atau prosedur, serta alur logika sistem secara keseluruhan.

> 3. Bagaimana pendekatan terbaik untuk menjaga keseimbangan antara kejelasan sistem dan efisiensi dalam perancangan DFD?

Pendekatan terbaiknya adalah menggunakan Kamus Data dalam perancangan DFD, dimana kamus data digunakan untuk memperjelas aliran data yang digambarkan pada DFD.

Kamus Data sendiri merupakan dokumen yang berisi daftar dan definisi lengkap dari seluruh elemen data yang digunakan dalam sistem, termasuk aliran data, penyimpanan data, dan proses yang ada dalam DFD. Dengan adanya Kamus Data, DFD tidak perlu memuat semua detail teknis secara langsung dalam diagram sehingga diagram tetap bersih, mudah dibaca, dan mudah dipahami oleh semua pihak.

Kamus data harus dipetakan bersamaan dengan hasil perancangan basis data yang dilakukan sebelumnya. Jika kamus data tidak dapat dipetakan, maka hasil perancangan basis data dengan perancangan DFD masih belum sesuai dan harus diperbaiki.

Sehingga dengan adanya kamus data ini, DFD tetap dapat digambarkan secara ringkas dan mudah dipahami, sementara seluruh detail teknis tentang aliran data, penyimpanan data, dan logika proses didokumentasikan secara lengkap dalam Kamus Data. Kombinasi antara DFD dan Kamus Data inilah yang menjadi standar dalam analisis dan perancangan sistem berbasis pemrograman terstruktur.


Sumber referensi:
- Modul 4 BMP MSIM4303
