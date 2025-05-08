/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugassatu;

import java.util.LinkedList;

/**
 *
 * @author dhil
 */
public class TugasSatu {
    
    static class SoalSatu {
        int jumlahBaris = 5;
        
        void print(){
            System.out.println(jumlahBaris);
        }
    }
    
    static class SoalDua {
        String kalimatBaru = "Deklarasi tipe data String";
        
        void print(){
            System.out.println(kalimatBaru);
        }
    }
    
    static class SoalTiga {
        int[] empatAngka = new int[4];
        
        void print(){
            //(07, 10, 20, 23)
            empatAngka[0] = 7;
            empatAngka[1] = 10;
            empatAngka[2] = 20;
            empatAngka[3] = 23;
            
            for (int i = 0; i < empatAngka.length; i++) {
                System.out.print(empatAngka[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    static class SoalEmpat {
        //psn, wlb, fre
        String[][] alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"}
        };
        
        void print(){ 
            for (int i = 0; i < alfabet.length; i++) {
                for (int j = 0; j < alfabet[i].length; j++) {
                    System.out.print(alfabet[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    static class SoalLima {
        //listAngka' yang memiliki list (26, 08, 23, 24, 16)
        LinkedList<String> listAngka = new LinkedList();
        
        void print(){ 
            //mohon maaf ada typo pak
            listAngka.add("26");
            listAngka.add("08");
            listAngka.add("23");
            listAngka.add("24");
            listAngka.add("16");
            
            for (String angka : listAngka) {
                System.out.println("listAngka -> " + angka);
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        SoalSatu soal1 = new SoalSatu();
        soal1.print();
        System.out.println("===============================");
        
        SoalDua soal2 = new SoalDua();
        soal2.print();
        System.out.println("===============================");
        
        SoalTiga soal3 = new SoalTiga();
        soal3.print();
        System.out.println("===============================");
        
        SoalEmpat soal4 = new SoalEmpat();
        soal4.print();
        System.out.println("===============================");
        
        SoalLima soal5 = new SoalLima();
        soal5.print();
        System.out.println("===============================");
    }
}
