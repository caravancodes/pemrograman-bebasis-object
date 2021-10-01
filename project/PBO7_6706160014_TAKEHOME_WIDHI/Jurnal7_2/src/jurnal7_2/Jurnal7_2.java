/*
 * Muhammad Faisal Amir
 * id.amirisback.bandung
 * Copyright 2017
 */
package jurnal7_2;
import java.io.*;
/**
 *
 * @author Faisal Amir
 */
public class Jurnal7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.print("Masukkan Nama Anda : ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String nama = br.readLine();
        System.out.print("Masukkan NIM Anda : ");
        String nim = br.readLine();
        System.out.print("Masukkan Kelas Annda : ");
        String kelas = br.readLine();

        // Bikin File
        File file1 = new File("..\\Jurnal7_2\\file_create\\File_Awal.txt");
        File file2 = new File("..\\Jurnal7_2\\file_create\\File_Akhir.txt");
        
        // Menulis isi ke dalam file
        FileOutputStream fos = new FileOutputStream(file1);
        DataOutputStream dos = new DataOutputStream(fos);
        for (int i = 0; i < 10; i++) {
        dos.writeBytes(nama + "\n");
        dos.writeBytes(nim + "\n");
        dos.writeBytes(kelas + "\n");
            
        }
        
        // Membaca isi file awal 
        FileInputStream fis = new FileInputStream(file1);
        DataInputStream dis = new DataInputStream(fis);
        String isiNamaAwal = dis.readLine();
        System.out.println("Isi file awal : " +isiNamaAwal);
        
        // Mengcopy isi file awal yang di baca ke file
        FileOutputStream fos2 = new FileOutputStream(file2);
        DataOutputStream dos2 = new DataOutputStream(fos2);
        dos2.writeBytes(isiNamaAwal);
        System.out.println("Isi file akhir : "+ isiNamaAwal);
        
        
        
    }
    
}
