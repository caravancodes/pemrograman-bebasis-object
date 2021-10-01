package com.d3if.java.projectpbo.akademik;

public class Mahasiswa {

	String nimMhs, namaMhs, kelas;
	MataKuliah mataKuliah;
	
	public Mahasiswa(String nimMhs, String namaMhs, String kelas, MataKuliah mataKuliah) {
		setNimMhs(nimMhs); setNamaMhs(namaMhs); setKelas(kelas); setMataKuliah(mataKuliah);
	}

	public void infoMahasiswa() {
		System.out.println("Nim MHS:            " + getNimMhs());
		Firhan.tulis      ("Nama MHS:           " + getNamaMhs() + '\n');
		Firhan.tulis      ("Kelas MHS:          " + getKelas() + '\n');
		Firhan.tulis      ("Mengambil Mata Kuliah           \n");
		Firhan.tulis      (" Kode MK:           " + getMataKuliah().getKodeMK() + '\n');
		Firhan.tulis      (" Nama MK:           " + getMataKuliah().getNamaMK() + '\n');
		Firhan.tulis      (" SKS MK:            " + getMataKuliah().getSks() + '\n');
		Firhan.tulis      (" Nilai UTS:         " + getMataKuliah().getNilai().getUts() + '\n');
		Firhan.tulis      (" Nilai UAS:         " + getMataKuliah().getNilai().getUas() + '\n');
		Firhan.tulis      (" Nilai QUIS:        " + getMataKuliah().getNilai().getQuis() + '\n');
		Firhan.tulis      (" Nilai TUGAS:       " + getMataKuliah().getNilai().getTugas() + '\n');
		Firhan.tulis      (" Nilai Akhir:       " + getMataKuliah().getNilai().getRataan() + '\n');
		Firhan.tulis      (" Nilai Mutu:        " + getMataKuliah().getNilai().getIndeksNilai() + "\n\n");
	}
	
	public String getNimMhs() {
		return nimMhs;
	}

	public void setNimMhs(String nimMhs) {
		this.nimMhs = nimMhs;
	}

	public String getNamaMhs() {
		return namaMhs;
	}

	public void setNamaMhs(String namaMhs) {
		this.namaMhs = namaMhs;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}

	public MataKuliah getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(MataKuliah mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

}
