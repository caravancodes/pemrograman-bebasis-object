package id.d3if.java.projectpbo.bioskop;

public class KursiStudio {

	int nomorBaris;
	int nomorKolom;

	public KursiStudio() {
	}

	public KursiStudio(int baris, int kolom) {
		setNomorBaris(baris);
		setNomorKolom(kolom);
	}

	public int getNomorBaris() {
		return nomorBaris;
	}

	public void setNomorBaris(int nomorBaris) {
		this.nomorBaris = nomorBaris;
	}

	public int getNomorKolom() {
		return nomorKolom;
	}

	public void setNomorKolom(int nomorKolom) {
		this.nomorKolom = nomorKolom;
	}

}
