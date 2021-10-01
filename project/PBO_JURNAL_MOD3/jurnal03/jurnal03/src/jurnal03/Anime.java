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
public class Anime {
    private String judul;
    private String studio;
    private String[] genre=new String[10];
    private ArrayList<Character> daftarChar = new ArrayList();
    private ArrayList<Episode> daftarEps = new ArrayList();

    public Anime(String judul, String studio) {
        this.judul = judul;
        this.studio = studio;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public void setDaftarChar(ArrayList<Character> daftarChar) {
        this.daftarChar = daftarChar;
    }

    public void setDaftarEps(ArrayList<Episode> daftarEps) {
        this.daftarEps = daftarEps;
    }

    public ArrayList<Character> getDaftarChar() {
        return daftarChar;
    }

    public ArrayList<Episode> getDaftarEps() {
        return daftarEps;
    }
    
    
    public void tambahChar(Character c,String[] arr){
        daftarChar.add(c);
        for(int i=0; i <arr.length;i++){
            for(Episode e : daftarEps){
                if(arr[i].equalsIgnoreCase(e.getKe())){
                    e.addChar(c);
                }
            }
        }
    }
    public void addEps(Episode e){
        daftarEps.add(e);
    }
    public void showInfoAnime(){
        System.out.println("Judul\t: "+judul);
        System.out.println("Studio\t: "+studio);
        System.out.print("Genre\t: ");
        for(int j =0;j<genre.length;j++){
            if(j==(genre.length-1)){
                System.out.print(genre[j]);
            }
            else{
                System.out.print(genre[j]+", ");
            }
        }
        System.out.println();
        System.out.println("Daftar Char : ");
        for(Character c : daftarChar){
            System.out.println("Nama : "+c.getNama());
        }
    }
}
