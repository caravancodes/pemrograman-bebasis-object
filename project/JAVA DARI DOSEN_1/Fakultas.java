package com.d3if.java.pbo;

public class Fakultas {
	public static void main(String[] args) {
		
		Mahasiswa mhs =  new Mahasiswa("12345", "Rizki Eka Maulana");
		String namaM =  "Arief Mukna";
		String nimM =   "23451";
		
		DosenWali dw =  new DosenWali("RWJ", "1234-5", "Rahmadi Wijaya", namaM);
		// dw tidak berasosiasi dengan mhs
		
		DosenWali dq =  new DosenWali("RWD", "1234-1", "Retno Novi", mhs.getNama());
		// dq berasosiasi dengan mhs
		
		/*
		 * Asosiasi  -->  use a
		 * Agregasi  -->  has a
		 * Komposisi -->  part of
		 * Inheritance->  is a
		 * 
		 */
	}
}
