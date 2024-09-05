package Tugas;

import java.util.Scanner;

public class TUUUUUGAs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomor[] = new int[3];


        System.out.println("Input Angka ke 1 : ");
        nomor[0] = input.nextInt();

        System.out.println("Input Angka ke 2 : ");
        nomor[1] = input.nextInt();

        System.out.println("Input Angka ke 3 : ");
        nomor[2] = input.nextInt();

        int nomorTergede = nomor[0];

        if (nomor[1] > nomorTergede) {
            nomorTergede = nomor[1];
        }
        if (nomor[2] > nomorTergede) {
            nomorTergede = nomor[2];
        }

        System.out.println("Nomor Tergede adalah : " + nomorTergede);


    }
}
