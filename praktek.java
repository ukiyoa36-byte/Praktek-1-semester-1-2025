import java.util.Scanner;
public class praktek {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
         

        System.out.print("masukkan tanggal beli: ");
        int tanggalBeli = input.nextInt();

        System.out.print("masukkan bulan beli: ");
        int bulanBeli = input.nextInt();

        System.out.print("masukkan tahun beli: ");
        int tahunBeli = input.nextInt(); 

        input.nextLine();
        System.out.print("masukkan belanja barang apa: ");
        String belanjaBarang = input.nextLine();

        System.out.print("masukkan jumlah barang berapa: ");
        int jumlahBarang = input.nextInt();

        System.out.print("masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        System.out.print("masukkan diskon: ");
        float diskon = input.nextFloat();

        System.out.print("jenis pembayaran apakah tunai: ");
        boolean jenisPembayaran = input.nextBoolean();

        input.close();
        System.out.println();
        System.out.println("======== List Barang ========");
        System.out.printf("%-20s: %s\n", "Tanggal", tanggalBeli + "-" + bulanBeli + "-" + tahunBeli );
        System.out.printf("%-20s: %s\n","Barang belanja", belanjaBarang );
        System.out.printf("%-20s: %s\n","Jumlah Barang", jumlahBarang );
        System.out.printf("%-20s: %,.2f\n","Harga Barang", hargaBarang );
        System.out.printf("%-20s: %s\n","Diskon", diskon + "%" );
        System.out.println("-----------------------------");
        System.out.printf("%-20s: %,.2f\n","Total Harga", jumlahBarang*hargaBarang);
        System.out.printf("%-20s: %,.2f\n","Pembayaran", ((jumlahBarang*hargaBarang) - (jumlahBarang * hargaBarang * diskon / 100)));
        System.out.printf("%-20s: %s\n","Pembayaran Tunai", jenisPembayaran);

   
 }
}
    
    
    
