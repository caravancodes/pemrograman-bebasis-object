package com.d3if.java.projectpbo.akademik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aps {
	public static void main(String[] args) throws IOException {
		
		System.out.println("SELAMAT DATANG DI APLIKASI KAMI.");
		System.out.println("Menu: ");
		System.out.println(" 1. Tambah Data Mahasiswa");
		System.out.println(" 2. Cari Data Mahasiswa");
		System.out.println(" 3  Baca data mahasiswa");
		
		BufferedReader buffer =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print  (" pilihan anda:  ");
		int pilih = buffer.read();
		
		DosenWali dosen =  new DosenWali(30);
		
		switch (pilih) {
		case 1:
			System.out.print  (" NIM Mahasiswa:  "); String nimMhs =  buffer.readLine();
			System.out.print  (" Nama Mahasiswa: "); String namaMhs =  buffer.readLine();
			System.out.print  (" Kelas:          "); String kelas =  buffer.readLine();
			System.out.print  (" Kode MK:        "); String kodeMK =  buffer.readLine();			
			System.out.print  (" Nama MK:        "); String namaMK =  buffer.readLine();
			System.out.print  (" Jumlah SKS:     "); int sks =  buffer.read();
			System.out.print  (" Nilai UTS:      "); double uts =  Double.valueOf(buffer.readLine());
			System.out.print  (" Nilai UAS:      "); double uas =  Double.valueOf(buffer.readLine());
			System.out.print  (" Nilai Quis:      "); double quis =  Double.valueOf(buffer.readLine());
			System.out.print  (" Nilai Tugas:      "); double tugas =  Double.valueOf(buffer.readLine());

			Nilai nilai =  new Nilai(uts, uas, quis, tugas);
			MataKuliah mataKuliah =  new MataKuliah(kodeMK, namaMK, sks, nilai);
			Mahasiswa mhs =  new Mahasiswa(nimMhs, namaMhs, kelas, mataKuliah);
			
			dosen.tambahData(mhs);
			
			break;
		case 2:
			System.out.println("inputkan nim Mahasiswa yang akan dicari");
			String cariNim =  buffer.readLine();
			dosen.cariDataMahasiswa(cariNim);
			break;
		case 3:
			dosen.bacaData();
			break;
		default:
			System.out.println("Maaf, tidak ada menu pilihan tersebut. Coba lagi.");
			break;
		}
		
	}
}
