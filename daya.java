import java.util.Scanner;
public class daya{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Program pengitung pemakaian listrik sederhana");
        
        System.out.print("Masukkan Nama :");
        String nama1 = input.nextLine();

        System.out.print("Kelurahan :");
        String kelurahan = input.nextLine();

        System.out.print("Masukkan posisi awal Kwh meter  :");
        int posisiAwal = input.nextInt();

        System.out.print("Masukkan posisi akhir Kwh meter :");
        int posisiAkhir = input.nextInt();

        System.out.print("Masukkan biaya beban saat ini   :");
        int biayaBeban = input.nextInt();

        System.out.print("Masukkan PPJ (dalam persen)     :");
        int PPJ = input.nextInt();

        input.close();
        int bulanIni = posisiAkhir - posisiAwal;
        int tarifListrik = biayaBeban*bulanIni ;
        System.out.println();
        System.out.println("====================PLN Java====================");
        System.out.printf("%-20s: %s\n", "Nama", nama1);
        System.out.printf("%-20s: %s\n", "Kelurahan", kelurahan);
        System.out.printf("%-20s: %s Kwh Meter\n", "Pemakaian bulan ini",posisiAkhir - posisiAwal);
        System.out.printf("%-20s: %s,-\n","Tarif Listrik", tarifListrik);
        System.out.printf("%-20s: %s,-\n", "PPJ 10%", (tarifListrik)/PPJ );
        System.out.printf("%-20s: %s,-\n", "Total Bayar", (tarifListrik) + ((tarifListrik)/PPJ));
        System.out.println("================================================");
    }

}