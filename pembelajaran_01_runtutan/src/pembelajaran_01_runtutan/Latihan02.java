package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan02 {
	public static int luas;
	public static int keliling;
	public static Scanner input = new Scanner(System.in);
	
	void hitungLuasLayang() {
		int d1;
		int d2;
		
		System.out.print("Masukkan diagonal 1: ");
		d1 = input.nextInt();
		System.out.print("Masukkan diagonal 2: ");
		d2 = input.nextInt();
		
		luas = (d1 * d2) / 2;
		System.out.println("Luas layang-layang: " + luas);
	}
	
	void hitungKelilingLayang() {
		int a;
		int b;
		
		System.out.print("Masukkan sisi 1: ");
		a = input.nextInt();
		System.out.print("Masukkan sisi 2: ");
		b = input.nextInt();
		
		keliling = 2 * (a + b);
		System.out.println("Keliling layang-layang: " + keliling);
	}
	
	void hitungLuasPrismaSegitiga() {
		int alas;
		int tinggiSegitiga;
		int tinggiPrisma;
		int sisi1, sisi2, sisi3;
		
		System.out.print("Masukkan alas: ");
		alas = input.nextInt();
		System.out.print("Masukkan tinggi segitiga: ");
		tinggiSegitiga = input.nextInt();
		System.out.print("Masukkan tinggi prisma: ");
		tinggiPrisma = input.nextInt();
		System.out.println("Masukkan Keliling");
		System.out.print("Sisi 1: ");
		sisi1 = input.nextInt();
		System.out.print("Sisi 2: ");
		sisi2 = input.nextInt();
		System.out.print("Sisi 3: ");
		sisi3 = input.nextInt();
		
		luas = (alas * tinggiSegitiga) + (sisi1 + sisi2 + sisi3) * tinggiPrisma;
		System.out.println("Luas prisma segitiga = " + luas);
	}
	
	void hitungKelilingPrismaSegitiga() {
		int sisi1, sisi2, sisi3;
		int tinggiPrisma;
		
		System.out.print("Masukkan sisi 1: ");
		sisi1 = input.nextInt();
		System.out.print("Masukkan sisi 2: ");
		sisi2 = input.nextInt();
		System.out.print("Masukkan sisi 3: ");
		sisi3 = input.nextInt();
		System.out.print("Masukkan tinggi prisma: ");
		tinggiPrisma = input.nextInt();
		
		keliling = (2 * (sisi1 + sisi2 + sisi3)) + (3 * tinggiPrisma);
		System.out.println("Keliling prisma segitiga = " + keliling);
	}
	
	public static void main(String[] args) {
		int pilihan;
		int pilihan2;
		String pilihan3;
		Latihan02 bangungan = new Latihan02();
		
		do {
			System.out.println("== Menghitung Luas dan Keliling Bangunan ==");
			System.out.println("1. Layang-layang");
			System.out.println("2. Prisma Segitiga\n");
			
			System.out.print("Masukkan bangungan yang ingin dihitung: ");
			pilihan = input.nextInt();
			System.out.print("Luas(1) atau Keliling(2): ");
			pilihan2 = input.nextInt();
			input.nextLine();
			
			if (pilihan == 1 && pilihan2 == 1) {
				bangungan.hitungLuasLayang();
			} else if (pilihan == 1 && pilihan2 == 2) {
				bangungan.hitungKelilingLayang();
			} else if (pilihan == 2 && pilihan2 == 1) {
				bangungan.hitungLuasPrismaSegitiga();
			} else if (pilihan == 2 && pilihan2 == 2) {
				bangungan.hitungKelilingPrismaSegitiga();
			} else {
				System.out.println("Masukkan pilihan yang benar! (1/2)");
			}
			
			input.nextLine();
			
			System.out.print("Ingin mencoba lagi? (y/n): ");
			pilihan3 = input.nextLine();
			System.out.println();
			
		} while (pilihan3.equalsIgnoreCase("y"));
		
		System.out.println("Terima kasih");
	}
}
