/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal3;

/**
 *
 * @author Praktikan
 */
public class Character {
    private String nama, jenisKelamin, role;

    public Character(String nama, String jenisKelamin, String role) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.role = role;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void LihatChar(){
        System.out.println("Nama \t\t: " +getNama());
        System.out.println("Jenis Kelamin \t: " +getJenisKelamin());
        System.out.println("Role \t\t: " +getRole());
    }
    
}