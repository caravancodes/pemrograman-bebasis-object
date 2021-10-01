package id.d3if.java.projectpbo.bioskop;

public class Bioskop {
	public static void main(String[] args) {
		
		GenreMovie genre =  new GenreMovie("1", "Romantis", "Remaja");
		JamTayangMovie jam =  new JamTayangMovie("sore", "14.30-17.30");
		Movie movie =  new Movie("12345", "from Bandung with Love", genre, jam);
		
		KursiStudio kursi =  new KursiStudio(3, 13);
		Studio studio =  new Studio("1", "Studio 1", 30, kursi);
		
		Tiket tiket =  new Tiket(45000, studio, movie);
		
		Customer customer =  new Customer(studio.getKapasitasKursi());
		customer.beliTiket(tiket);
		
		customer.cetakTiket();
	}
}
