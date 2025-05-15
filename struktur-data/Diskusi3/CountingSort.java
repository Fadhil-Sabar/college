public class CountingSort { //* define class CountingSort */
    void sort(char arr[]){ //* define fungsi sort dengan parameter array char */
        int n = arr.length; //* define variabel untuk menampun panjang array */
        char output[] = new char[n]; //* define variable baru untuk menampung output */
        int count[] = new int[256]; //* define variabel untuk melakukan perhitungan */

        //* disini dilakukan looping untuk mengisi value ke array count default 0 semua */
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }

        //* looping untuk memasukkan nilai ke array count, sesuai algoritma, dimana banyaknya angka sesuai index array */
        for (int i = 0; i < n; i++){
            count[arr[i]]++; //* melakukan increment ke array count index arr[] */
        }

        //* looping untuk menambahkan nilai index array dengan nilai index array sebelumnya */
        for (int i = 1; i <= 255; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < n; i++) {
            //* looping untuk memasukkan nilai ke array output[] dengan value dari arr[] index ke i */
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--; //* melakukan decrement ke nilai array count[] */
        }

        //* looping untuk mereplace value dari array[] dengan array output[] */
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }
    public static void main(String[] args) {
        CountingSort cs = new CountingSort(); //* define object baru */
        char arr[] = {'u', 'n', 'i', 'v', 'e', 'r', 's', 'i', 't', 'a', 's', 't', 'e', 'r', 'b', 'u', 'k', 'a'}; //* define array untuk dilakukan sort */

        //* memanggil method sort dari object CountingSort */
        cs.sort(arr);

        //* looping untuk mencetak nilai array arr[] */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
