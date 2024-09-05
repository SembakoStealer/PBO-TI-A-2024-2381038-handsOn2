package branching;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukin Nomor Hari : ");
        int nomorHari = input.nextInt();

        String namaHari = " ";

        if (nomorHari == 1){
            namaHari = "Minggu";
        } else if (nomorHari == 2 ) {
            namaHari = "Senin";
        } else if (nomorHari == 3 ) {
            namaHari = "Selasa";
        } else if (nomorHari == 4 ) {
            namaHari = "Rabu";
        } else if (nomorHari == 5 ) {
            namaHari = "Kamis";
        } else if (nomorHari == 6 ) {
            namaHari = "Jumat";
        } else if (nomorHari == 2 ) {
            namaHari = "sabtu";
        } else  {
            System.out.println("Nomor tidak tersedia ");
            System.exit(0);
        }


    }
}
