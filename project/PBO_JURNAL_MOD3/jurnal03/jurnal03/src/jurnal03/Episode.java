/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal03;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Episode {
    private String judul;
    private String ke;
    private ArrayList<Character> daftarcharmuncul = new ArrayList();

    public Episode(String judul,String ke) {
        this.judul = judul;
        this.ke=ke;
    }

    public String getKe() {
        return ke;
    }
    
    public void lihatInfoEps(){
        System.out.println("Judul\t: "+judul);
        System.out.println("Episode\t: "+ke);
    }

    public void addChar(Character c){
        daftarcharmuncul.add(c);
    }
    public void showChar(){
        System.out.println("Character yang muncul di Episode ini : ");
        for(Character c : daftarcharmuncul){
            c.lihatkarakter();
        }
    }
}
