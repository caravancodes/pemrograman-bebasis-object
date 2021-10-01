/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo7_jurnal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Praktikan
 */
public class Kelas implements Serializable{
    Mahastudents[] mhs = new Mahastudents[40];
    private Dosen dsn;
    private String nama;
    private int kapasitas=0;

    public Kelas(String nama) {
        this.nama = nama;
    }

    public void setMhs(Mahastudents mhs) {
        this.mhs[kapasitas] = mhs;
        kapasitas++;
    }

    public void setDsn(Dosen dsn) {
        this.dsn = dsn;
    }

    public Mahastudents[] getMhs() {
        return mhs;
    }

    public Dosen getDsn() {
        return dsn;
    }

    public String getNama() {
        return nama;
    }
    
    public void tampil(){
        System.out.println("========== DATA RUANGAN KELAS "+ this.nama+" ===========");
        System.out.println("NAMA DOSEN         : "+dsn.getNama());
        System.out.println("KODE DOSEN         : "+dsn.getNip());
        System.out.println("KODE MATA KULIAH   : "+dsn.getKode_matkul());
        System.out.println("NAMA MATA KULIAH   : "+dsn.getMatkul());
        System.out.println();
        System.out.println();
        System.out.println("========== DATA NILAI KELAS "+ this.nama +" =============");
        for (int i = 0; i < kapasitas; i++) {
            System.out.println(this.mhs[i].getNim()+ " : "+this.mhs[i].getNama()+ " : "+this.mhs[i].getNilai());
            
        }
    }
    
    public void SimpanObject(Kelas a){
        try{								
            FileOutputStream fos=new FileOutputStream("dtMhs.txt");	
            ObjectOutputStream oos=new ObjectOutputStream(fos);	
            oos.writeObject(a);						
            oos.flush();							
        }
        catch(IOException ioe){						
            System.err.println("ERROR "+ioe);			
        }									
    }
    
    public void bacaObject(Kelas a){
        try{								
            FileInputStream fis =new FileInputStream("dtMhs.txt");		
            ObjectInputStream ois=new ObjectInputStream(fis);		
            while((a=(Kelas)ois.readObject())!=null)			
                a.tampil();							
        }catch(IOException ioe){						
			System.exit(1);					
        }catch(Exception e){						
        System.exit(1);							
        }
    }
}
