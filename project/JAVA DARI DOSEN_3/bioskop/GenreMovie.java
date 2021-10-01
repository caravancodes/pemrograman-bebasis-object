package id.d3if.java.projectpbo.bioskop;

public class GenreMovie {

	String idGenre, namaGenre, kategoriGenre;

	public GenreMovie() {
	}
	
	public GenreMovie(String idGenre, String namaGenre, String kategoriGenre) {
		setIdGenre(idGenre); setNamaGenre(namaGenre); setKategoriGenre(kategoriGenre);
	}
	
	public String getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(String idGenre) {
		this.idGenre = idGenre;
	}

	public String getNamaGenre() {
		return namaGenre;
	}

	public void setNamaGenre(String namaGenre) {
		this.namaGenre = namaGenre;
	}

	public String getKategoriGenre() {
		return kategoriGenre;
	}

	public void setKategoriGenre(String kategoriGenre) {
		this.kategoriGenre = kategoriGenre;
	}

}
