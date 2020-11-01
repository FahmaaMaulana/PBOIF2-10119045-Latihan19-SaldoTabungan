/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan19.saldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                : Fahma Maulana
 * KELAS               : PBOIF2
 * NIM                 : 10119045
 * Deskripsi Program   : SaldoTabungan
 */
public class PBOIF210119045Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Format number
         DecimalFormat kursIndonesia = (DecimalFormat) 
         DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
        Scanner scanner = new Scanner (System.in);
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        int lama,i;
        float bunga;
        double saldoAwal,saldoAkhir;
        
        System.out.print("Saldo Awal : Rp.");
        saldoAwal = scanner.nextDouble();
        
        System.out.print("Bunga/Bulan(%) : Rp.");
        bunga = scanner.nextFloat();
        
        System.out.print("Lama (Bulan) : ");
        lama = scanner.nextInt();
        
        
        bunga = (float) (bunga/100);
        System.out.println(bunga);
        
          for(i = 1 ; i <= lama ; i++) {
              saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
              System.out.printf("Saldo di bulan ke-" + i + "%s %n",kursIndonesia.format(saldoAkhir));
              saldoAwal = saldoAkhir;
        System.out.println("-----------------------------");
        System.out.println("Developed bye : Fahma Maulana"); 
          }
    }
    
}
