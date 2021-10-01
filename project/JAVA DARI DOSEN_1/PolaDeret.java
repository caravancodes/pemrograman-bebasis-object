package com.d3if.java.pbo;

public class PolaDeret {

	// 0 2 4 6 8 .....
	
	int batas =  9;
	
	public static void main(String[] args) {
		new PolaDeret().deret5();
	}
	
	// engineering
	void deret5() {
		for (int i = 0; i < batas; i++) {
			System.out.print((i * 2) + " ");
		}
	}
	
	// optimization deret3()
	void deret4() {
		for (int i = 0; i < batas; i = i + 2) {
			System.out.print(i + "  ");
		}
	}
	
	// by computational of numeric
	void deret3() {
		int awal =  0;
		int beda =  2;
		for (int i = 0; i < batas; i++) {
			System.out.print(awal + " ");
			awal =  awal + beda;
		}
	}
	
	// in arithmetic series
	void deret2() {
		int un;
		for (int i = 0; i < batas; i++) {
			un =  2 * (i + 1) - 2;
			System.out.print(un + "  ");
		}
	}
	
	// by definition
	void deretAritmatika() {
		for (int i = 0; i < batas; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "  ");
			}
		}
	}
	
}
