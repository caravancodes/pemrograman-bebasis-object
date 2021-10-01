/*
 * Muhammad Faisal Amir
 * id.amirisback.bandung
 * Copyright 2017
 */
package jurnal7_3;
import java.util.Scanner;
/**
 *
 * @author Faisal Amir
 */
public class Jurnal7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Nama \t\t: ");
        String nama = in.next();
        System.out.print("Masukkan MataKuliah \t: ");
        String matkul = in.next();
        System.out.print("Masukkan Umur \t\t: ");
        int umur = in.nextInt();
        Dosen isi = new Dosen(nama, matkul, umur);
        isi.simpanObject(isi);
        System.out.println("");
        isi.bacaObject(isi);
        
    }
    
}
