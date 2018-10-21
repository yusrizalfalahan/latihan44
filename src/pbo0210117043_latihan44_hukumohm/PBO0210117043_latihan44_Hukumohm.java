/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan44_hukumohm;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN HASIL PERHITUNGAN KUAT ARUS
 * @author Acer
 */
public class PBO0210117043_latihan44_Hukumohm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();

        System.out.println("Kuat Arus: " + baterai.getKuatarus() + "ampere");
        System.out.println("Hambatan: " + baterai.getHambatan() + "ohm");
        System.out.println("Hasil Tegangan: " + baterai.hitungtegangan() + "volt");
    }

}
