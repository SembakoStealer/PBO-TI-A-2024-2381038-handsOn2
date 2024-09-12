package Tugas;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner masukin = new Scanner(System.in);

        int numero[] = new int[2];

        System.out.println("Masukin angka ke-1 : ");
        numero[0] = masukin.nextInt();

        System.out.println("Masukin angka ke-2 : ");
        numero[1] = masukin.nextInt();

        System.out.println("Pilih angka mau diapain ( +, -, *, /, % )");
        String pilihanOperand = masukin.next();

        int hasilPerhitungan;
        switch (pilihanOperand){
            case "+":
                hasilPerhitungan = numero[0] + numero[1];
                break;
            case "-":
                hasilPerhitungan = numero[0] - numero[1];
                break;
            case "*":
                hasilPerhitungan = numero[0] * numero[1];
                break;
            case "/":
                hasilPerhitungan = numero[0] / numero[1];
                break;
            case "%":
                hasilPerhitungan = numero[0] % numero[1];
                break;
            default:

            System.out.println("Tidak tersedia");
            return;
        }

        System.out.println("Jawabannya adalah : " + hasilPerhitungan);

    }
}

