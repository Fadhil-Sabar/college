Nama: Fadhil Andriawan
NIM: 053497355
Prodi: Sistem Informasi

Selamat siang Bapak tutor, berikut untuk tugas saya.

```Java
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Golongan Karyawan : ");

        String golongan = scanner.nextLine();
        
        int gajiPokok = 0;
        double gajiLembur = 0;

        int[] listGaji = {5000000, 6500000, 9500000};

        if(golongan.equalsIgnoreCase("A")){
            gajiPokok = listGaji[0];
        }else if (golongan.equalsIgnoreCase("B")){
            gajiPokok = listGaji[1];
        }else if (golongan.equalsIgnoreCase("C")){
            gajiPokok = listGaji[2];
        }else{
            System.out.println("Golongan tidak valid (A/B/C)");

            scanner.close();
            return;
        }

        System.out.print("Masukkan Jumlah Jam Lembur : ");

        String jamLembur = scanner.nextLine();
        int[] persenLembur = {30,32,34,36,38};
        
        int jamLemburInteger = Integer.parseInt(jamLembur);
        if(jamLemburInteger == 1){
            gajiLembur = (persenLembur[0] / 100.0 * gajiPokok);
        } else if(jamLemburInteger == 2){
            gajiLembur = (persenLembur[1] / 100.0 * gajiPokok);
        } else if(jamLemburInteger == 3){
            gajiLembur = (persenLembur[2] / 100.0 * gajiPokok);
        } else if(jamLemburInteger == 4){
            gajiLembur = (persenLembur[3] / 100.0 * gajiPokok);
        } else if(jamLemburInteger >= 5){
            gajiLembur = (persenLembur[4] / 100.0 * gajiPokok);
        }

        double totalGaji = gajiPokok + gajiLembur;


        scanner.close();

        System.out.println("Jumlah Penghasilan: " + Math.round(totalGaji));
    }
}
```

Sumber referensi:

- BMP MSIM4203 Modul 6-7
- <https://www.w3schools.com/java/java_user_input.asp>
- <https://www.w3schools.com/java/ref_string_equalsignorecase.asp>
- <https://www.w3schools.com/java/ref_math_round.asp>
