package com.d3if.java.projectpbo.akademik;

public class Main {
	public static void main(String[] args) {
		
		Nilai nilai1 =  new Nilai(80, 90, 70, 75);
		MataKuliah alpro =  new MataKuliah("DPH1A4", "Algoritma dan Struktur Data", 4, nilai1);
		Mahasiswa lintang =  new Mahasiswa("12345", "Lintang Abdi Saputra", "D3IF-40-02", alpro);
		
		Nilai nilai2 =  new Nilai(50, 70, 90, 65);
		alpro =  new MataKuliah("DPH1A4", "Algoritma dan Struktur Data", 4, nilai2);
		Mahasiswa ridwan =  new Mahasiswa("12365", "Ridwan Malik Afif", "D3IF-40-02", alpro);
		
		Nilai nilai3 =  new Nilai(66, 77, 88, 55);
		alpro =  new MataKuliah("DPH1A4", "Algoritma dan Struktur Data", 4, nilai3);
		Mahasiswa retno =  new Mahasiswa("12765", "Retno Novi Dwiyati", "D3IF-40-02", alpro);
		
		DosenWali rwj =  new DosenWali(30);
		rwj.tambahData(lintang);
		rwj.tambahData(ridwan);
		rwj.tambahData(retno);
		
		rwj.bacaData();
		
		rwj.urutBasedNilaiAkhir();
		
		rwj.bacaData();
		
		
	}
}
