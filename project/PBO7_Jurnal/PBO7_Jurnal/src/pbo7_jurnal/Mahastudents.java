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
public class Mahastudents implements Serializable {
    private String nama;
    private String nim;
    private String nilai;

    public Mahastudents(String nama, String nim, String nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNilai() {
        return nilai;
    }
}
