package PBO;

import java.util.Scanner;
        
public class TaxiBerjalan {
    public static void main(String[] args) {
        //object
        //Taxi txi = new Taxi("Mahiesta Dila Tahassema","DA3223ZT");
        
        //System.out.println(txi.displayInfo());
        //System.out.println(txi.displayInfo("Banjarmasin"));
        
        //error handling
        try{
          //io sederhana
          Scanner scanner = new Scanner (System.in);
        
          //array
          TaxiInformation[] txi = new TaxiInformation[2];
        
          //perulangan for biasa
          for(int i=0; i<txi.length; i++){
          System.out.print("Masukkan nama supir " +(i+1)+": ");
          String namasupir =scanner.nextLine();
          System.out.print("Masukkan nomor plat "+(i+1)+": ");
          String nomorplat = scanner.nextLine();
            
          //object
          txi[i] = new TaxiInformation(namasupir, nomorplat);
          }
        
         //perulangan for array
          for(TaxiInformation data: txi){  
            System.out.println("================");
            System.out.println("Data Taxi");
            System.out.println(data.displayInfo());
           }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor: "+e.getMessage());
        }
        
    }
}      

