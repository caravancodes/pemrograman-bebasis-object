package com.d3if.java.projectpbo.akademik;

public class DosenWali {

	int ukuran;
	int indeks;
	Mahasiswa[] data;
	// String kodeDsn, namaDsn, ....
	
	int searchBy(String nim) {
		int idx =  -1;
		for (int i = 0; i <= indeks; i++) {
			if (nim.equals(data[i].getNimMhs())) {
				idx =  i;
			}
		}
		return idx;
	}
	
	void cariDataMahasiswa(String nim) {
		// ..... write down your codes here .... 
		int hasilPencarian =  searchBy(nim);
		if (hasilPencarian != -1) {
			Firhan.tulis("Data Ditemukan di indeks ke-" + hasilPencarian + '\n');
		} else {
			Firhan.tulis("Maaf, Data tidak ditemukan di sistem kami.\n");
		}
		
	}
	
	void urutBasedNim() {
		
	}
	
	void urutBasedNama() {
		Mahasiswa temp =  null;
		for (int i = 0; i <= indeks; i++) {
			for (int j = indeks; j > 0; j--) {
				if (data[j].getNamaMhs().compareTo(data[j - 1].getNamaMhs()) < 0) {
					temp =  data[j];
					data[j] =  data[j - 1];
					data[j - 1] =  temp;
				}
			}
		}
	}
	
	void urutBasedNilaiUts() {
		
	}
	
	void urutBasedNilaiUas() {
		
	}
	
	void urutBasedNilaiIndeks() {
		
	}
	
	void urutBasedNilaiAkhir() {
		/* Bubble Sort Implementation */
		Mahasiswa temp =  null;
		for (int i = 0; i <= indeks; i++) {
			for (int j = indeks; j > 0; j--) {
				if (data[j].getMataKuliah().getNilai().getRataan() - data[j - 1].getMataKuliah().getNilai().getRataan() < 0) {
					temp =  data[j];
					data[j] =  data[j - 1];
					data[j - 1] =  temp;
				}
			}
		}
	}
	
	void urutBasedNilaiAkhir2() {
		/* Selection Sort Implementation */
	}
	
	void urutBasedNilaiAkhir3() {
		/* Insertion Sort Implementation */
	}
	
	void urutBasedNilaiAkhir4() {
		/* Counting Sort Implementation */
	}
	
	void bacaData() {
		for (int i = 0; i <= indeks; i++) {
			data[i].infoMahasiswa();;
		}
	}

	/*Mahasiswa hapusData(int index) {
		return null;
	}*/
	
	Mahasiswa hapusData() {
		Mahasiswa x = data[indeks];
		indeks =  indeks - 1;
		return x;
	}
	
	void tambahData(Mahasiswa mhs) {
		indeks =  indeks + 1;
		data[indeks] =  mhs;
	}
	
	public DosenWali(int size) {
		ukuran = size;
		indeks =  -1;
		data =  new Mahasiswa[ukuran];
	}
	
}
