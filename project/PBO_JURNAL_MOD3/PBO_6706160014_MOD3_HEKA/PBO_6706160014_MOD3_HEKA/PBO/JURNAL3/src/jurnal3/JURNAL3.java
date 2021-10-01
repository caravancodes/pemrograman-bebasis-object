/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal3;
import java.util.*;
/**
 *
 * @author Praktikan
 */
public class JURNAL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String JudulAnime, Studio, isiGenre, ke, judulEps, Role, namaChar, JenisKelamin, brphayo;
        String [] Genre;
        String [] brpaja;
        boolean ulang = false;
        int pilihan, views, i;
        Scanner in = new Scanner (System.in);
        System.out.println("VVIBU BOY - ANIME BOY\n");
        System.out.print("Masukkan Judul \t\t: ");
        JudulAnime = in.nextLine();
        System.out.print("Masukkan Studio \t: ");
        Studio = in.nextLine();
        System.out.print("Masukkan Semua Genre \t: ");
        isiGenre = in.nextLine();
        Genre = isiGenre.split(" ");
        Anime Ann = new Anime(JudulAnime, Studio);
        Ann.setGenre(Genre);
        do {
        System.out.println("Menu");
        System.out.println("  1. Tambah Episode");
        System.out.println("  2. Tambah Character");
        System.out.println("  3. View");
        System.out.println("  4. Exit");
        System.out.print("Masukkan Pilihan : ");
        pilihan = in.nextInt();
        switch(pilihan){
            case 1 :
                System.out.print("Masukkan Episode ke \t: ");
                ke = in.next();
                System.out.print("Masukkan Judul \t: ");
                judulEps = in.next();
                Episode Eps = new Episode(judulEps, ke);
                Ann.daftarEpisode.add(Eps);
                break;
            case 2 :
                System.out.print("Masukkan Nama Char \t\t: ");
                namaChar = in.next();
                System.out.print("Masukkan Jenis Kelamin (L)/(P) \t: ");
                JenisKelamin = in.next();
                System.out.print("Masukkan Role (Main/Support) \t\t: ");
                Role = in.next();
                System.out.println("Keluar di episode berapa : ");
                brphayo = in.next();
                brpaja = brphayo.split(" ");
                Character Char = new Character(namaChar, JenisKelamin, Role);
                Ann.tambahChar(Char, brpaja);
                break;
            case 3 :
                System.out.println("Apa yang Ingin Anda Lihat");
                System.out.println("  1. Anime");
                System.out.println("  2. List Episode");
                System.out.println("  3. Detail Episode");
                System.out.println("  Masukkan Pilihan : ");
                views = in.nextInt();
                switch (views) {
                    case 1 :
                        Ann.ShowInfoAnime();
                        for (i = 0; i < Ann.daftarChar.size() ; i++){
                            Ann.daftarChar.get(i).getNama();    
                        }
                        break;
                    case 2 :
                        for(i = 0; i<Ann.daftarEpisode.size(); i++){
                            Ann.daftarEpisode.get(i);    
                        }
                        break;
                    case 3 :
                        System.out.println("Masukkan Episode ke Berapa : ");
                        String episodebrp  = in.next();
                        
                        break;
                    default :
                        System.out.println("PILIHANNYA SALAH BOY");
                        break;
                }
                break;
            case 4 :
                System.out.println("TERIMA KASIH VVIBU");
                ulang=true;
                break;
            default :
                System.out.println("PILIHANYA SALAH BOY");
                ulang=true;
                break;
                
        }
        } while (ulang == false);
    }
    
}
