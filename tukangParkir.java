import java.util.Scanner ;
public class tukangParkir {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int tarifAwal = 5000 ;
        double menit = in.nextDouble ();
        in.nextLine();
        if (menit <= 0) {
            System.out.println("Misiiii input ga valid nihh!!");
            
        } 
        String kendaraan = in.nextLine();
        
        //input
        
        if (menit <= 5) {
            System.out.printf ("Biaya parkir %s hanya Rp3,000.00 karena hanya %s menit", kendaraan, menit );
        } else
        if(kendaraan.equalsIgnoreCase("mobil") && menit <= 120) {
            double biaya =  tarifAwal;
            menit = menit/60;
            System.out.printf("Biaya parkir %s selama %,.1f jam adalah Rp %,.2f\n", kendaraan, menit, biaya );
        }else
        if(kendaraan.equalsIgnoreCase("motor") && menit <= 120) {
             double biaya =  tarifAwal;
            menit = menit/60;
            System.out.printf("Biaya parkir %s selama %,.1f jam adalah Rp %,.2f\n", kendaraan, menit, biaya);
        } else 
        if (kendaraan.equalsIgnoreCase("mobil") && menit > 120) {
            double biaya = ((int)Math.ceil(menit-120)/10) * 2000 + tarifAwal;
            menit = menit / 60;
            System.out.printf("Biaya parkir %s selama %,.1f jam adalah Rp %,.2f\n", kendaraan, menit, biaya);
        } else 
        if (kendaraan.equalsIgnoreCase("motor") && menit > 120) {
            double biaya = ((int)Math.ceil(menit-120)/10) * 1000 + tarifAwal;
            menit = menit/60;
            System.out.printf("Biaya parkir %s selama  %,.1f jam adalah Rp%,.2f\n ", kendaraan, menit, biaya);
        } else {
            System.out.println("Jalan kaki tidak perlu bayar parkir");
        }
         
        
        
    }
}

   