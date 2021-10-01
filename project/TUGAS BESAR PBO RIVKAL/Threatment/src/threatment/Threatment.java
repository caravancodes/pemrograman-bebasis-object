/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threatment;
import java.util.*;
/**
 *
 * @author hp
 */
public class Threatment {
java.util.Scanner sc=new java.util.Scanner(System.in);
    private static String Tambahbuku;
    private static String Hapusbuku;
    private static String Bacabuku;
    private static String Caribuku;
    private static String Cekkosong;
    private static String Cekpenuh;
    private static Object java;

    public Threatment() {java.util.Scanner sc=new java.util.Scanner(System.in);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("--PERPUSTAKAAN BATUR--");
        System.out.println("---------MENU---------");
        System.out.println("----------------------");
        System.out.println("1. Tambah Buku "+Tambahbuku+" ");
        System.out.println("2. Hapus Buku "+Hapusbuku+" ");
        System.out.println("3. Baca Buku "+Bacabuku+" ");
        System.out.println("4. Cari Buku "+Caribuku+" ");
        System.out.println("5. Cek Kosong "+Cekkosong+" ");
        System.out.println("6. Cek Penuh "+Cekpenuh+" ");
    }
}
