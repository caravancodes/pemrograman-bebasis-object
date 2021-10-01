package com.d3if.java.pbo;

public class PersegiMenengah {
	
	int sisi =  5;
	
	public static void main(String[] args) {
		PersegiMenengah pm =  new PersegiMenengah();
		pm.infoLuas();
		pm.infoKeliling();
		// .....
		
		pm.infoPersegi();
		
		new PersegiMenengah().infoPersegi(); // anonymous object
	}
	
	// .......
	
	void infoPersegi() {
		infoKeliling();
		infoLuas();
		// .....
	}
	
	int getKeliling() {
		return sisi * 4;
	}
	
	void infoKeliling() {
		System.out.println(getKeliling());
	}
	
	int getLuas() {
		return sisi * sisi;
	}
	
	void infoLuas() {
		System.out.println(getLuas());
	}
	
}
