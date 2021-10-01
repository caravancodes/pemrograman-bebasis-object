package id.d3if.java.projectpbo.bioskop;

public class Customer {
	
	int jumlahCustomer; // ukuran
	int indeks;
	Tiket[] tiket;
	
	public Customer(int size) {
		jumlahCustomer =  size;
		indeks =  -1;
		tiket =  new Tiket[jumlahCustomer];
	}
	
	void beliTiket(Tiket t, int jumlah) {
//		tiket[++indeks] =  t; // lakukan perulangan
		
		for (int i = 1; i <= jumlah; i++) {
			tiket[++indeks] =  t;
		}
		
		tiket[indeks].getStudio().setKapasitasKursi(tiket[indeks].getStudio().getKapasitasKursi() - jumlah);
	}
	
	void beliTiket(Tiket t) {
		tiket[++indeks] =  t;
		
		tiket[indeks].getStudio().setKapasitasKursi(tiket[indeks].getStudio().getKapasitasKursi() - 1);
	}
	
	Tiket cancelTiket() {
		return tiket[indeks--];
	}
	
	void cetakTiket() {
		for (int i = 0; i <= indeks; i++) {
			tiket[i].infoTiket();
		}
	}
	
}
