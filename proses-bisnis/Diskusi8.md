BMPN merupakan standar industri terbuka yang digunakan untuk memodelkan proses bisnis. BMPN digunakan sebagai metode pemetaan alur kerja dengan objek dan simbol yang sudah ditentukan oleh metodologi, memiliki bentuk terstruktur seperti flowchart namun mengikuti aturan baku BPMN.

BMPN dianggap standar terbaik karena menyediakan cara yang jelas dan konsisten untuk menggambarkan proses bisnis. Namun, beberapa analis tetap memilih metode lain sesuai kebutuhan proyek.

Ada beberapa kategori utama BPMN yaitu
1. Flow Objects
   - Event digambarkan dengan lingkaran
   - Aktivitas digambarkan dengan persegi panjang bersudut membulat
   - Gateway digambarkan dengan bentuk belah ketupat
2. Connecting Objects
   - Garis solid menunjukkan alur proses (sequence flow)
   - Garis putus-putus menunjukkan pesan antar proses (message flow)
3. Swim Lanes
Digunakan untuk membagi tanggung jawab dalam proses, menjelaskan siapa melakukan apa. Terdiri dari pool (unit organisasi besar) dan lane (pembagian per peran atau departemen).
4. Artifact
Digunakan untuk menambahkan informasi pendukung yang bukan berupa aliran urutan atau aliran pesan.

Komunikasi antar tim bisnis dan teknis menjadi tantangan karena memiliki beberapa perbedaan yaitu:
- Perbedaan cara berpikir
Tim bisnis fokus pada proses, kebutuhan, dan tujuan organisasi. Sementara itu, tim teknis fokus pada detail implementasi, logika sistem, dan teknologi.
- Istilah dan bahasa yang berbeda
Tim bisnis menggunakan istilah operasional (pelanggan, pesanan, alur layanan), sedangkan tim teknis menggunakan istilah teknis (API, database, endpoint). Perbedaan ini sering menimbulkan miskomunikasi.
- Dokumentasi yang tidak standar
Tanpa standar visual, masing-masing tim menggambarkan proses dengan cara berbeda sehingga mudah terjadi salah interpretasi.
- Kompleksitas proses bisnis
Beberapa proses memiliki banyak kondisi, pengecualian, dan keputusan. Menjelaskannya dengan teks atau percakapan seringkali tidak cukup jelas.

BPMN dapat mengatasi tantangan komunikasi tersebut karena hal hal berikut, yaitu:
- Menggunakan notasi visual yang mudah dipahami semua pihak
Simbol seperti event, gateway, dan aktivitas bersifat universal sehingga memudahkan tim bisnis memahami alur tanpa harus menguasai aspek teknis.
- Standar global, sehingga tidak ambigu
Karena BPMN mengikuti aturan baku, diagram yang dibuat oleh satu orang dapat dipahami oleh orang lain tanpa perlu penjelasan tambahan.
- Menyatukan detail bisnis dan teknis dalam satu model
BPMN dapat menampilkan proses dari level tinggi hingga detail eksekusi dalam satu diagram.
- Menjelaskan peran dan tanggung jawab dengan Swimlane
Ini mengurangi kebingungan tentang siapa melakukan apa dan kapan interaksi terjadi.
- Menggambarkan komunikasi antar sistem atau aktor melalui Message Flow
Sangat membantu tim teknis untuk memahami integrasi, sekaligus memberi gambaran jelas bagi tim bisnis.

###### Kesimpulan
Komunikasi antara tim bisnis dan tim teknis sering menjadi tantangan karena perbedaan cara berpikir, istilah yang digunakan, hingga tingkat detail yang dibutuhkan. BPMN hadir sebagai solusi karena menyediakan notasi visual yang standar, jelas, dan mudah dipahami oleh kedua pihak. Dengan simbol, aturan, dan struktur yang konsisten, BPMN mampu menjembatani kesenjangan komunikasi, mengurangi salah interpretasi, serta menyatukan perspektif bisnis dan teknis dalam satu model proses yang komprehensif. 

Melalui elemen seperti flow objects, swimlane, dan message flow, BPMN membantu semua pihak melihat proses secara menyeluruh, memahami peran masing-masing, serta memastikan desain dan implementasi sistem berjalan selaras dengan kebutuhan bisnis.

Sumber referensi:
- STSI4206 Modul 6