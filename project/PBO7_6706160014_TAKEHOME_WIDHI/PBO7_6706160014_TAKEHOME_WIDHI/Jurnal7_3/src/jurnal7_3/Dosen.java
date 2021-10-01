/*
 * Muhammad Faisal Amir
 * id.amirisback.bandung
 * Copyright 2017
 */
package jurnal7_3;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Paths;

/**
 *
 * @author Faisal Amir
 */
public class Dosen implements Serializable {
    private String namaDosen;
    private String mataKuliah;
    private int umurDosen;
    

    public Dosen(String namaDosen, String mataKuliah, int umurDosen) {
        this.namaDosen = namaDosen;
        this.mataKuliah = mataKuliah;
        this.umurDosen = umurDosen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getUmurDosen() {
        return umurDosen;
    }

    public void setUmurDosen(int umurDosen) {
        this.umurDosen = umurDosen;
    }
    
    
    
    
    public void simpanObject(Dosen d){
        try {
        String dir = "..\\Jurnal7_3\\file_create\\";
        FileOutputStream fos = new FileOutputStream(dir+"Dosen.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        } catch (IOException e){
            System.out.println("Terjadi " +e);
        }
    }   
    
    public void bacaObject(Dosen d){
        try {
            String dir = "..\\Jurnal7_3\\file_create\\";
            FileInputStream fis = new FileInputStream(dir+"Dosen.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
           while((d=(Dosen)ois.readObject())!=null){		
                d.tampil();						
            }
            
        } catch (IOException e){
            System.exit(0);
        } catch (Exception i) {
            System.out.println("Eror Exce " +i);
        }
    }
    
    public void tampil(){
        System.out.println("Data Dosen -------->");
        System.out.println("Nama Dosen \t\t: " +namaDosen);
        System.out.println("Matakuliah \t\t: " +mataKuliah);
        System.out.println("Umur Dosen \t\t: " +umurDosen);
    }
    
}
