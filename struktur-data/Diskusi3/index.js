// let a = [7,2,9,0,1,2,0,9,7,4,4,6,9,1,0,9,3,2,5,9]
// let max = Math.max(...a)
// let c = new Array(max + 1).fill(0)
// for(let i = 0; i<a.length; i++){
//   const element = a[i]
//   c[element]++
// }
// let cAcsen = Array.from(c)
// for (let i = 1; i < cAcsen.length; i++) {
//   cAcsen[i] += cAcsen[i-1]
// }
// let b = Array.from(a)
// for (let i = 0; i < a.length; i++) {
//   //ketika di looping index ke i
//   // ambil item dari a assign ke getFromA valuenya
//   const getFromA = a[i]
//   const getFromCAcsen = cAcsen[getFromA]

//   const valueBToAssign = getFromCAcsen
//   const indexBToAssign = 
//   b[indexBToAssign] = getFromA
//   cAcsen[indexBToAssign]--

//   console.log(`i: ${i}, getFromA: ${getFromA}, getFromCAcsen: ${getFromCAcsen}, valueBToAssign: ${valueBToAssign}, indexBToAssign: ${indexBToAssign}`)

// }
// console.log(max, c, cAcsen, b)

// function countingSort(arr) {
//   // Temukan nilai maksimum untuk menentukan ukuran array penghitung
//   const maxValue = Math.max(...arr);
  
//   // Langkah 1: Buat array penghitung (count array) dengan ukuran maxValue + 1
//   const count = new Array(maxValue + 1).fill(0);
  
//   // Hitung frekuensi setiap elemen
//   for (let i = 0; i < arr.length; i++) {
//       count[arr[i]]++;
//   }
  
//   // Langkah 2: Ubah array count menjadi posisi kumulatif
//   for (let i = 1; i < count.length; i++) {
//       count[i] += count[i - 1];
//   }
  
//   // Langkah 3: Bangun array output
//   const output = new Array(arr.length);
//   for (let i = arr.length - 1; i >= 0; i--) {
//       output[count[arr[i]] - 1] = arr[i];
//       count[arr[i]]--;
//   }
  
//   // Salin hasil ke array asli (opsional, tergantung kebutuhan)
//   for (let i = 0; i < arr.length; i++) {
//       arr[i] = output[i];
//   }
  
//   return arr;
// }

// // Contoh penggunaan
// let array = [7,2,9,0,1,2,0,9,7,4,4,6,9,1,0,9,3,2,5,9];
// console.log("Array sebelum diurutkan:", array);
// countingSort(array);
// console.log("Array setelah diurutkan:", array);

// function mergeSort(arr) {
//   if (arr.length <= 1) {
//     return arr;
//   }

//   const mid = Math.floor(arr.length / 2);
//   console.log("🚀 ~ mergeSort ~ mid:", mid)
//   const left = mergeSort(arr.slice(0, mid));
//   console.log("🚀 ~ mergeSort ~ left:", left)
//   const right = mergeSort(arr.slice(mid));
//   console.log("🚀 ~ mergeSort ~ right:", right)

//   return merge(left, right);
// }

// function merge(left, right) {
//   const result = [];
//   let i = 0;
//   let j = 0;

//   while (i < left.length && j < right.length) {
//     if (left[i] < right[j]) {
//       result.push(left[i]);
//       i++;
//     } else {
//       result.push(right[j]);
//       j++;
//     }
//   }

//   return result.concat(left.slice(i)).concat(right.slice(j));
// }
// Contoh penggunaan
let array = [7, 2, 9, 0, 1, 2, 0, 9, 7, 4, 4, 6, 9, 1, 0, 9, 3, 2, 5, 9];
console.log("Array sebelum diurutkan:", array);
let sortedArray = mergeSort(array);
console.log("Array setelah diurutkan:", sortedArray);