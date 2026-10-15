package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan usia: ");
		String usia = input.nextLine();
		System.out.print("Masukkan nama pertama: ");
		String firstName = input.nextLine();
		System.out.print("Masukkan nama terakhir: ");
		String lastName = input.nextLine();
		System.out.print("Masukkan NPM: ");
		String npm = input.nextLine();
		
		System.out.println("Hasil: " + usia.concat(firstName).concat(lastName).concat(npm));
	}
}
