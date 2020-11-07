/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan34.objectorientedkalkulator;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Kalkulator {
    
    public double value1;
    public double value2;
    
    public double tambahBilangan() {
        double jumlah;
        jumlah = value1 + value2;
        System.out.print(jumlah);
        return 0;
    }
    
    public double kurangBilangan() {
        double jumlah;
        jumlah = value1 - value2;
        System.out.print(jumlah);
        return 0;
    }
    
    public double kaliBilangan() {
        double jumlah;
        jumlah = value1 * value2;
        System.out.print(jumlah);
        return 0;
    }
    
    DecimalFormat df = new DecimalFormat("###.##");
    public double bagiBilangan() {
        double jumlah = value1 / value2;
        System.out.print(df.format(jumlah).replace("." , ","));
        return 0;
    }
    
    public double sisaBilangan() {
        double jumlah;
        jumlah = value1 % value2;
        System.out.print(jumlah);
        return 0;
    }
}

public class ObjekKalkulator {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        Kalkulator k = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        k.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        k.value2 = input.nextDouble();
        System.out.println();
        
        System.out.print("Hasil Pertambahan : ");
        k.tambahBilangan();
        System.out.println();
        
        System.out.print("Hasil Pengurangan : ");
        k.kurangBilangan();
        System.out.println();
        
        System.out.print("Hasil Perkalian : ");
        k.kaliBilangan();
        System.out.println();
        
        System.out.print("Hasil Pembagian : ");
        k.bagiBilangan();
        System.out.println();
        
        System.out.print("Hasil Sisa : ");
        k.sisaBilangan();
        System.out.println();
    }
}