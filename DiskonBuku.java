import java.util.Scanner;

public class DiskonBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        double diskon;
        short jmlBuku;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jmlBuku = input.nextShort();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jmlBuku > 2) {
                diskon = 0.12;
            } else diskon = 0.10;
        } else if (jenisBuku.equalsIgnoreCase("novel")||jmlBuku >3) {
            if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jmlBuku > 3) {
                    diskon = 0.07 + 0.02;
                } else diskon = 0.07 + 0.01;
            } else diskon = 0.05;
        } else diskon = 0;

        System.out.println("Jumlah diskon yang didapat sebesar: " + diskon);
    }
}