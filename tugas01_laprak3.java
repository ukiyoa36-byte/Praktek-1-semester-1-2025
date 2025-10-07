import java.util.*;
public class tugas01_laprak3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ArrayList <Integer> dataAngka = new ArrayList <>();
        boolean lanjut = true;
        while (lanjut){
            System.out.println("\n========= MENU DATA =========");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average (Rata-rata)");
            System.out.println("4. Sum (Jumlah)");
            System.out.println("5. Max (Nilai Tertinggi)");
            System.out.println("6. Min (Nilai Terendah)");
            System.out.println("0. Keluar");
            System.out.println("===========================");
            System.out.print("Masukkan pilihan: ");
            int pilihan = in.nextInt();
            in.nextLine();
        
            switch (pilihan){
            case 1 :// input data
                System.out.println("masukkan data : ");
                int angkaBaru = in.nextInt();
                dataAngka.add(angkaBaru);
                System.out.println("data anda: " + angkaBaru); break;
            case 2 :// Lihat data
                if (dataAngka.isEmpty()){
                    System.out.println("data masih kosong");
                } else {
                    System.out.println("Data terkini: " + dataAngka);
                }
                break;
            case 3 :// average
                if (dataAngka.isEmpty()){
                    System.out.println("data masih kosong");
                } else {
                    double total = 0;
                    for (int angka : dataAngka){
                        total += angka;
                        double rataRata = total / dataAngka.size();
                        System.out.printf("rata-rata adalah %,.2f\n",rataRata);
                    }
                } break;
            case 4: //Sum
                if (dataAngka.isEmpty()) {
                    System.out.println(" data masih kosong");
                } else {
                    int total = 0;
                    for (int angka : dataAngka){
                        total += angka;
                    } System.out.printf("nilai sum adalah: %s\n"  ,total);
                } break;
            case 5 : // nilai max
                System.out.println("Nilai tertinggi adalah: " + Collections.max(dataAngka));
                break;
                
            case 6 :
                 System.out.println("Nilai tertinggi adalah: " + Collections.min(dataAngka));
                break;

            case 7:
                lanjut = false;
                System.out.println("Program selesai");
            default :
                System.out.println(" input tdiak vakid");
                break;
            }
        }
        in.close();    
    }
    
}
