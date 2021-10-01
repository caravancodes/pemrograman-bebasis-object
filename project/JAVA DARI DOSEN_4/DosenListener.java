package uk.mbs.java.pbo.pra_as_ka02;

public interface DosenListener {

	public void tambah (Mahasiswa data);

	public void tambah (MH_Reguler data);
	
	public void tambah (MH_Treatment data);

	public void tambah (Mahasiswa data, int index);
	
	public Mahasiswa hapus();
	
	public Mahasiswa hapus(int index);
	
	public void baca();
	
	public void baca (int index);
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public boolean cari (String nim_mhs);
	
	public int cariIndex (String nim_mhs);
	
	public void urutDataBasedOnNim();
	
	public void updateDataMahasiswa(String nim_mhs);
	// dan lainnya
}
