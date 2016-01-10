import java.math.BigInteger;
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tumpukan
{
   private Node atas;
   private Node bawah;
   
   public Tumpukan(){
    atas=null;
    }
    
    public void tumpuk(BigInteger data){
        Node nodeBaru = new Node (data);
        if (atas == null){
        atas = null;
        }
         else if(bawah == null)
            {
            bawah.berikut = nodeBaru ;
            bawah = atas = null;
       
            }
          
        else {
        atas.berikut = nodeBaru;
        atas = nodeBaru;
            }
            
        }
    
    
    public BigInteger ambil(){
        if (atas == null)
        return null;
        else if (atas == bawah){
        atas=null;
        atas = bawah = null;
        }
        else{
        atas = atas.berikut;
        }
        return null;
}

    public BigInteger atas(){
    this.atas = atas;
    return null;
    }
    
    public BigInteger bawah(){
    this.bawah=bawah;
    return null;
    }
    
}
