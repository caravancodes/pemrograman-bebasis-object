package com.d3if.java.pbo;

public class PersegiAkhir {
	int sisi =  5;
	
	// .......
	
	void displayPersegi() {
		System.out.println("bentuk persegi sebagai berikut:  ");
		for (int i = 0; i < sisi; i++) {
			for (int j = 0; j < sisi; j++) {
				if (i == 0 || j == 0 || i == sisi - 1 || j == sisi - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void infoPersegi() {
		System.out.println("sisi =  " + this.sisi + " satuan.");
		infoKeliling();
		infoLuas();
		displayPersegi();
		// .....
	}
	
	int getKeliling() {
		return sisi * 4;
	}
	
	void infoKeliling() {
		System.out.println("Keliling:  " + getKeliling() + " satuan.");
	}
	
	int getLuas() {
		return sisi * sisi;
	}
	
	void infoLuas() {
		System.out.println("Luas:  " + getLuas() + " satuan.");
	}
}
