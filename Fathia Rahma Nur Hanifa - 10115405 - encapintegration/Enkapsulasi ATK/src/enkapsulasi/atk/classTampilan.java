
package enkapsulasi.atk;

public class classTampilan implements implementTampilan{

   @Override
    public void tampilBarang() {
        enkapsulasiHarga list = new enkapsulasiHarga();
        System.out.println("========== TOKO ALAT TULIS ==========");
        System.out.println("LIST HARGA :");
        System.out.println("\tBuku      = Rp."+list.getBuku());
        System.out.println("\t            Stok Barang : "+list.stokBuku());
        System.out.println("\tPensil    = Rp."+list.getPensil());
        System.out.println("\t            Stok Barang : "+list.stokPensil());
        System.out.println("\tPenggaris = Rp."+list.getPenggaris());
        System.out.println("\t            Stok Barang : "+list.stokPenggaris());
    }

    @Override
    public void tampilDiskon() {
        System.out.println("\nDapatkan Diskon 10% setiap belanja");
        System.out.println("       lebih dari Rp.25000");
        System.out.println("-------------------------------------");
    }

    @Override
    public void tampilFooter() {        
        System.out.println("--------------------------------------");
        System.out.println("\t    TERIMAKASIH");
        System.out.println("======================================");
    }   

}
