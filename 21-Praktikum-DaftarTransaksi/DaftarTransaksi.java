
/**
 * Write a description of class DaftarTransaksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.BigInteger;

public class DaftarTransaksi
{
    private ArrayList <Transaksi> daftar;
    
    public DaftarTransaksi(){
   
   this.daftar = new ArrayList<Transaksi>(); 
    }
    
    public void tambah (Transaksi baru){
     daftar.add(baru);
    }
    
    public int banyakTransaksi (){
    return daftar.size();
    }
    
    public BigInteger saldoAKhir(){
    for (int counter = 0; counter < daftar.size(); counter++){
        saldo=counter+banyakTransaksi;
    }
    
    public String saldoAkhirStr(){
    return daftar;
    }
    
    public void tampilkan (){
    
    }
}
