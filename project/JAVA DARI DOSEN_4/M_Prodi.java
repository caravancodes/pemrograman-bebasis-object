package uk.mbs.java.pbo.pra_as_ka02;

public class M_Prodi extends MatKul {

	private String kode_khusus = "DPH";

	public M_Prodi(String kode, String kode_khusus, String nama, int sks, Nilai nilai) {
		super((kode + kode_khusus), nama, sks, nilai);
	}

	public M_Prodi() {
	}

	public String getKode_khusus() {
		return kode_khusus;
	}

	public void setKode_khusus(String kode_khusus) {
		try {
			if (!kode_khusus.equals("")) {
				this.kode_khusus = kode_khusus;
			} else {
				System.out.println("Maaf, perhatikan kode khusus.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
