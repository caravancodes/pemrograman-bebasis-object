/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Jurnal03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int pil=0,pil2=0;
        boolean terus = false;
        ArrayList<Episode> arEps = new ArrayList();
        System.out.println("Anime");
        System.out.print("Masukan judul\t\t: ");
        String jdl = sc.nextLine();
        System.out.print("Masukan studio\t\t: ");
        String std=sc.nextLine();
        Anime anm = new Anime(jdl,std);
        System.out.print("Masukan semua genre\t: ");
        String gn = sc.nextLine();
        String[] arr= gn.split(" ");
        anm.setGenre(arr);
        while(terus==false){
            System.out.println("Menu");
            System.out.println("1.\tTambah Episode");
            System.out.println("2.\tTambah Character");
            System.out.println("3.\tView");
            System.out.println("4.\tExit");
            System.out.print("Masukan Pilihan : ");
            pil=sc.nextInt();
            sc.nextLine();
            switch(pil){
                case 1:
                    System.out.print("Masukan Episode ke-: ");
                    String kk= sc.nextLine();
                    System.out.print("Masukan judul : ");
                    String jl = sc.nextLine();
                    anm.addEps(new Episode(jl,kk));
                    break;
                case 2:
                    System.out.print("Masukan Nama Char : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukan Jenis Kelamin : ");
                    String jk = sc.nextLine();
                    System.out.print("Masukan Role (Main/Support): ");
                    String ro = sc.nextLine();
                    System.out.print("Keluar di eps berapa saja : ");
                    String kl = sc.nextLine();
                    String[] epsk = kl.split(" ");
                    anm.tambahChar(new Character(nama,jk,ro), epsk);
                    break;
                case 3:
                    System.out.println("1.\tAnime");
                    System.out.println("2.\tList Episode");
                    System.out.println("3.\tDetail Episode");
                    System.out.print("Masukan pilihan : ");
                    pil2 = sc.nextInt();
                    sc.nextLine();
                    if(pil2==1){
                        anm.showInfoAnime();
                    }
                    else if(pil2==2){
                        arEps = anm.getDaftarEps();
                        arEps.sort(new Comparator<Episode>() {
                            @Override
                            public int compare(Episode o1, Episode o2) {
                                if(Integer.parseInt(o1.getKe())<Integer.parseInt(o2.getKe())){
                                    return -1;
                                }
                                else{
                                    return 1;
                                }
                            }
                        });
                        for(Episode k : arEps){
                            k.lihatInfoEps();
                        }
                    }
                    else if(pil2==3){
                        arEps = anm.getDaftarEps();
                        System.out.print("Masukan episode ke berapa : ");
                        int pc = sc.nextInt();
                        sc.nextLine();
                        for(Episode k : arEps){
                            if(pc==(Integer.parseInt(k.getKe()))){
                                k.lihatInfoEps();
                                k.showChar();
                            }
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
