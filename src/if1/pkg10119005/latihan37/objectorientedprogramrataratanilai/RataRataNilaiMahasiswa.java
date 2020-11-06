/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan37.objectorientedprogramrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menghitung rata rata nilai Mahasiswa
 *                     dengan berbasis objek
 */
public class RataRataNilaiMahasiswa {
    private static Scanner scanner = new Scanner(System.in);
    private static int i, jumlahMahasiswa;      
    private static float jumlah, nilaiMahasiswa, rataRataNilai;
    
    private static int inputJumlahMhs() {
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        return jumlahMahasiswa;
    }
    
    public static double hitungRataRataNilai() {
        inputJumlahMhs();
        jumlah = 0;
        i=1;
        while (i <= jumlahMahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilaiMahasiswa = scanner.nextFloat ();
                jumlah += nilaiMahasiswa;
                i++;
        }
        rataRataNilai = jumlah / jumlahMahasiswa;
        return rataRataNilai;
    }
}
    
