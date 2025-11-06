Selamat malam Bapak tutor, berikut untuk tugas saya.

```Java
import java.util.Scanner;

public static void main() {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Masukkan Golongan Karyawan : ");

  String golongan = scanner.nextLine();
  
  int gajiPokok = 0;
  double gajiLembur = 0;
  
  if(golongan.equalsIgnoreCase("A")){
    gajiPokok += 5000000;
  }else if (golongan.equalsIgnoreCase("B")){
    gajiPokok += 6500000;
  }else if (golongan.equalsIgnoreCase("C")){
    gajiPokok += 9500000;
  }else{
    System.out.println("Golongan tidak valid (A/B/C)");

    scanner.close();
    return;
  }

  System.out.print("Masukkan Jumlah Jam Lembur : ");

  String jamLembur = scanner.nextLine();
  
  int jamLemburInteger = Integer.parseInt(jamLembur);
  if(jamLemburInteger == 1){
    gajiLembur = (0.30 * gajiPokok);
  } else if(jamLemburInteger == 2){
    gajiLembur = (0.32 * gajiPokok);
  } else if(jamLemburInteger == 3){
    gajiLembur = (0.34 * gajiPokok);
  } else if(jamLemburInteger == 4){
    gajiLembur = (0.36 * gajiPokok);
  } else if(jamLemburInteger >= 5){
    gajiLembur = (0.38 * gajiPokok);
  }

  double totalGaji = gajiPokok + gajiLembur;


  scanner.close();

  System.out.println("Jumlah Penghasilan: " + Math.round(totalGaji));
}
```

Pada tugas kali ini saya menggunakan util bawaan Java yaitu Scanner untuk mengambil input dari terminal.

Sumber referensi:
- BMP MSIM4203 Modul 4-6
- https://www.w3schools.com/java/java_user_input.asp
- https://www.w3schools.com/java/ref_string_equalsignorecase.asp
- https://www.geeksforgeeks.org/java/float-parsefloat-method-in-java-with-examples/
- https://www.w3schools.com/java/ref_math_round.asp