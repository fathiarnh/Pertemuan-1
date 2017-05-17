
package enkapsulasi.atk;

public class enkapsulasiHarga{
    private int buku, pensil, penggaris;
    private String pembeli;
    public int jbuku, jpensil, jpenggaris;
    
    public int getBuku(){
        return buku=3000;
    }
    
    public int getPensil(){
        return pensil=1000;
    }
    
    public int getPenggaris(){
        return penggaris=4000;
    }
    
    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }
    
    public String getPembeli(){
        return pembeli;
    }
   
}
