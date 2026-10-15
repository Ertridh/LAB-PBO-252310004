package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String hasil = kalimat.toUpperCase();

        System.out.println("Hasil: " + hasil);
    }
}

