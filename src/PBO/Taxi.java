/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

//class
public class Taxi {
    //attribute dan encapsulation
    private String namasupir;
    private String nomorplat;
    
    //constructor
    public Taxi(String namasupir, String nomorplat) {
        this.namasupir = namasupir;
        this.nomorplat = nomorplat;
    }
   
    //mutator
    public void setNamasupir(String namasupir) {
        this.namasupir = namasupir;
    }

    public void setNomorplat(String nomorplat) {
        this.nomorplat = nomorplat;
    }

    //accessor
    public String getNamasupir() {
        return namasupir;
    }

    public String getNomorplat() {
        return nomorplat;
    }
    
    public String displayInfo() {
        return "Namasupir: "+getNamasupir()+"\nNomorplat: "+getNomorplat();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String tujuan){
        return displayInfo() + "\nTujuan: "+tujuan;
        
    }
            
 }



