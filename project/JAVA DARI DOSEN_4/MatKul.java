package uk.mbs.java.pbo.pra_as_ka02;

public class MatKul {

	private String kode_mk, nama_mk;
	private int sks;
	private Nilai nilai;
	
	public MatKul() {
	}
	
	public MatKul(String kode, String nama, int sks, Nilai nilai) {
		setKode_mk(kode); setNama_mk(nama); setSks(sks); setNilai(nilai);
	}
	
	public void infoMK() {
		System.out.println("\nKode MK           :    " + getKode_mk());
		System.out.println("  Nama MK           :    " + getNama_mk());
		System.out.println("  SKS MK            :    " + getSks());
		System.out.println("  Nilai");
		System.out.println("  UTS               :    " + getNilai().getUts());
		System.out.println("  UAS               :    " + getNilai().getUas());
		System.out.println("  KUIS              :    " + getNilai().getKuis());
		System.out.println("  TUGAS             :    " + getNilai().getTugas());
		System.out.println("  KEHADIRAN         :    " + getNilai().getKehadiran());
		System.out.println("  TOTAL NILAI       :    " + getNilai().getRataan());
		System.out.println("  INDEKS NILAI      :    " + getNilai().getIndeksNilai());
	}

	public String getKode_mk() {
		return kode_mk;
	}

	public void setKode_mk(String kode_mk) {
		try {
			if (!kode_mk.equals("")) {
				this.kode_mk = kode_mk;
			} else {
				System.out.println("Maaf, kode mk harus diinput.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getNama_mk() {
		return nama_mk;
	}

	public void setNama_mk(String nama_mk) {
		try {
			if (!nama_mk.equals("")) {
				this.nama_mk = nama_mk;
			} else {
				System.out.println("Maaf, nama mk harus diinput.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		try {
			if (sks > 0 && sks <= 8) {
				this.sks = sks;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data sks.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Nilai getNilai() {
		return nilai;
	}

	public void setNilai(Nilai nilai) {
		try {
			if (!nilai.equals(null)) {
				this.nilai = nilai;
			} else {
				System.out.println("Maaf, data nilai belum diinstansiasi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
}
