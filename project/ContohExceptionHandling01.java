package uk.d3if.javabpo.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URI;

public class ContohExceptionHandling01 {
	public static void main(String[] d3if) {
		
		int nilai =  12345;
		int pembagi =  0;
//		int hasil =  nilai / pembagi; // ARITHMETIC EXC
//		System.out.println("hasil kalkulasi bernilai:  " + hasil);
		
//		String[] nama =  new String[-4]; // NEGATIVE ARRAY SIZE EXC
//		nama[0] = "Lintang";
//		nama[1] = "PrAyOgo";
		
		int[] data = new int[3];
		data[0] = 12;
		data[1] = 15;
		data[2] = 14;
//		data[3] = 13; // ARRAY INDEX OUT OF BOUNDS EXC
//		System.out.println("output di indeks ke-9:  " + data[9]); // ...
//		System.out.println("output di indeks ke-9:  " + data[-9]); // ... 
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("test hello ...");
//			Thread.sleep(12345); // INTERRUPTED EXC
//		}
//		
//		URI uri = new URI("www.faceebook.com"); // MALFORM EXC
//		
//		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
//		String string =  reader.readLine(); // IO EXC
//		
//		File file = new File("src/localdisk/drive/contoh.docx"); // NULL POINTER, NO FILE FOUND, NO CLASS DEFINED EXC ...
//		file.compareTo(file);
		
		// and other error codes or typo code implementations,
		
	}
}
