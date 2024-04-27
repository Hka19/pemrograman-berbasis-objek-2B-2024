/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Kalkulator:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("MASUKAN PILIHAN ANDA: ");
        int choice = scanner.nextInt();

        System.out.print("Masukkan Angka 1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Masukkan Angka 2: ");
        double operand2 = scanner.nextDouble();

        // Membuat objek berdasarkan pilihan pengguna
        Calculator calculator = null;
        switch (choice) {
            case 1:
                calculator = new Penjumlahan(operand1, operand2);
                break;
            case 2:
                calculator = new Pengurangan(operand1, operand2);
                break;
            case 3:
                calculator = new Perkalian(operand1, operand2);
                break;
            case 4:
                calculator = new Pembagian(operand1, operand2);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        // Memanggil metode calculate dan menampilkan hasil
        if (calculator != null) {
            double result = calculator.calculate();
            System.out.println("Hasil: " + result);
        }

        scanner.close();
    }
}
