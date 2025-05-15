class MergeSort {
    static void merge(int arr[] /*array yang akan dimerge */, int l /* untuk index start array kiri */, int m /* untuk batas tengah kedua array */, int r /* untuk index end array */) //deklarasi fungsi merge, dengan 3 parameter
    {
        // * Array dibagi ke dalam dua bagian, yaitu sebagai perandaian n1 (array sisi kiri) dan n2 (array sisi kanan)
        int n1 = m - l + 1; // * Membuat panjang array 1 dengan batas tengah - index start array + 1 karena array dimulai dari 0
        int n2 = r - m; // * Membuat panjang array 2 dengan index terakhir - batas tengah

        int L[] = new int[n1]; // * Membuat array sisi kiri dengan panjang n1
        int R[] = new int[n2]; // * membuat array sisi kanan dengna panjang n2

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i]; // * Disini dilakukan looping mulai dari 0 hingga panjang array sisi kiri yaitu n1, untuk mengisi value array L[i] dengan value arr[l + i] yaitu array sisi kiri index ke i
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];// * Disini dilakukan looping mulai dari m batas tengah hingga panjang array sisi kanan yaitu n2, untuk mengisi value array R[i] dengan value arr[m + 1 + j] yaitu array sisi kanan index ke j

        int i = 0, j = 0; // * Define variable sementara untuk index sub array

        int k = l; // * Define variabel untuk menentukan posisi awal penggabungan di array utama mulai dari index l

        while (i < n1 && j < n2) { // * Loop berjalan untuk kedua subarray
            if (L[i] <= R[j]) { // * Jika elemen dari array kiri (L[i]) lebih kecil atau sama dengan elemen dari array kanan (R[j])
                arr[k] = L[i];  // * Masukkan elemen dari array kiri ke array utama
                i++; // * Tambahkan index array kiri
            }
            else { // * Jika elemen dari array kanan lebih kecil
                arr[k] = R[j];  // * Masukkan elemen dari array kanan ke array utama
                j++; // * Tambahkan index array kanan
            }
            k++; // * Tambahkan index penggabungan di array utama
        }

        while (i < n1) {// * Loop berjalan jika masih ada elemen tersisa di array kiri
            arr[k] = L[i];// * Salin elemen tersisa dari array kiri ke array utama
            i++;// * Tambahkan index array kiri
            k++;// * Tambahkan index penggabungan
        }

        while (j < n2) {// * Loop berjalan jika masih ada elemen tersisa di array kanan
            arr[k] = R[j];// * Salin elemen tersisa dari array kanan ke array utama
            j++;// * Tambahkan index array kanan
            k++;// * Tambahkan index penggabungan
        }
    }

    static void sort(int arr[], int l, int r) { // * Fungsi utama untuk mengurutkan array dengan algoritma merge sort
        if (l < r) { // * Kondisi untuk memastikan ada lebih dari satu elemen yang akan diurutkan
            int m = l + (r - l) / 2; // * Hitung titik tengah dengan rumus l + (r - l) / 2

            // * Proses pembagian dan pengurutan rekursif
            sort(arr, l, m);// * Panggil fungsi sort untuk mengurutkan bagian kiri array
            sort(arr, m + 1, r);// * Panggil fungsi sort untuk mengurutkan bagian kanan array

            // * Proses penggabungan setelah pengurutan
            merge(arr, l, m, r);// * Gabungkan dua subarray yang sudah terurut
        }
    }

    static void printArray(int arr[]) { // * Fungsi untuk menampilkan isi array
        int n = arr.length;// * Dapatkan panjang array
        for (int i = 0; i < n; ++i)// * Loop melalui semua elemen array
            System.out.print(arr[i] + " "); // * Cetak setiap elemen diikuti spasi
        System.out.println();// * Tambahkan baris baru setelah selesai mencetak
    }

    // Driver code
    public static void main(String args[]) { // * Fungsi utama untuk menjalankan program
        int arr[] = { 12, 11, 13, 5, 6, 7 }; // * Inisialisasi array dengan data contoh yang akan diurutkan

        System.out.println("Given array is"); // * Tampilkan judul array awal
        printArray(arr);// * Cetak isi array sebelum pengurutan

        sort(arr, 0, arr.length - 1);// * Panggil fungsi sort dengan batas awal 0 dan batas akhir panjang array - 1

        System.out.println("\nSorted array is"); // * Tampilkan judul array yang sudah diurutkan
        printArray(arr);// * Cetak isi array setelah pengurutan
    }
}