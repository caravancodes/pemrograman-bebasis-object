package com.d3if.java.projectpbo.akademik;

public class BSTest {
	public static void main(String[] args) {
		
		int[] data =  {2, 3, 4, 1, 6, 5, 7, 0};
		
		int temp =  0;
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length - 1; j > 0; j--) {
				if (data[j] < data[j - 1]) {
					temp =  data[j];
					data[j] =  data[j - 1];
					data[j - 1] =  temp;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
	}
}
