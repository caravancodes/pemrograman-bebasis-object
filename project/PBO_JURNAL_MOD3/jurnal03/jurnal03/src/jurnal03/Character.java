/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal03;

/**
 *
 * @author MSI
 */
public class Character {
    private String nama;
    private String jeniskelamin;
    private String role;

    public Character(String nama,String jeniskelamin, String role) {
        this.nama = nama;
        this.role = role;
        this.jeniskelamin = jeniskelamin;
    }
    
    public void lihatkarakter(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Role\t\t: "+role);
        System.out.println("Jenis Kelamin\t: "+jeniskelamin);
    }

    public String getNama() {
        return nama;
    }
    
}
