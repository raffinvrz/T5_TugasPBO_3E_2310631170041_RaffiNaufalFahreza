package Pertemuan5;

import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input total pembelian
        System.out.print("Total pembelian Rp: ");
        double totalPembelian = input.nextDouble();
        
        // Menghitung besarnya potongan
        double potongan;
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.20 * totalPembelian;
        }
        
        // Menghitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;
        
        // Output hasil
        System.out.println("\n--- Output ---");
        System.out.println("Total pembelian Rp: " + totalPembelian);
        System.out.println("Besarnya potongan Rp: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp: " + totalBayar);
        
        input.close();
    }
}

