/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal3;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Praktikan
 */
public class Anime {
    private String judul, studio;
    private String[] genre;
    ArrayList<Character> daftarChar = new ArrayList<>();
    ArrayList<Episode> daftarEpisode = new ArrayList<>();

    public Anime(String judul, String studio) {
        this.judul = judul;
        this.studio = studio;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public ArrayList<Character> getDaftarChar() {
        return daftarChar;
    }

    public void setDaftarChar(ArrayList<Character> daftarChar) {
        this.daftarChar = daftarChar;
    }

    public ArrayList<Episode> getDaftarEpisode() {
        return daftarEpisode;
    }

    public void setDaftarEpisode(ArrayList<Episode> daftarEpisode) {
        this.daftarEpisode = daftarEpisode;
    }
    
    public void tambahChar(Character c, String [] arr){
        daftarChar.add(c);
        genre = arr;
    }
    
    public void addEps(Episode e) {
        daftarEpisode.add(e);
    }
    
    public void ShowInfoAnime(){
        System.out.println("Judul \t: " +getJudul());
        System.out.println("Studio \t: " +getStudio());
        System.out.println("Genre \t: " +Arrays.toString(getGenre()));
        
    }
}