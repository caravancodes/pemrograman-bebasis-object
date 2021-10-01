/*
 * Muhammad Faisal Amir
 * id.amirisback.bandung
 * Copyright 2017
 */
package jurnal7_1;

import java.io.IOException;

/**
 *
 * @author Faisal Amir
 */
public class Jurnal7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte[] data = new byte[15];
        int nim = 0;
        System.out.print("MASUKKAN NIM : ");
        try {
            nim = System.in.read(data);
            System.out.print("NIM ANDA : ");
            System.out.write(data);
            System.out.println("Panjang karakter : " + nim);
        }catch (IOException e){
            System.out.println("Eror");
        }
    }
    
}
