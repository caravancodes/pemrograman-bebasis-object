package com.d3if.java.pbo;

public class PersegiMain2 {
	PersegiMenengah pm;
	PersegiAkhir persegi;
	String infoLain;
	Mahasiswa mhs;
	DosenWali wali;
	
	public PersegiMain2(DosenWali dsn, Mahasiswa m) {
		// TODO Auto-generated constructor stub
		this.wali = dsn; // masih terelasi agregasi
		this.mhs = m; // masih terelasi agregasi
		this.pm =  new PersegiMenengah(); // berelasi komposisi -> 'new'
	}
	
	// .....
}
