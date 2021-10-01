/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo7_jurnal;

import java.io.Serializable;

/**
 *
 * @author Praktikan
 */
public class PBO7_Jurnal implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen dsn = new Dosen("Rachmadi Wijaya","RWJ","MATIF40","Matematika Informatika");
        Mahastudents mhs1 = new Mahastudents("6706160007","Vanda","98");
        Mahastudents mhs2 = new Mahastudents("6706160022","Siapa","90");
        Mahastudents mhs3 = new Mahastudents("6706160066","Nanya","88");
        Kelas a1 = new Kelas ("D3 IF 40-01");
        a1.setDsn(dsn);
        a1.setMhs(mhs1);
        a1.setMhs(mhs2);
        a1.setMhs(mhs3);
        a1.SimpanObject(a1);
        a1.bacaObject(a1);
    
    }
    }
    

