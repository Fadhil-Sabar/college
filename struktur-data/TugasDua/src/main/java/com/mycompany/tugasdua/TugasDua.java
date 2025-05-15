/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasdua;

/**
 *
 * @author dhil
 */
public class TugasDua {
    static enum Order {
        ASCENDING,
        DESCENDING
    };

    static class SoalSatu {
        static void merge(int arr[], int l, int m, int r, Order order){
            int a0 = m - l + 1;
            int a1 = r - m;

            int L[] = new int[a0];
            int R[] = new int[a1];

            for (int i = 0; i < a0; i++) {
                L[i] = arr[l + i];
            }

            for (int j = 0; j < a1; j++) {
                R[j] = arr[m + 1 + j];
            }

            //temp variable
            int i = 0;
            int j = 0;
            int k = l;

            while(i < a0 && j < a1){
                if(order.equals(Order.ASCENDING)){
                    if(L[i] <= R[j]){
                        arr[k] = L[i];
                        i++;
                    }else{
                        arr[k] = R[j];
                        j++;
                    }
                }else{
                    if(L[i] >= R[j]){
                        arr[k] = L[i];
                        i++;
                    }else{
                        arr[k] = R[j];
                        j++;
                    }
                }
                k++;
            }

            while(i < a0){
                arr[k] = L[i];
                i++;
                k++;
            }

            while(j < a1){
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        static void sort(int arr[], int l, int r, Order order){
            if(l < r){
                int m = (l+r) / 2;

                sort(arr, l, m, order);
                sort(arr, m + 1, r, order);

                merge(arr, l, m, r, order);
            }
        }
    }
    
    static class SoalDua {
        void sort(int arr[], Order order){
            int n = arr.length;
            int m = 0;
            
            for (int i = 0; i < n; i++) {
                m = Math.max(m, arr[i]);
            }
            
            int output[] = new int[n];
            int count[] = new int[m + 1];
            
            for (int i = 0; i < m; i++) {
                count[i] = 0;
            }
            
            for (int i = 0; i < n; i++) {
                count[arr[i]]++;
            }
            
            if(order.equals(Order.ASCENDING)){
                for (int i = 1; i <= m; i++) {
                    count[i] += count[i - 1];
                }
            }else{
                for (int i = m - 1; i >= 1; i--) {
                    count[i] += count[i + 1];
                }
            }
            
            for (int i = 0; i < n; i++) {
                output[count[arr[i]] - 1] = arr[i];
                count[arr[i]]--;
            }
            
            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
 
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        int nilai1 = 2, nilai2 = 3, nilai3 = 10, nilai4 = 5, nilai5 = 5, nilai6 = 20;
        int arr[] = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        
        SoalSatu soalSatu = new SoalSatu();
        System.out.println("Soal satu: ");
        printArray(arr);
        
        //ascending
//        sort(arr, 0, arr.length - 1, Order.ASCENDING);
        
        //descending sesuai soal
        soalSatu.sort(arr, 0, arr.length - 1, Order.DESCENDING);
        
        printArray(arr);
        
        nilai1 = 2; nilai2 = 3; nilai3 = 10; nilai4 = 5; nilai5 = 5; nilai6 = 20;
        arr[0] = nilai1;
        arr[1] = nilai2;
        arr[2] = nilai3;
        arr[3] = nilai4;
        arr[4] = nilai5;
        arr[5] = nilai6;
        
        System.out.println("Soal Dua: ");
        printArray(arr);
        
        SoalDua soalDua = new SoalDua();
        soalDua.sort(arr, Order.DESCENDING);
        
        printArray(arr);
    }
}
