package com.d3if.java.projectpbo.akademik;

public class MataKuliah {

	String kodeMK, namaMK;
	int sks;
	Nilai nilai;

	public MataKuliah(String kodeMK, String namaMK,int sks, Nilai nilai) {
		setKodeMK(kodeMK); setNamaMK(namaMK); setSks(sks); setNilai(nilai);
	}
	
	public String getKodeMK() {
		return kodeMK;
	}

	public void setKodeMK(String kodeMK) {
		this.kodeMK = kodeMK;
	}

	public String getNamaMK() {
		return namaMK;
	}

	public void setNamaMK(String namaMK) {
		this.namaMK = namaMK;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public Nilai getNilai() {
		return nilai;
	}

	public void setNilai(Nilai nilai) {
		this.nilai = nilai;
	}

}
