### Soal 1

![[Pasted image 20261106-soal1-1.png]]
![[Pasted image 20261106-soal1-2.png]]

### Soal 2

- Untuk x < 0 pakai y = 2. Bentuknya garis datar.
- Untuk x >= 0 pakai y = x² - 3x + 2. Bentuknya parabola terbuka ke atas.
- Titik x = 0 masuk ke rumus kedua: y = 0 - 0 + 2 = 2.

| **x** | **y**           | **(x,y)**   |
| ----- | --------------- | ----------- |
| -3    | 2               | (-3, 2)     |
| -2    | 2               | (-2, 2)     |
| -1    | 2               | (-1, 2)     |
| 0     | 0 - 0 + 2 = 2   | (0, 2)      |
| 1/2   | 3/4             | (1/2, 3/4)  |
| 1     | 1 - 3 + 2 = 0   | (1, 0)      |
| 3/2   | -1/4            | (3/2, -1/4) |
| 2     | 4 - 6 + 2 = 0   | (2, 0)      |
| 3     | 9 - 9 + 2 = 2   | (3, 2)      |
| 4     | 16 - 12 + 2 = 6 | (4, 6)      |
![[Pasted image 20261106101813.png]]

Titik-titik pada tabel diplot pada bidang koordinat, lalu dihubungkan. Di sebelah kiri sumbu y grafiknya berupa garis datar y = 2. Mulai x = 0 grafiknya berupa parabola terbuka ke atas yang memotong sumbu x di (1, 0) dan (2, 0), karena x² - 3x + 2 = (x - 1)(x - 2). Titik baliknya ada di x = 3/2, yaitu titik (3/2, -1/4). Kedua bagian bertemu di titik (0, 2), sehingga grafiknya tersambung.

Dari grafik diperoleh D(y) = semua bilangan real dan R(y) = [-1/4, ∞).

### Soal 3

**a. Pembuktian tidak langsung**

Misalkan P : n bilangan ganjil dan Q : n³ + 4 bilangan ganjil
Maka ¬P : n bilangan genap dan ¬Q : n³ + 4 bilangan genap. 
Implikasi P ⇒ Q ekuivalen dengan ¬Q ⇒ ¬P, sehingga cukup ditunjukkan bahwa jika n³ + 4 genap maka n genap.

Bukti:
Misalkan n³ + 4 bilangan genap [¬Q]. Maka terdapat bilangan bulat k sehingga n³ + 4 = 2k. Dari persamaan tersebut diperoleh n³ = 2k - 4 = 2(k - 2), sehingga n³ juga bilangan genap.
Selanjutnya, n³ - n dapat difaktorkan menjadi (n - 1)n(n + 1). Bentuk ini merupakan hasil kali tiga bilangan bulat berurutan, sehingga paling sedikit satu faktornya genap dan hasil kalinya juga genap. Jadi terdapat bilangan bulat m sehingga n³ - n = 2m.
Karena n = n³ - (n³ - n), maka n = 2(k - 2) - 2m = 2(k - 2 - m). Karena k - 2 - m bilangan bulat, n merupakan bilangan genap [¬P].

Dengan demikian ¬Q ⇒ ¬P benar. Karena ¬Q ⇒ ¬P ekuivalen dengan P ⇒ Q, maka jika n bilangan ganjil, n³ + 4 bilangan ganjil [terbukti].

**b. Pembuktian ekuivalen**

Misalkan n bilangan bulat. Ketiga pernyataan dikatakan ekuivalen jika dapat ditunjukkan bahwa (1) ⇔ (2), (2) ⇔ (3), dan (3) ⇔ (1). Setiap biimplikasi P ⇔ Q dibuktikan dalam dua arah, yaitu P ⇒ Q dan Q ⇒ P. Beberapa arah dibuktikan dengan kontraposisi, yaitu menunjukkan ¬Q ⇒ ¬P.

**(i) Pernyataan (1) ⇔ (2): 3n - 3 genap ⇔ n + 4 ganjil**

Jika 3n - 3 genap, maka n + 4 ganjil:
Pembuktian memakai kontraposisi, yaitu jika n + 4 genap, maka 3n - 3 ganjil.
Misalkan n + 4 genap. Maka terdapat bilangan bulat k sehingga n + 4 = 2k, atau n = 2k - 4. Substitusi ke 3n - 3 memberikan 3n - 3 = 3(2k - 4) - 3 = 6k - 15 = 2(3k - 8) + 1. Jadi 3n - 3 ganjil. Karena kontraposisinya benar, maka jika 3n - 3 genap, n + 4 ganjil.

Jika n + 4 ganjil, maka 3n - 3 genap:
Misalkan n + 4 ganjil. Maka terdapat bilangan bulat k sehingga n + 4 = 2k + 1, atau n = 2k - 3. Substitusi ke 3n - 3 memberikan 3n - 3 = 3(2k - 3) - 3 = 6k - 12 = 2(3k - 6). Jadi 3n - 3 genap.

**(ii) Pernyataan (2) ⇔ (3): n + 4 ganjil ⇔ n² ganjil**

Jika n + 4 ganjil, maka n² ganjil:
Misalkan n + 4 ganjil. Seperti pada bagian (i), n = 2k - 3 untuk suatu bilangan bulat k. Maka n² = (2k - 3)² = 4k² - 12k + 9 = 2(2k² - 6k + 4) + 1. Jadi n² ganjil.

Jika n² ganjil, maka n + 4 ganjil:
Pembuktian memakai kontraposisi, yaitu jika n + 4 genap, maka n² genap.
Misalkan n + 4 genap. Seperti pada bagian (i), n = 2k - 4 untuk suatu bilangan bulat k. Maka n² = (2k - 4)² = 4(k - 2)² = 2 · 2(k - 2)². Jadi n² genap. Karena kontraposisinya benar, maka jika n² ganjil, n + 4 ganjil.

**(iii) Pernyataan (3) ⇔ (1): n² ganjil ⇔ 3n - 3 genap**

Pada bagian ini dipakai hubungan n = (3n - 3) - 2n + 3.

Jika n² ganjil, maka 3n - 3 genap:
Pembuktian memakai kontraposisi, yaitu jika 3n - 3 ganjil, maka n² genap.
Misalkan 3n - 3 ganjil. Maka terdapat bilangan bulat k sehingga 3n - 3 = 2k + 1. Akibatnya n = (2k + 1) - 2n + 3 = 2(k - n + 2), sehingga n genap. Tulis n = 2m untuk suatu bilangan bulat m, maka n² = 4m² = 2(2m²). Jadi n² genap. Karena kontraposisinya benar, maka jika n² ganjil, 3n - 3 genap.

Jika 3n - 3 genap, maka n² ganjil:
Misalkan 3n - 3 genap. Maka terdapat bilangan bulat k sehingga 3n - 3 = 2k. Akibatnya n = 2k - 2n + 3 = 2(k - n + 1) + 1, sehingga n ganjil. Tulis n = 2m + 1 untuk suatu bilangan bulat m, maka n² = 4m² + 4m + 1 = 2(2m² + 2m) + 1. Jadi n² ganjil.

Karena (1) ⇔ (2), (2) ⇔ (3), dan (3) ⇔ (1) terbukti, maka ketiga pernyataan (1) 3n - 3 bilangan genap, (2) n + 4 bilangan ganjil, dan (3) n² bilangan ganjil saling ekuivalen [terbukti].

### Sumber Referensi

Warsito. (2022). *Pengantar matematika* (Edisi 3) [Buku Materi Pokok MATA4101]. Universitas Terbuka.
