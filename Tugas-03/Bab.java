
/**
 * Write a description of class Bab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bab
{
   Paragraf [] bab;
   int jumlah,unit;
   
   public Bab(Paragraf [] bab){
       this.bab=bab;
    }
    public String tampilkan(){
        String bab="";
        return bab;
    }
    
     public int tampilkanUnit(String bab[]){
        return unit; 
    }
    
    public int jumlahUnit(){
        jumlah=bab.length;
        return jumlah;
    }
}
