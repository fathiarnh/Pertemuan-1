
package enkapsulasi.atk;

public class enkapsulasiHarga implements implementStok, hitungStok{
    private int buku, pensil, penggaris, sbuku, spensil, spenggaris;
    private String pembeli;
    
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

    @Override
    public int stokBuku() {
        return sbuku=100;
    }

    @Override
    public int stokPensil() {
        return spensil=200;
    }

    @Override
    public int stokPenggaris() {
       return spenggaris=130;
    }

    @Override
    public int hitungStokBarang(int a, int b) {
        return a-b;
    }
}
