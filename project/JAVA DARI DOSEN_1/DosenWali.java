package com.d3if.java.pbo;

public class DosenWali {

	private String kode, nip, nama, namaMhs; // dll
	
	public DosenWali(String kode, String nip, String nama, String namaMhs) {
		this.kode =  kode;
		this.nama =  nama;
		this.nip =  nip;
		this.namaMhs = namaMhs;
	}
	
	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNamaMhs() {
		return namaMhs;
	}

	public void setNamaMhs(String namaMhs) {
		this.namaMhs = namaMhs;
	}

	void infoDosenWali() {
		System.out.println("kode:  " + getKode());
		// ...
	}
	
	
}
