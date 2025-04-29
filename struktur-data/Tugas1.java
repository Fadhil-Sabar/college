import java.util.LinkedList;

public class Tugas1 {
    static class Soal1 {
        int jumlahBaris = 5;

        void print() {
            System.out.println(jumlahBaris);
        }
    }

    static class Soal2 {
        String kalimatBaru = "Deklarasi tipe data String";

        void print() {
            System.out.println(kalimatBaru);
        }
    }

    static class Soal3 {
        int empatAngka[] = {7,10,20,23};

        void print() {
            for (int i = 0; i < empatAngka.length; i++) {
                System.out.print(empatAngka[i] + " ");
            }
            System.out.println();
        }
    }

    static class Soal4 {
        String[][] alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"}
        };

        void print() {
            for (int i = 0; i < alfabet.length; i++) {
                for (int j = 0; j < alfabet[i].length; j++) {
                    System.out.print(alfabet[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static class Soal5 {
        LinkedList<Integer> listAngka = new LinkedList<Integer>();

        void print() {
            listAngka.add(26);
            listAngka.add(8);
            listAngka.add(23);
            listAngka.add(24);
            listAngka.add(16);

            for(Object angka : listAngka){
                System.out.print(angka + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Soal1 soal1 = new Soal1();
        soal1.print();

        System.out.println("================================");
        
        Soal2 soal2 = new Soal2();
        soal2.print();
        
        System.out.println("================================");
        
        Soal3 soal3 = new Soal3();
        soal3.print();

        System.out.println("================================");

        Soal4 soal4 = new Soal4();
        soal4.print();

        System.out.println("================================");

        Soal5 soal5 = new Soal5();
        soal5.print();

        System.out.println("================================");
    }
}
