package uk.mbs.java.pbo.pra_as_ka02;

public class BermainDisini {
	public static void main(String[] args) {
		
		Nilai nilai = new Nilai(90, 80, 85, 88, 87);
		MatKul matkul = new MatKul("DPH1C4", "Pemrograman Berorientasi Obyek", 4, nilai);
		Mahasiswa sifa = new Mahasiswa("1122334455", "Nur Assyifa", matkul);
		DosenWali wali = new DosenWali(40);
		wali.tambah(sifa);
		wali.tambah(sifa);
		wali.tambah(sifa);
		MH_Reguler x = new MH_Reguler("1234567890", "Assyifa Latief", matkul);
		wali.tambah(x);
		wali.baca();
		
	}
}
