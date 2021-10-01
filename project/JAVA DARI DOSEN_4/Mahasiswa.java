package uk.mbs.java.pbo.pra_as_ka02;

public class Mahasiswa {

	private String nim_mhs, nama_mhs;
	private MatKul matkul;

	public Mahasiswa(String nim, String nama, MatKul matkul) {
		setNim_mhs(nim);
		setNama_mhs(nama);
		setMatkul(matkul);
	}

	public void infoMHS() {
		System.out.println("\nData Mahasiswa:");
		System.out.println("-----------------");
		System.out.println("NAMA MHS        :    " + getNama_mhs());
		System.out.println("NIM MHS         :    " + getNim_mhs());
		matkul.infoMK();
		System.out.println();
	}

	public String getNim_mhs() {
		return nim_mhs;
	}

	public void setNim_mhs(String nim_mhs) {
		try {
			if (!nim_mhs.equals("")) {
				this.nim_mhs = nim_mhs;
			} else {
				System.out.println("Maaf, nim mhs mesti diisi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getNama_mhs() {
		return nama_mhs;
	}

	public void setNama_mhs(String nama_mhs) {
		try {
			if (!nama_mhs.equals("")) {
				this.nama_mhs = nama_mhs;
			} else {
				System.out.println("Maaf, nama mhs mesti diisi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MatKul getMatkul() {
		return matkul;
	}

	public void setMatkul(MatKul matkul) {
		try {
			if (!matkul.equals(null)) {
				this.matkul = matkul;
			} else {
				System.out.println("Maaf, data matkul belum diinstansiasi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Mahasiswa() {
	}

}
