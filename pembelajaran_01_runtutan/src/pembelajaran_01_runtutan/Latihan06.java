package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");

        System.out.println("Nama setelah diubah: " + hasil);

        input.close();
    }
}

