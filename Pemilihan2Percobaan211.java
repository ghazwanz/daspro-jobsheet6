import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int pilihan_menu;
        double harga,diskon,total_bayar;
        String member,pembayaran;
        System.out.println("--------------------------------------");
        System.out.println("============ MENU KAFE JTI ===========");
        System.out.println("--------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");

        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input11.nextInt();
        input11.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input11.nextLine();
        System.out.print("Pilih metode pembayaran (Cash / QRIS) = ");
        pembayaran = input11.nextLine();

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            if (pembayaran.equals("QRIS")) {
                total_bayar = total_bayar - 1000;
            }
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            if (pembayaran.equals("QRIS")) {
                harga = harga - 1000;
            }
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("======================================");
    }
}