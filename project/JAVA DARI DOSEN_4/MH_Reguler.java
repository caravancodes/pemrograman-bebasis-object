package uk.mbs.java.pbo.pra_as_ka02;

public class MH_Reguler extends Mahasiswa {

	private String keterangan = "Reguler";
	
	public MH_Reguler(String nim, String nama, MatKul matkul) {
		super(nim, nama, matkul);
	}
	
	public MH_Reguler() {
	}
	
	public void setKeterangan(String keterangan) {
		try {
			if (!keterangan.equals("")) {
				this.keterangan = keterangan;
			} else {
				System.out.println("Maaf, data keterangan mesti diisi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getKeterangan() {
		return keterangan;
	}
	
}
