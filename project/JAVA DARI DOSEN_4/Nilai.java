package uk.mbs.java.pbo.pra_as_ka02;

public class Nilai {

	private double uts, uas, kuis, tugas, kehadiran;

	public char getIndeksNilai() {
		char indeks = 'T';
		double konfirm_nilai = getRataan();
		if (getKehadiran() < 75) {
			konfirm_nilai = konfirm_nilai - 25; // misal ada pengurangan jika
												// kehadiran perkuliahan tidak
												// maksimal
		}

		if (konfirm_nilai > 75 && konfirm_nilai <= 100) {
			indeks = 'A';
		} else if (konfirm_nilai > 65 && konfirm_nilai <= 75) {
			indeks = 'B';
		} else if (konfirm_nilai > 55 && konfirm_nilai <= 65) {
			indeks = 'C';
		} else if (konfirm_nilai > 35 && konfirm_nilai <= 55) {
			indeks = 'D';
		} else if (konfirm_nilai > 0 && konfirm_nilai <= 35) {
			indeks = 'E';
		}

		return indeks;
	}

	public double getRataan() {
		return (uts + uas + kuis + tugas) / 4;
	}

	public Nilai() {
	}

	public Nilai(double uts, double uas, double kuis, double tugas, double kehadiran) {
		setUts(uts);
		setUas(uas);
		setKuis(kuis);
		setTugas(tugas);
		setKehadiran(kehadiran);
	}

	public double getUts() {
		return uts;
	}

	public void setUts(double uts) {
		try {
			if (uts > 0 && uts <= 100) {
				this.uts = uts;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data nilai uts.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double getUas() {
		return uas;
	}

	public void setUas(double uas) {
		try {
			if (uas > 0 && uas <= 100) {
				this.uas = uas;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data  nilai uas.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double getKuis() {
		return kuis;
	}

	public void setKuis(double kuis) {
		try {
			if (kuis > 0 && kuis <= 100) {
				this.kuis = kuis;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data nilai kuis.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double getTugas() {
		return tugas;
	}

	public void setTugas(double tugas) {
		try {
			if (tugas > 0 && tugas <= 100) {
				this.tugas = tugas;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data nilai tugas.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double getKehadiran() {
		return kehadiran;
	}

	public void setKehadiran(double kehadiran) {
		try {
			if (kehadiran > 0 && kehadiran <= 100) {
				this.kehadiran = kehadiran;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data kehadiran.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
