package pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Resto {
    private long Harga;
    private int pilihan;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("       MENU SARAPAN");
        System.out.println("==============================");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.println("==============================");

        System.out.print("Masukkan pilihan menu Anda: ");
        pilihan = input.nextInt();

        Long hargaMenu = getPrices();

        if (hargaMenu == null) {
            System.out.println("Maaf menu yang anda masukan salah.");
        } else {
            switch (pilihan) {
                case 1:
                    System.out.println(
                        "Anda memesan Nasi Goreng dengan harga Rp "
                        + String.format("%,d", Harga).replace(',', '.')
                        + ",-"
                    );
                    break;

                case 2:
                    System.out.println(
                        "Anda memesan Bubur Ayam dengan harga Rp "
                        + String.format("%,d", Harga).replace(',', '.')
                        + ",-"
                    );
                    break;

                case 3:
                    System.out.println(
                        "Anda memesan Soto Ayam dengan harga Rp "
                        + String.format("%,d", Harga).replace(',', '.')
                        + ",-"
                    );
                    break;
            }
        }
    }

    private Long getPrices() {
        switch (pilihan) {
            case 1:
                Harga = 22000L;
                return Harga;

            case 2:
                Harga = 15000L;
                return Harga;

            case 3:
                Harga = 25000L;
                return Harga;

            default:
                return null;
        }
    }
}

