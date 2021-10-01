package com.d3if.java.pbo;

public class Mahasiswa {

	private String nim, nama; // dsb
	
	public Mahasiswa(String nim, String nama) {
		setNim(nim); setNama(nama);
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNim() {
		return nim;
	}

	public String getNama() {
		return nama;
	}

}
