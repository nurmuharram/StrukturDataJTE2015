
/**
 * Write a description of class Paragraf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paragraf
{
    Kalimat[] paragraf;
    int jumlah,unit;
    public Paragraf(Kalimat[] paragraf){
        this.paragraf=paragraf;
    }
    
   public String tampilkan(){
       String paragraf="";
       return paragraf;
    }
    
     public int tampilkanUnit(String paragraf[]){
        return unit;
    }
    
    public int jumlahUnit(){
        jumlah=paragraf.length;
        return jumlah;
    }
}
