package pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM Anda: ");
        long npm = input.nextLong();

        System.out.print("Enter the number of row: ");
        int baris = input.nextInt();

        if (baris <= 0) {
            System.out.println("Jumlah baris harus lebih dari 0.");
        } else if (npm % 2 == 0) {
            for (int i = 0; i < 2 * baris; i++) {
                int jumlahBintang;

                if (i < baris) {
                    jumlahBintang = baris - i;
                } else {
                    jumlahBintang = i - baris + 1;
                }

                for (int j = 0; j < jumlahBintang; j++) {
                    System.out.print("* ");
                }

                for (int j = 0; j < 2 * (baris - jumlahBintang); j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j < jumlahBintang; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        } 
    }
}
