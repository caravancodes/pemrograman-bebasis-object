/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threatment;

/**
 *
 * @author hp
 */
public class Buku {
    private String isbn;
    private String judul;
    private String penerbit;

    public String getIsbi() {
        return isbn;
    }

    public void setIsbi(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Buku(String isbn, String judul, String penerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.penerbit = penerbit;
    }
}
