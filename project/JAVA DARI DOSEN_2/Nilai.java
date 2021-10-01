package com.d3if.java.projectpbo.akademik;

public class Nilai {
	
	double uts, uas, quis, tugas;

	public Nilai(double uts, double uas, double quis, double tugas) {
		setUts(uts); setUas(uas); setQuis(quis); setTugas(tugas);
	}
	
	public char getIndeksNilai() {
		char indeks = 'T';
		if (getRataan() > 75 && getRataan() <= 100) {
			indeks =  'A';
		} else if (getRataan() > 65 && getRataan() <= 75) {
			indeks =  'B';
		} else if (getRataan() > 55 && getRataan() <= 65) {
			indeks =  'C';
		}
		return indeks;
	}
	
	public double getRataan() {
		return (uts + uas + quis + tugas) / 4;
	}
	
	public double getUts() {
		return uts;
	}

	public void setUts(double uts) {
		this.uts = uts;
	}

	public double getUas() {
		return uas;
	}

	public void setUas(double uas) {
		this.uas = uas;
	}

	public double getQuis() {
		return quis;
	}

	public void setQuis(double quis) {
		this.quis = quis;
	}

	public double getTugas() {
		return tugas;
	}

	public void setTugas(double tugas) {
		this.tugas = tugas;
	}
	
}
