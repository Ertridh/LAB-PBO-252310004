package pembelajaran_01_runtutan;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaToko = "TOKO SERBAGUNA IBIK";
        String namaProduk = "ROTI ENAK";
        int hargaSatuan = 6300;

        LocalDateTime waktuSekarang = LocalDateTime.now();

        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                     " + namaToko);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah produk yang dibeli : ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah produk harus lebih dari 0.");
        }

        int totalHarga = jumlah * hargaSatuan;
        double diskon = 0;

        if (jumlah % 3 == 0) {
            diskon = totalHarga * 0.05;
        }

        double totalBayar = totalHarga - diskon;
        System.out.println();
        System.out.println("Tanggal : " + waktuSekarang.format(formatWaktu));
        System.out.printf("%-20s %8s %15s %15s%n",
                "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("============================================================");

        System.out.printf("%-20s %8d %15s %15s%n",
                namaProduk,
                jumlah,
                "Rp " + hargaSatuan + ",-",
                "Rp " + totalHarga + ",-");

        System.out.println("------------------------------------------------------------");

        System.out.println("Diskon       : " +
                (diskon > 0 ? "5%" : "0%"));

        System.out.println("Sub Total  : Rp " +
                totalBayar + ",-");

        System.out.println("============================================================");
    }
}
