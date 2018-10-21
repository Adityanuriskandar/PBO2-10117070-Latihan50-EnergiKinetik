/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan50.energikinetik;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung energi
 * kinetik dan nilai usahanya
 */
public class PBO210117070Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("1 buah baseball dengan massa = " + bola.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + bola.getKecepatan() + " m/s");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + bola.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
