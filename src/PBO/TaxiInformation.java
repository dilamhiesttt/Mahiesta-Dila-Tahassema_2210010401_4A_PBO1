package PBO;

//inheritance
public class TaxiInformation extends Taxi{
    //overriding
    public TaxiInformation(String namasupir, String nomorplat) {
        super(namasupir, nomorplat);
    }
    
    public int getTahunRegistrasiKendaraan() {
        return Integer.parseInt(getNomorplat() .substring(4, 6)) + 2000 ;
    }
    
    public String getAsalKotaKedaraan(){
        //seleksi if
        if("DA".equals(getNomorplat() .substring(0, 2))){
            return "Kalimantan Selatan";
        } else {
            return "Kota lain";
        }
        
            }
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Registrasi: "+getTahunRegistrasiKendaraan()+
                "\nAsal Kota Kendaraan: "+getAsalKotaKedaraan();
    }
}
