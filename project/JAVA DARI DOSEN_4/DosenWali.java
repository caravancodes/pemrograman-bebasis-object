package uk.mbs.java.pbo.pra_as_ka02;

public class DosenWali implements DosenListener {

	private String kode_dosen = "MBS";
	private int index;
	private int ukuran;
	private Mahasiswa[] siswa; 
	
	public String getKode_dosen() {
		return kode_dosen;
	}

	public void setKode_dosen(String kode_dosen) {
		try {
			if (!kode_dosen.equals("")) {
				this.kode_dosen = kode_dosen;
			} else {
				System.out.println("Maaf, kode dosen wali mesti diinputkan.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		try {
			if (index > 0 && index < Integer.MAX_VALUE) {
				this.index = index;
			} else {
				System.out.println("Maaf, indeks sistem di luar jangkauan.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getUkuran() {
		return ukuran;
	}

	public void setUkuran(int ukuran) {
		try {
			if (ukuran > 0 && ukuran <= 10000) {
				this.ukuran = ukuran;
			} else {
				System.out.println("Maaf, terjadi kekeliruan input pada data ukuran.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Mahasiswa[] getSiswa() {
		return siswa;
	}

	public void setSiswa(Mahasiswa[] siswa) {
		try {
			if (!siswa.equals(null)) {
				this.siswa = siswa;
			} else {
				System.out.println("Maaf, array of siswa belum diinstansiasi dengan benar.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DosenWali(int size) {
		try {
			if (size > 0 && size <= 10000) {
				index = -1;
				ukuran = size;
				siswa = new Mahasiswa[ukuran];
			} else {
				System.out.println("Maaf, terjadi kekeliruan input data. Cobalah cek lagi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void tambah(Mahasiswa data) {
		// TODO Auto-generated method stub
		try {
			if (!data.equals(null)) {
				if (!isFull()) {
					siswa [++index] = data;
					System.out.println("Selamat, data berhasil ditambah ke sistem.");
				} else {
					System.out.println("Maaf, data di sistem sudah penuh.");
				}
			} else {
				System.out.println("Maaf, data siswa belum diinstansiasi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void tambah(MH_Reguler data) {
		// TODO Auto-generated method stub
		try {
			if (!data.equals(null)) {
				if (!isFull()) {
					siswa [++index] = data;
					System.out.println("Selamat, data berhasil ditambah ke sistem.");
				} else {
					System.out.println("Maaf, data di sistem sudah penuh.");
				}
			} else {
				System.out.println("Maaf, data siswa belum diinstansiasi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void tambah(MH_Treatment data) {
		// TODO Auto-generated method stub
		try {
			if (!data.equals(null)) {
				if (!isFull()) {
					siswa [++index] = data;
					System.out.println("Selamat, data berhasil ditambah ke sistem.");
				} else {
					System.out.println("Maaf, data di sistem sudah penuh.");
				}
			} else {
				System.out.println("Maaf, data siswa belum diinstansiasi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void tambah(Mahasiswa data, int index) {
		// TODO Auto-generated method stub
		try {
			if (!data.equals(null)) {
				if (!isFull()) {
					if (index <= this.index) {
						for (int i = this.index + 1; i > index; i--) {
							siswa[i] = siswa[i-1];
						}
						siswa [index] = data;
						System.out.println("Selamat, data berhasil ditambah ke sistem.");
					} else {
						System.out.println("Maaf, terjadi kekeliruan pada input index.");
					}
				} else {
					System.out.println("Maaf, data di sistem sudah penuh.");
				}
			} else {
				System.out.println("Maaf, data siswa belum diinstansiasi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Mahasiswa hapus() {
		// TODO Auto-generated method stub
		Mahasiswa siswaLIFO = null;
		try {
			if (!isEmpty()) {
				siswaLIFO = siswa [this.index];
				this.index = this.index - 1;
				System.out.println("Selamat, data terakhir di sistem dihapus.");
			} else {
				System.out.println("Maaf, tidak ada data di sistem");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return siswaLIFO;
	}

	@Override
	public Mahasiswa hapus(int index) {
		// TODO Auto-generated method stub
		Mahasiswa siswaMauDihapus = null;
		try {
			if (!isEmpty()) {
				siswaMauDihapus = siswa [index];
				
				for (int i = index; i < this.index; i++) {
					siswa[i] = siswa[i + 1];
				}
				
				this.index = this.index - 1;
				System.out.println("Selamat, data di indeks dimaksud di sistem dihapus.");
			} else {
				System.out.println("Maaf, tidak ada data di sistem");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return siswaMauDihapus;
	}

	@Override
	public void baca() {
		// TODO Auto-generated method stub
		try {
			if (!isEmpty()) {
				for (int i = 0; i <= this.index; i++) {
					siswa[i].infoMHS();
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void baca(int index) {
		// TODO Auto-generated method stub
		try {
			if (index > this.index) {
				System.out.println("Maaf, indeks tersebut di luar jangkauan sistem kami.");
			} else {
				if (!isEmpty()) {
					siswa[index].infoMHS();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return index == -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return ukuran - 1 == index;
	}

	@Override
	public boolean cari(String nim_mhs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int cariIndex(String nim_mhs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void urutDataBasedOnNim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDataMahasiswa(String nim_mhs) {
		// TODO Auto-generated method stub
		
	}
	
}
