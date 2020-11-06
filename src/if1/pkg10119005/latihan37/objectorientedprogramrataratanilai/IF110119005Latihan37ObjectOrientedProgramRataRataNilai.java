/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan37.objectorientedprogramrataratanilai;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menghitung rata rata nilai Mahasiswa
 *                     dengan berbasis objek
 */
public class IF110119005Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RataRataNilaiMahasiswa nilaiMahasiswa = new RataRataNilaiMahasiswa();
        double rataRataNilai = nilaiMahasiswa.hitungRataRataNilai();
        System.out.println("\nMaka, Rata-rata Nilainya adalah: "+rataRataNilai);
        System.out.println("Developed by : Hayin Ananata");
    }
    
}
