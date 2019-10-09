/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan21programrataratanilai;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
* @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program menghitung rata-rata nilai
 */
public class PBO10118045Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkkan Banyaknya Mahasiswa : ");
        Scanner banyak = new Scanner(System.in);
        int j = banyak.nextInt();
        int [] nilai = new int [j];
        for (int i = 0; i < j; i++){
            System.out.print("Nilai Mahasiswa ke-"+(1+i)+": " );
            Scanner skor = new Scanner(System.in);
            nilai[i] = skor.nextInt();         
        }
        double sum = IntStream.of(nilai).sum();
        double avg = sum/j;
        System.out.println("Maka, Rata-rata Nilainya adalah "+avg);
        System.out.println("Developed By : Muhammad Ilham Apriyadi");
        
    }
    
}
