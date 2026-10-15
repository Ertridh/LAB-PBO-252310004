package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan07 {
	
	void getDataMahasiswa() {
		String npm = "252310004";
		String namaLengkap = "Bebi Ahmad Janlinov";
		String namaKelas = "TI-25-PA";
		String semester = "3";
		double ipk = 3.6;
		System.out.println("NPM: " + npm);
		System.out.println("Nama Lengkap: " + namaLengkap);
		System.out.println("Nama Kelas: " + namaKelas);
		System.out.println("Semester: " + semester);
		System.out.println("IPK: " + ipk);
	}
	
	public static void main(String[] args) {
		Latihan07 mahasiswa = new Latihan07();
		mahasiswa.getDataMahasiswa();
	}
}
