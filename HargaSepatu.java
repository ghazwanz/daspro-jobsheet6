import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori, merk;
        byte ukuran;
        int harga = 0;

        System.out.print("Masukkan merk: ");
        merk = input.nextLine();

        System.out.print("Masukkan kategori: ");
        kategori = input.nextLine();

        System.out.print("Masukkan ukuran: ");
        ukuran = input.nextByte();

        if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    } else System.out.println("Ukuran Tidak Tersedia");
                } else System.out.println("Ukuran Tidak Tersedia");
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    } else System.out.println("Ukuran Tidak Tersedia");
                } else System.out.println("Ukuran Tidak Tersedia");
            } else System.out.println("Kategori Tidak Tersedia");
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    } else System.out.println("Ukuran Tidak Tersedia");
                } else System.out.println("Ukuran Tidak Tersedia");

            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    } else System.out.println("Ukuran Tidak Tersedia");
                } else System.out.println("Ukuran Tidak Tersedia");
            } else System.out.println("Kategori Tidak Tersedia");

        } else if (merk.equalsIgnoreCase("ortus")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    } else System.out.println("Ukuran Tidak Tersedia");
                } else System.out.println("Ukuran Tidak Tersedia");
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    } else System.out.println("Ukuran Tidak Tersedia");
                } else System.out.println("Ukuran Tidak Tersedia");
            } else System.out.println("Kategori Tidak Tersedia");

        } else System.out.println("Merk Tidak Tersedia");

        System.out.println("Total Harga: " + harga);
    }
}
