package id.d3if.java.projectpbo.bioskop;

public class Tiket {

	double harga;

	Studio studio;
	Movie movie;

	public Tiket(double harga, Studio studio, Movie movie) {
		setHarga(harga);
		setStudio(studio);
		setMovie(movie);
	}
	
	public double getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void infoTiket() {
		getMovie().infoMovie();
		getStudio().infoStudio();
	}

}
