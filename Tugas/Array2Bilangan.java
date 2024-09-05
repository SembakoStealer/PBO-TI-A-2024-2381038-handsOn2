package Tugas;

import java.util.Scanner;

public class Array2Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomor [] = new int[2];

        System.out.println("Masukin data ke-1 : ");
        nomor[0] = input.nextInt();

        System.out.println("Masukin data ke-2 : ");
        nomor [1] = input.nextInt();

        int terbesar;
        if(nomor [0] > nomor[1]){
            terbesar = nomor[0];
        }
        else {
            terbesar = nomor[1];
        }

        System.out.println("Nomor terbesar adalah : " + terbesar);


    }
}
