// Soal 1. Buatlah Pola Segitiga dari NIM, Ambil digit terakhir NIM Anda sebagai tinggi segitiga.
// Contoh: NIM 230411013  (digit terakhir = 3,  tinggi segitiga = 3).
// Buat program TypeScript untuk mencetak segitiga angka dengan pola berikut:
// 1
// 1 2
// 1 2 3
// Jika tinggi segitiga = 5, maka baris terakhir menampilkan angka 1 sampai 5, dan seterusnya.
//

const nim = "053497355";
let tinggi = Number(nim.charAt(nim.length - 1));

for (let i = 1; i <= tinggi; i++) {
  let tempArray = [];
  for (let j = 1; j <= i; j++) {
    tempArray.push(j);
  }

  console.log(tempArray.join(" "));
}

// ini soal 1

// Soal 2. Buatlah Deret Aritmatika dengan NIM. Ambil 2 digit terakhir NIM, jadikan angka awal deret.
// Ambil digit ke-3 dari belakang, jadikan beda (step).
// Buat program TypeScript untuk mencetak 10 angka pertama dari deret aritmatika tersebut.
// Contoh: NIM 230411013, 2 digit terakhir = 13,  berarti start dari 13.  digit ke-3 dari belakang + 1 (0 + 1), sehingg beda nya = 1 step.
// Output:13, 14, 15, 16, 17, 18, 19, 20, 21, 22
//

let start = Number(nim.slice(nim.length - 2));
let step = Number(nim.charAt(nim.length - 3));

const tempArray = [];
for (let i = 0; i < 10; i++) {
  tempArray.push(start);
  start += step;
}
console.log(tempArray.join(", "));

// Soal 3. Buatlah Bilangan Prima dari NIM. Ambil 2 digit terakhir NIM dan tambahkan 10, jadikan batas akhir pencarian bilangan prima.
// Buat program TypeScript untuk menampilkan semua bilangan prima dari 1 sampai batas tersebut.
// Contoh: NIM 230411013, 2 digit terakhir  yaitu 13 ditambah 10, sehingga menjadi 23 (batas akhir)
// Output: 2, 3, 5, 7, 11, 13, 17, 19, 23
//

let end = Number(nim.slice(nim.length - 2)) + 10;

let listOfNumber = [...Array(end + 1).keys()];

let tempArrPrime = [];
for (const num of listOfNumber) {
  if (num < 2) continue;

  let isPrime = true;
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) {
      isPrime = false;
      break;
    }
  }

  if (isPrime) {
    tempArrPrime.push(num);
  }
}

console.log(tempArrPrime.join(", "));
