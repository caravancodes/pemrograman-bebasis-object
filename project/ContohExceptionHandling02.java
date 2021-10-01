package uk.d3if.javabpo.exception;

public class ContohExceptionHandling02 {
	public static void main(String[] args) {
		
		try {
			int nilai =  12345;
			int pembagi =  0;
			int hasil =  nilai / pembagi; // ARITHMETIC EXC
			System.out.println("hasil kalkulasi bernilai:  " + hasil);
			
			String[] nama =  new String[-4]; // NEGATIVE ARRAY SIZE EXC
			nama[0] = "Lintang";
			nama[1] = "PrAyOgo";
			
			int[] data = new int[3];
			data[0] = 12;
			data[1] = 15;
			data[2] = 14;
			data[3] = 13; // ARRAY INDEX OUT OF BOUNDS EXC
			System.out.println("output di indeks ke-9:  " + data[9]); // ...
			System.out.println("output di indeks ke-9:  " + data[-9]); // ... 
			
			for (int i = 0; i < 4; i++) {
				System.out.println("test hello ...");
				Thread.sleep(12345); // INTERRUPTED EXC
			}
		} catch (ArithmeticException e) { // mesti diurutkan dari tipe error di baris pertama
			e.printStackTrace();
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("terjadi kesalahan");
			System.err.println("terjadi kekeliruan");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("ini juga dikerjakan.");
			ContohExceptionHandling02.main(null);
		}
		
	}
}
