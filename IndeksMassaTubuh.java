package Pertemuan5;

import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input berat badan dan tinggi badan
        System.out.print("Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();
        
        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        // Menentukan kategori IMT
        String kategori;
        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }
        
        // Output hasil IMT dan kategori
        System.out.println("\n--- Output ---");
        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kategori: " + kategori);
        
        input.close();
    }
}
