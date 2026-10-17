package pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pinBenar;
        String pinInput;

        long saldo = 0;

        System.out.print("Tetapkan PIN sesuai NPM Anda: ");
        pinBenar = input.nextLine();

        do {
            System.out.print("Masukkan PIN: ");
            pinInput = input.nextLine();

            if (!pinInput.equals(pinBenar)) {
                System.out.println("PIN salah. Silakan coba kembali.");
            }
        } while (!pinInput.equals(pinBenar));

        boolean selesai = false;

        while (!selesai) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case "2":
                    System.out.print("Masukkan nominal setor tunai: Rp ");
                    String setorInput = input.nextLine();

                    try {
                        long setor = Long.parseLong(setorInput);

                        if (setor > 0) {
                            saldo += setor;
                            System.out.println("Setor tunai berhasil.");
                        } else {
                            System.out.println(
                                "Nominal harus lebih dari 0."
                            );
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Nominal tidak valid.");
                    }
                    break;

                case "3":
                    System.out.print("Masukkan nominal tarik tunai: Rp ");
                    String tarikInput = input.nextLine();

                    try {
                        long tarik = Long.parseLong(tarikInput);

                        if (tarik <= 0) {
                            System.out.println(
                                "Nominal harus lebih dari 0."
                            );
                        } else if (tarik <= saldo) {
                            saldo -= tarik;
                            System.out.println("Tarik tunai berhasil.");
                        } else {
                            System.out.println("Saldo tidak cukup.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Nominal tidak valid.");
                    }
                    break;

                case "4":
                    selesai = true;
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }

            if (!selesai) {
                System.out.println("Saldo Anda: Rp " + saldo);

                System.out.print(
                    "Apakah Anda ingin keluar dari aplikasi? (Y/N): "
                );
                String konfirmasi = input.nextLine();

                if (konfirmasi.equalsIgnoreCase("Y")) {
                    selesai = true;
                }
            }
        }

        System.out.println("Terima kasih telah menggunakan ATM.");
    }
}