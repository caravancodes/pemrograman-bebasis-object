package com.d3if.java.pbo;

public class PersegiMain {
	public static void main(String[] args) {
		PersegiAkhir pm =  new PersegiAkhir();
		pm.infoLuas();
		pm.infoKeliling();
		// .....
		
		pm.infoPersegi();
 
		new PersegiAkhir().infoPersegi(); // anonymous object
	}

}
