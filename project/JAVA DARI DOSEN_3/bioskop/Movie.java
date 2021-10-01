package id.d3if.java.projectpbo.bioskop;

public class Movie {

	String kodeMovie, judulMovie;
	GenreMovie genreMovie;
	JamTayangMovie jamTayangMovie;

	public Movie() {
	}

	public Movie(String kodeMovie, String judulMovie, GenreMovie genreMovie, JamTayangMovie jamTayangMovie) {
		setKodeMovie(kodeMovie);
		setJudulMovie(judulMovie);
		setGenreMovie(genreMovie);
		setJamTayangMovie(jamTayangMovie);
	}

	void infoMovie() {
		System.out.println("Detail Movie");
		System.out.println("------------");
		System.out.println("  Kode Movie:          " + getKodeMovie());
		System.out.println("  Judul Movie:         " + getJudulMovie());
		System.out.println("  Genre Movie          ");
		System.out.println("    ID Genre :         " + getGenreMovie().getIdGenre());
		System.out.println("    Nama Genre :       " + getGenreMovie().getNamaGenre());
		System.out.println("    Kategori Genre:    " + getGenreMovie().getKategoriGenre());
		System.out.println("  Jam Tayang Movie");
		System.out.println("    ID Jam Tayang:     " + getJamTayangMovie().getIdJamTayang());
		System.out.println("    Waktu Jam Tayang:  " + getJamTayangMovie().getWaktuJamTayang() + "\n");
	}
	
	public String getKodeMovie() {
		return kodeMovie;
	}

	public void setKodeMovie(String kodeMovie) {
		this.kodeMovie = kodeMovie;
	}

	public String getJudulMovie() {
		return judulMovie;
	}

	public void setJudulMovie(String judulMovie) {
		this.judulMovie = judulMovie;
	}

	public GenreMovie getGenreMovie() {
		return genreMovie;
	}

	public void setGenreMovie(GenreMovie genreMovie) {
		this.genreMovie = genreMovie;
	}

	public JamTayangMovie getJamTayangMovie() {
		return jamTayangMovie;
	}

	public void setJamTayangMovie(JamTayangMovie jamTayangMovie) {
		this.jamTayangMovie = jamTayangMovie;
	}

}
