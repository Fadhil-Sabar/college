
# Analogi Pemrograman untuk MATA4101

## Modul 1 — Himpunan

### Himpunan

Himpunan seperti sebuah `Set` atau array yang berisi kumpulan data.

```js
const bahasaPemrograman = new Set([
  "JavaScript",
  "Python",
  "Go",
]);
```

Secara matematika:

```text
A = {JavaScript, Python, Go}
```

Setiap nilai di dalamnya merupakan anggota himpunan.

```js
bahasaPemrograman.has("Go"); // true
bahasaPemrograman.has("Java"); // false
```

Setara dengan:

```text
Go ∈ A
Java ∉ A
```

---

### Himpunan Bagian

Himpunan bagian dapat dianalogikan sebagai daftar permission yang seluruh isinya berasal dari daftar permission utama.

```js
const semuaPermission = [
  "read",
  "create",
  "update",
  "delete",
];

const permissionEditor = [
  "read",
  "create",
  "update",
];
```

Karena semua permission editor terdapat pada `semuaPermission`, maka:

```text
permissionEditor ⊆ semuaPermission
```

Pengecekan JavaScript:

```js
function isSubset(subset, parentSet) {
  return subset.every((item) => parentSet.includes(item));
}

isSubset(permissionEditor, semuaPermission); // true
```

Konsep utamanya adalah:

```js
subset.every(...)
```

Artinya:

> Apakah setiap anggota himpunan kecil terdapat pada himpunan besar?

Contoh bukan himpunan bagian:

```js
const permissionGuest = [
  "read",
  "download",
];

isSubset(permissionGuest, semuaPermission); // false
```

Nilainya `false` karena `"download"` tidak terdapat pada himpunan utama.

---

### Himpunan Kosong

Himpunan kosong seperti array kosong.

```js
const data = [];
```

Secara matematika:

```text
A = ∅
```

Array kosong merupakan subset dari semua array atau himpunan.

```js
isSubset([], semuaPermission); // true
```

Tidak ada elemen yang melanggar syarat subset.

---

### Gabungan Himpunan

Gabungan seperti menggabungkan dua array lalu menghapus data duplikat.

```js
const frontend = ["JavaScript", "TypeScript", "CSS"];
const backend = ["JavaScript", "Go", "Java"];

const gabungan = [...new Set([...frontend, ...backend])];

console.log(gabungan);
```

Hasil:

```js
[
  "JavaScript",
  "TypeScript",
  "CSS",
  "Go",
  "Java",
]
```

Secara matematika:

```text
frontend ∪ backend
```

Gabungan mengambil semua data yang terdapat pada salah satu atau kedua himpunan.

---

### Irisan Himpunan

Irisan seperti mencari elemen yang muncul pada dua array sekaligus.

```js
const frontend = ["JavaScript", "TypeScript", "CSS"];
const backend = ["JavaScript", "Go", "Java"];

const irisan = frontend.filter((item) =>
  backend.includes(item)
);

console.log(irisan); // ["JavaScript"]
```

Secara matematika:

```text
frontend ∩ backend = {JavaScript}
```

---

### Selisih Himpunan

Selisih adalah data yang terdapat pada array pertama, tetapi tidak terdapat pada array kedua.

```js
const frontend = ["JavaScript", "TypeScript", "CSS"];
const backend = ["JavaScript", "Go", "Java"];

const hanyaFrontend = frontend.filter(
  (item) => !backend.includes(item)
);

console.log(hanyaFrontend);
// ["TypeScript", "CSS"]
```

Secara matematika:

```text
frontend − backend
```

Urutan penting.

```js
const hanyaBackend = backend.filter(
  (item) => !frontend.includes(item)
);

console.log(hanyaBackend);
// ["Go", "Java"]
```

Hasil `A − B` berbeda dengan `B − A`.

---

### Komplemen Himpunan

Komplemen seperti mengambil semua permission yang belum dimiliki seorang pengguna.

```js
const semuaPermission = [
  "read",
  "create",
  "update",
  "delete",
];

const permissionUser = [
  "read",
  "create",
];

const komplemen = semuaPermission.filter(
  (permission) => !permissionUser.includes(permission)
);

console.log(komplemen);
// ["update", "delete"]
```

Secara matematika:

```text
Aᶜ = S − A
```

`S` adalah himpunan semesta atau seluruh kemungkinan data.

---

### Perkalian Kartesius

Perkalian Kartesius seperti membuat seluruh kemungkinan pasangan dari dua array.

```js
const users = ["Andi", "Budi"];
const roles = ["Admin", "Editor"];

const pasangan = users.flatMap((user) =>
  roles.map((role) => [user, role])
);

console.log(pasangan);
```

Hasil:

```js
[
  ["Andi", "Admin"],
  ["Andi", "Editor"],
  ["Budi", "Admin"],
  ["Budi", "Editor"],
]
```

Secara matematika:

```text
Users × Roles
```

Konsep ini sering muncul pada kombinasi data, testing, dan relasi database.

---

### Himpunan Kuasa

Himpunan kuasa adalah seluruh kemungkinan kombinasi subset.

Misalkan tersedia tiga fitur:

```js
const fitur = [
  "dark-mode",
  "notification",
  "analytics",
];
```

Kemungkinan subset-nya meliputi:

```js
[]
["dark-mode"]
["notification"]
["analytics"]
["dark-mode", "notification"]
["dark-mode", "analytics"]
["notification", "analytics"]
["dark-mode", "notification", "analytics"]
```

Jumlah kemungkinan:

```text
2³ = 8
```

Dalam pemrograman, konsep ini dapat muncul ketika membuat seluruh kombinasi konfigurasi atau skenario testing.

---

# Modul 2 — Jenis Bilangan

## Bilangan Bulat

Bilangan bulat seperti tipe data integer.

```js
const stock = 10;
const perubahan = -3;
const kosong = 0;
```

Nilainya tidak memiliki pecahan.

```text
..., −2, −1, 0, 1, 2, ...
```

---

## Bilangan Rasional

Bilangan rasional seperti hasil pembagian dua integer.

```js
const hasil = 3 / 4; // 0.75
```

Secara matematika:

```text
3/4
```

Bilangan rasional mempunyai desimal yang berhenti atau berulang.

```js
1 / 2; // 0.5
1 / 3; // 0.333333...
```

---

## Bilangan Irasional

Bilangan irasional seperti nilai yang tidak dapat direpresentasikan secara tepat menggunakan jumlah digit terbatas.

```js
Math.PI;
Math.sqrt(2);
```

JavaScript hanya menyimpan nilai pendekatannya.

```js
console.log(Math.PI);
// 3.141592653589793
```

Nilai sebenarnya mempunyai digit tak berhingga tanpa pola pengulangan tetap.

---

## Bilangan Kompleks

Bilangan kompleks dapat dianalogikan sebagai object dengan dua properti.

```js
const bilanganKompleks = {
  real: 3,
  imaginary: 2,
};
```

Mewakili:

```text
3 + 2i
```

JavaScript bawaan tidak memiliki tipe bilangan kompleks, tetapi dapat dibuat menggunakan object atau library.

---

# Modul 3 — Logika Matematika

## Proposisi

Proposisi seperti ekspresi Boolean yang menghasilkan `true` atau `false`.

```js
const umur = 20;

umur >= 18; // true
umur < 18;  // false
```

Kalimat matematika:

```text
p: Umur pengguna minimal 18 tahun.
```

Nilainya dapat ditentukan benar atau salah.

---

## Negasi

Negasi setara dengan operator `!`.

```js
const isLoggedIn = true;

!isLoggedIn; // false
```

Secara matematika:

```text
¬p
```

Jika `p` benar, maka `¬p` salah.

---

## Konjungsi

Konjungsi setara dengan operator `&&`.

```js
const punyaEmail = true;
const emailTerverifikasi = true;

const bisaLogin =
  punyaEmail && emailTerverifikasi;
```

Hasil hanya `true` jika semua kondisi benar.

Secara matematika:

```text
p ∧ q
```

---

## Disjungsi

Disjungsi setara dengan operator `||`.

```js
const loginDenganEmail = false;
const loginDenganGoogle = true;

const berhasilLogin =
  loginDenganEmail || loginDenganGoogle;
```

Hasil benar selama minimal satu kondisi benar.

Secara matematika:

```text
p ∨ q
```

---

## Implikasi

Implikasi dapat dianalogikan sebagai aturan validasi.

```js
if (user.isAdmin) {
  user.canAccessAdminPage = true;
}
```

Pernyataannya:

```text
Jika pengguna adalah admin,
maka pengguna dapat membuka halaman admin.
```

Secara matematika:

```text
p → q
```

Implikasi salah ketika `p` benar, tetapi `q` salah.

```js
const user = {
  isAdmin: true,
  canAccessAdminPage: false,
};
```

Syarat admin terpenuhi, tetapi hasil yang dijanjikan tidak terpenuhi.

---

## Biimplikasi

Biimplikasi seperti dua kondisi yang harus selalu mempunyai nilai sama.

```js
const isAuthenticated = true;
const hasValidSession = true;

const sesuai =
  isAuthenticated === hasValidSession;
```

Secara matematika:

```text
p ↔ q
```

Benar ketika keduanya sama-sama benar atau sama-sama salah.

---

## Kontraposisi

Aturan awal:

```text
Jika token valid, request dapat diproses.
```

Kontraposisi:

```text
Jika request tidak dapat diproses,
token tidak valid.
```

Dalam simbol:

```text
p → q
¬q → ¬p
```

Pernyataan awal dan kontraposisinya memiliki nilai logika yang sama.

---

## Modus Ponens

```js
if (tokenValid) {
  requestDiproses = true;
}

tokenValid = true;
```

Kesimpulan:

```js
requestDiproses === true;
```

Strukturnya:

```text
p → q
p
∴ q
```

---

## Modus Tollens

Aturan:

```text
Jika server aktif,
health check berhasil.
```

Diketahui:

```text
Health check tidak berhasil.
```

Kesimpulan logis:

```text
Server tidak aktif.
```

Strukturnya:

```text
p → q
¬q
∴ ¬p
```

---

## Tautologi

Tautologi seperti kondisi yang selalu menghasilkan `true`.

```js
const p = true;

p || !p; // selalu true
```

Secara matematika:

```text
p ∨ ¬p
```

---

## Kontradiksi

Kontradiksi seperti kondisi yang tidak mungkin bernilai `true`.

```js
const p = true;

p && !p; // selalu false
```

Secara matematika:

```text
p ∧ ¬p
```

---

# Modul 4 — Sistem Bilangan Real

## Persamaan

Persamaan seperti mencari nilai variabel yang membuat sebuah ekspresi benar.

```js
2 * x + 3 === 11;
```

Nilai `x` yang membuat kondisi tersebut benar adalah:

```js
const x = 4;
```

Karena:

```js
2 * 4 + 3 === 11; // true
```

---

## Pertidaksamaan

Pertidaksamaan sama seperti kondisi pembanding.

```js
const umur = 20;

umur >= 18; // true
```

Simbol matematika:

```text
umur ≥ 18
```

---

## Interval

Interval seperti validasi rentang nilai.

```js
function isValidScore(score) {
  return score >= 0 && score <= 100;
}
```

Secara matematika:

```text
0 ≤ score ≤ 100
```

Ditulis sebagai interval:

```text
[0, 100]
```

---

## Nilai Mutlak

Nilai mutlak seperti menghitung jarak tanpa memedulikan arah.

```js
Math.abs(-5); // 5
Math.abs(5);  // 5
```

Secara matematika:

```text
|−5| = 5
|5| = 5
```

Contoh penggunaan:

```js
const target = 100;
const hasil = 93;

const selisih = Math.abs(target - hasil);
// 7
```

---

## Supremum dan Infimum

Misalkan terdapat data response time:

```js
const responseTimes = [
  120,
  150,
  180,
];
```

Nilai terbesar:

```js
Math.max(...responseTimes); // 180
```

Dapat dianalogikan sebagai supremum.

Nilai terkecil:

```js
Math.min(...responseTimes); // 120
```

Dapat dianalogikan sebagai infimum.

Pada himpunan yang lebih abstrak, supremum dan infimum tidak selalu menjadi anggota himpunan.

---

# Modul 5 — Relasi

## Relasi

Relasi seperti hubungan antara data dari dua tabel.

```js
const users = [
  { id: 1, name: "Andi" },
  { id: 2, name: "Budi" },
];

const orders = [
  { id: 101, userId: 1 },
  { id: 102, userId: 1 },
  { id: 103, userId: 2 },
];
```

Relasi:

```text
User memiliki Order
```

Pasangan relasinya:

```text
(Andi, 101)
(Andi, 102)
(Budi, 103)
```

---

## Domain dan Range

```js
const relation = [
  [1, "read"],
  [2, "write"],
  [3, "read"],
];
```

Domain adalah komponen pertama:

```js
const domain = relation.map(([userId]) => userId);
// [1, 2, 3]
```

Range adalah komponen kedua yang benar-benar muncul:

```js
const range = [
  ...new Set(
    relation.map(([, permission]) => permission)
  ),
];

// ["read", "write"]
```

---

## Relasi Refleksif

Relasi refleksif seperti setiap user dianggap sama dengan dirinya sendiri.

```js
const userIds = [1, 2, 3];

const reflexivePairs = userIds.map(
  (id) => [id, id]
);
```

Hasil:

```js
[
  [1, 1],
  [2, 2],
  [3, 3],
]
```

---

## Relasi Simetris

Relasi simetris seperti hubungan pertemanan.

```js
const friendships = [
  ["Andi", "Budi"],
  ["Budi", "Andi"],
];
```

Jika Andi berteman dengan Budi, Budi juga berteman dengan Andi.

---

## Relasi Antisimetris

Relasi antisimetris dapat dianalogikan dengan dependency.

Jika package A bergantung pada package B dan package B juga bergantung pada package A, hal ini hanya aman jika sebenarnya keduanya dianggap komponen yang sama atau terjadi circular dependency.

Contoh matematis yang lebih jelas adalah `≤`.

```js
const a = 5;
const b = 5;

a <= b; // true
b <= a; // true
a === b; // true
```

---

## Relasi Transitif

Relasi transitif seperti pewarisan akses.

```text
Admin dapat mengakses fitur Manager.
Manager dapat mengakses fitur User.
Maka Admin dapat mengakses fitur User.
```

Dalam struktur role:

```js
const roleHierarchy = {
  admin: ["manager", "user"],
  manager: ["user"],
  user: [],
};
```

---

# Modul 6 — Fungsi

## Fungsi Matematika

Fungsi matematika sangat mirip dengan function murni dalam pemrograman.

```js
function tambahSatu(x) {
  return x + 1;
}
```

Secara matematika:

```text
f(x) = x + 1
```

Input:

```js
tambahSatu(3);
```

Output:

```js
4
```

---

## Syarat Fungsi

Satu input harus menghasilkan tepat satu output.

```js
function kuadrat(x) {
  return x * x;
}
```

Input `3` selalu menghasilkan `9`.

```js
kuadrat(3); // 9
kuadrat(3); // 9
```

Contoh yang secara konsep bukan fungsi matematika murni:

```js
function randomOutput(x) {
  return Math.random();
}
```

Input yang sama dapat menghasilkan output berbeda.

Dalam pemrograman fungsi seperti ini tetap disebut function, tetapi secara konsep bukan fungsi matematis deterministik.

---

## Domain

Domain adalah seluruh input yang diperbolehkan.

```js
function bagiSeratus(x) {
  if (x === 0) {
    throw new Error("x tidak boleh nol");
  }

  return 100 / x;
}
```

Domainnya adalah semua bilangan kecuali nol.

---

## Kodomain

Kodomain adalah jenis atau kumpulan output yang direncanakan.

Dalam TypeScript:

```ts
function isAdult(age: number): boolean {
  return age >= 18;
}
```

Kodomainnya:

```text
{true, false}
```

atau tipe:

```ts
boolean
```

---

## Range

Range adalah output yang benar-benar mungkin dihasilkan.

```js
function kuadrat(x) {
  return x * x;
}
```

Jika domainnya semua bilangan real, range-nya adalah bilangan nol atau positif.

```text
[0, ∞)
```

Fungsi tersebut tidak dapat menghasilkan nilai negatif.

---

# Modul 7 — Sifat Fungsi

## Fungsi Injektif

Fungsi injektif seperti mapping user ke NIM unik.

```js
const mahasiswa = [
  { nama: "Andi", nim: "001" },
  { nama: "Budi", nim: "002" },
];
```

Setiap mahasiswa mempunyai NIM berbeda.

```text
Andi → 001
Budi → 002
```

Tidak ada dua input berbeda yang menghasilkan output sama.

---

## Fungsi Surjektif

Fungsi surjektif seperti seluruh role yang tersedia berhasil diberikan kepada minimal satu user.

```js
const semuaRole = [
  "admin",
  "editor",
  "viewer",
];

const users = [
  { name: "Andi", role: "admin" },
  { name: "Budi", role: "editor" },
  { name: "Citra", role: "viewer" },
];
```

Semua anggota kodomain `semuaRole` terpakai.

---

## Fungsi Bijektif

Fungsi bijektif seperti hubungan satu akun dengan satu email unik.

```text
Akun 1 → a@example.com
Akun 2 → b@example.com
Akun 3 → c@example.com
```

Setiap akun mendapat email berbeda dan semua email terpakai.

Karena hubungannya satu-satu, prosesnya dapat dibalik.

```text
a@example.com → Akun 1
```

---

## Komposisi Fungsi

Komposisi fungsi seperti chaining function.

```js
function tambahDua(x) {
  return x + 2;
}

function kaliTiga(x) {
  return x * 3;
}

const hasil = tambahDua(kaliTiga(4));
// kaliTiga(4) = 12
// tambahDua(12) = 14
```

Secara matematika:

```text
(f ∘ g)(4) = f(g(4))
```

Urutan penting.

```js
tambahDua(kaliTiga(4)); // 14
kaliTiga(tambahDua(4)); // 18
```

Maka:

```text
f ∘ g ≠ g ∘ f
```

---

## Fungsi Invers

Invers seperti proses encoding dan decoding.

```js
function encode(x) {
  return x * 2 + 3;
}

function decode(x) {
  return (x - 3) / 2;
}
```

Pengujian:

```js
const original = 10;
const encoded = encode(original);
const decoded = decode(encoded);

console.log(decoded); // 10
```

Secara matematika:

```text
f⁻¹(f(x)) = x
```

Fungsi invers mengembalikan output ke input awal.

---

## Fungsi Genap

```js
function f(x) {
  return x ** 2;
}

f(3);  // 9
f(-3); // 9
```

Karena:

```text
f(−x) = f(x)
```

---

## Fungsi Ganjil

```js
function f(x) {
  return x ** 3;
}

f(3);  // 27
f(-3); // -27
```

Karena:

```text
f(−x) = −f(x)
```

---

# Modul 8 — Kardinalitas

## Kardinalitas

Kardinalitas seperti properti `.length`.

```js
const users = [
  "Andi",
  "Budi",
  "Citra",
];

users.length; // 3
```

Secara matematika:

```text
|Users| = 3
```

Untuk `Set`:

```js
const roles = new Set([
  "admin",
  "editor",
  "viewer",
]);

roles.size; // 3
```

---

## Himpunan Ekuivalen

Dua himpunan ekuivalen jika seluruh anggotanya dapat dipasangkan satu-satu.

```js
const users = [
  "Andi",
  "Budi",
  "Citra",
];

const laptops = [
  "Laptop A",
  "Laptop B",
  "Laptop C",
];
```

Pasangan:

```text
Andi  → Laptop A
Budi  → Laptop B
Citra → Laptop C
```

Walaupun isi kedua array berbeda, jumlah anggotanya sama.

```js
users.length === laptops.length; // true
```

---

## Himpunan Tak Hingga

Himpunan tak hingga dapat dianalogikan dengan generator yang terus menghasilkan nilai.

```js
function* naturalNumbers() {
  let number = 1;

  while (true) {
    yield number;
    number++;
  }
}
```

Generator tersebut secara konsep tidak pernah selesai.

```js
const numbers = naturalNumbers();

numbers.next().value; // 1
numbers.next().value; // 2
numbers.next().value; // 3
```

---

## Himpunan Terbilang

Bilangan genap dapat dipasangkan dengan bilangan asli.

```js
function bilanganGenap(n) {
  return 2 * n;
}
```

Pasangan:

```text
1 → 2
2 → 4
3 → 6
4 → 8
```

Walaupun bilangan genap merupakan bagian dari bilangan asli, keduanya sama-sama dapat dihitung secara berurutan.

---

# Modul 9 — Pembuktian

## Pembuktian sebagai Testing

Pembuktian matematika dapat dianalogikan dengan testing, tetapi lebih kuat.

Testing hanya mengecek beberapa contoh:

```js
expect(isEven(2)).toBe(true);
expect(isEven(4)).toBe(true);
expect(isEven(6)).toBe(true);
```

Pembuktian memastikan aturan berlaku untuk seluruh kemungkinan input yang memenuhi syarat.

```text
n = 2k
```

Jika suatu bilangan berbentuk `2k`, bilangan tersebut selalu genap untuk nilai bulat `k` apa pun.

---

## Pembuktian Langsung

Pembuktian langsung seperti mengikuti alur program dari input menuju output.

Misalkan dua bilangan genap:

```text
a = 2m
b = 2n
```

Jumlahnya:

```text
a + b
= 2m + 2n
= 2(m + n)
```

Karena hasilnya tetap berbentuk `2 × bilangan bulat`, hasilnya genap.

Dalam pemrograman:

```js
function tambahBilanganGenap(m, n) {
  const a = 2 * m;
  const b = 2 * n;

  return a + b;
}
```

Apa pun nilai bulat `m` dan `n`, hasilnya selalu genap.

---

## Pembuktian Kontraposisi

Kontraposisi seperti memeriksa kondisi gagal untuk menyimpulkan syarat awal tidak terpenuhi.

Aturan:

```text
Jika token valid,
request dapat diproses.
```

Kontraposisi:

```text
Jika request tidak dapat diproses,
token tidak valid.
```

```js
if (!requestCanBeProcessed) {
  tokenIsValid = false;
}
```

Dalam matematika:

```text
p → q
```

setara dengan:

```text
¬q → ¬p
```

---

## Pembuktian Kontradiksi

Kontradiksi seperti menggunakan assertion.

```js
function proses(value) {
  console.assert(
    value > 0,
    "Value seharusnya positif"
  );
}
```

Dalam pembuktian, kita menganggap kebalikan dari pernyataan benar. Jika asumsi tersebut menyebabkan kondisi yang mustahil, asumsi itu salah.

Pola:

```text
Anggap pernyataan salah
→ ikuti konsekuensinya
→ ditemukan pertentangan
→ asumsi awal salah
→ pernyataan asli benar
```

---

## Induksi Matematika

Induksi matematika mirip dengan recursion.

```js
function jumlah(n) {
  if (n === 1) {
    return 1;
  }

  return n + jumlah(n - 1);
}
```

Struktur induksi:

### Basis

Pastikan kasus pertama benar.

```js
jumlah(1) === 1;
```

### Hipotesis induksi

Anggap rumus benar untuk `n = k`.

### Langkah induksi

Buktikan bahwa jika benar untuk `k`, rumus juga benar untuk `k + 1`.

Analogi lainnya adalah automated loop:

```js
let kondisiBenar = true;

for (let n = 1; n <= 100; n++) {
  kondisiBenar =
    kondisiBenar && cekPernyataan(n);
}
```

Perbedaannya, induksi membuktikan untuk seluruh bilangan asli, bukan hanya sampai 100.

---

## Rekursi

Rekursi mendefinisikan nilai berdasarkan nilai sebelumnya.

```js
function factorial(n) {
  if (n === 0) {
    return 1;
  }

  return n * factorial(n - 1);
}
```

Dalam matematika:

```text
0! = 1
n! = n × (n − 1)!
```

Bagian:

```js
if (n === 0) {
  return 1;
}
```

disebut base case.

Tanpa base case, recursion tidak berhenti.

```js
function error(n) {
  return error(n - 1);
}
```

Hasilnya:

```text
Maximum call stack size exceeded
```

Konsep ini sama dengan definisi rekursif yang harus memiliki kondisi awal.

---

# Ringkasan Hubungan Matematika dan Pemrograman

| Matematika       | Pemrograman                        |   |   |
| ---------------- | ---------------------------------- | - | - |
| Himpunan         | `Set` atau array                   |   |   |
| Anggota himpunan | Nilai dalam array                  |   |   |
| Himpunan bagian  | `every()` dan `includes()`         |   |   |
| Gabungan         | Spread operator dan `Set`          |   |   |
| Irisan           | `filter()` dan `includes()`        |   |   |
| Selisih          | `filter()` dan negasi              |   |   |
| Kardinalitas     | `.length` atau `.size`             |   |   |
| Proposisi        | Ekspresi Boolean                   |   |   |
| Negasi           | `!`                                |   |   |
| Konjungsi        | `&&`                               |   |   |
| Disjungsi        | `                                  |   | ` |
| Implikasi        | Aturan `if`                        |   |   |
| Relasi           | Hubungan antardata                 |   |   |
| Fungsi           | Function murni                     |   |   |
| Domain           | Input yang valid                   |   |   |
| Kodomain         | Tipe target output                 |   |   |
| Range            | Output yang benar-benar dihasilkan |   |   |
| Komposisi        | Function chaining                  |   |   |
| Invers           | Encode dan decode                  |   |   |
| Induksi          | Recursion                          |   |   |
| Pembuktian       | Verifikasi seluruh kasus           |   |   |
| Contoh soal      | Unit test beberapa kasus           |   |   |

# Cara Belajar yang Cocok

Setiap menemukan simbol matematika, ubah terlebih dahulu menjadi pertanyaan pemrograman.

Contoh:

```text
A ⊆ B
```

Ubah menjadi:

```js
A.every((item) => B.includes(item));
```

Contoh:

```text
A ∩ B
```

Ubah menjadi:

```js
A.filter((item) => B.includes(item));
```

Contoh:

```text
p ∧ q
```

Ubah menjadi:

```js
p && q;
```

Contoh:

```text
(f ∘ g)(x)
```

Ubah menjadi:

```js
f(g(x));
```

Dengan pendekatan ini, simbol matematika tidak perlu dihafalkan sebagai bentuk abstrak. Simbol tersebut dapat dipahami sebagai operasi yang sebenarnya sudah biasa digunakan dalam pemrograman.
