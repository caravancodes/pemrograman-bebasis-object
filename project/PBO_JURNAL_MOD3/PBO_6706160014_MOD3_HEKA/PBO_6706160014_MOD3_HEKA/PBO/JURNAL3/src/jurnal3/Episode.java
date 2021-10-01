/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal3;
import java.util.ArrayList;
/**
 *
 * @author Praktikan
 */
public class Episode {
    private String judul, ke;
    ArrayList<Character> daftarcharmuncul = new ArrayList<>();

    public Episode(String judul, String ke) {
        this.judul = judul;
        this.ke = ke;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKe() {
        return ke;
    }

    public void setKe(String ke) {
        this.ke = ke;
    }
    
    public void showChar(){
        for(int i = 0; i < daftarcharmuncul.size() ; i++){
            System.out.println("Nama \t\t: " +daftarcharmuncul.get(i).getNama());
            System.out.println("Jenis Kelamin \t: " +daftarcharmuncul.get(i).getJenisKelamin());
            System.out.println("Role \t\t: " +daftarcharmuncul.get(i).getRole());
        }
    }
    
    public void LihatInfoEps() {
        System.out.println("Judul \t: " +getJudul());
        System.out.println("Episode \t: " +getKe());  
    }
    
    public void AddChar(Character c){
        daftarcharmuncul.add(c);
    }
}