/*
Habibie Putra Sauqi
255150707111058
*/

import java.util.Scanner;
public class luas {
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        

        System.out.println("Menu : ");
        System.out.println("1. mengitung luas dan keliling persegi panjang");
        System.out.println("2. mengitung luas dan keliling lingkaran");
        System.out.printf("3. mengitung luas dan keliling segitiga\n\n");

        System.out.print("masukkan pilihan anda: ");
        int pilihanAnda = input.nextInt();

        System.out.print("masukkan a: ");
        long a = input.nextLong();

        System.out.print("masukkan b: ");
        long b = input.nextInt();

        System.out.printf("masukkan r: ");
        long r = input.nextLong();
        System.out.println();
        
        
        
        input.close();

        switch (pilihanAnda) {
            case 1:
            long luasPersegiPanjang = a*b ;
            long kelilingPersegiPanjang = 2*(a=b);
            System.out.printf("%-20s: %s cm\n","luas persegi panjang", luasPersegiPanjang);
            System.out.printf("%-20s: %s cm\n","keliling persegi panjang", kelilingPersegiPanjang);      
            break;

            case 2:
            double luasLingkaran = Math.PI*r*r ;
            double kelilingLingkaran = 2*Math.PI*r ;
            System.out.printf("%-20s: %,.2f cm\n","luas lingkaran", luasLingkaran);
            System.out.printf("%-20s: %,.2f cm\n","keliling lingkaran", kelilingLingkaran);
            break; 
             
            case 3:
            double luasSegitiga = 1/2.0*a*b ;
            double kelilingSegitiga = a + b + r ;
            System.out.printf("%-20s: %s cm\n","luas segitiga", luasSegitiga);
            System.out.printf("%-20s: %s cm\n","keliling segitiga", kelilingSegitiga);
            break;
            
            default: 
            System.out.println("Data tidak ditemukan, prpgram dihentikan...");
                break;
        }


        
       
    }
}
