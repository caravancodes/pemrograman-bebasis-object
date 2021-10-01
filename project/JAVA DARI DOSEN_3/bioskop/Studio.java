package id.d3if.java.projectpbo.bioskop;

public class Studio {

	String idRuangStudio, namaRuangStudio;
	int kapasitasKursi;
	KursiStudio kursiStudio;

	public Studio() {
	}
	
	public Studio(String idRuangStudio, String namaRuangStudio, int kapasitasKursi, KursiStudio kursiStudio) {
		setIdRuangStudio(idRuangStudio);
		setNamaRuangStudio(namaRuangStudio);
		setKapasitasKursi(kapasitasKursi);
		setKursiStudio(kursiStudio);
	}
	
	void infoStudio() {
		System.out.println("Ruang Studio");
		System.out.println("  Kapasitas Kursi: " + getKapasitasKursi());
		System.out.println("  ID Studio:       " + getIdRuangStudio());
		System.out.println("  Nama Studio      " + getNamaRuangStudio());
		System.out.println("  Tempat Duduk     " );
		System.out.println("    di baris ke -  " + getKursiStudio().getNomorBaris());
		System.out.println("    di kolom ke -  " + getKursiStudio().getNomorKolom() + '\n');
	}
	
	public String getIdRuangStudio() {
		return idRuangStudio;
	}

	public void setIdRuangStudio(String idRuangStudio) {
		this.idRuangStudio = idRuangStudio;
	}

	public String getNamaRuangStudio() {
		return namaRuangStudio;
	}

	public void setNamaRuangStudio(String namaRuangStudio) {
		this.namaRuangStudio = namaRuangStudio;
	}

	public int getKapasitasKursi() {
		return kapasitasKursi;
	}

	public void setKapasitasKursi(int kapasitasKursi) {
		this.kapasitasKursi = kapasitasKursi;
	}

	public KursiStudio getKursiStudio() {
		return kursiStudio;
	}

	public void setKursiStudio(KursiStudio kursiStudio) {
		this.kursiStudio = kursiStudio;
	}

}
