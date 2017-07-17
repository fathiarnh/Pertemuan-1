
package enkapsulasi.atk;


public class classTampilan implements implementTampilan{
    
    public void tampilMenu(){
        System.out.println("-----------------   MENU/FITUR   ------------------");
        System.out.println("\t\t1. DATA ADMIN");
        System.out.println("\t\t2. LIST HARGA");
        System.out.println("\t\t3. DATA NOTA");
        System.out.println("\t\t4. DATA TRANSAKSI");
        System.out.println("\t\t\tA. DATA PEMBELI");
        System.out.println("\t\t\tB. DATA TRANSAKSI BARANG");
        System.out.println("\t\t\tC. DATA PEMBELIAN");
        System.out.println("\t\t\tD. DATA STOK TERAKHIR");
        System.out.println("\t\t5. KELUAR");
    }

   @Override
    public void tampilBarang() {
        enkapsulasiHarga list = new enkapsulasiHarga();
        System.out.println("================= TOKO ALAT TULIS =================");
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
        System.out.println("---------------------------------------------------");
    }

    @Override
    public void tampilFooter() {        
        System.out.println("---------------------------------------------------");
        System.out.println("\t\t    TERIMAKASIH");
        System.out.println("===================================================");
    }
    
    private static <T> void detailPembeli(T x){
        System.out.println(x);
    }
    
    public void tampilAdmin(){
        String adm, alamat;
        int nip, u;
        
        System.out.println("DATA ADMIN");
        System.out.print("\tNIP \t: ");
        nip = 12;
        Gen1.showNIP(nip);
        
        System.out.print("\tNama \t: ");
        adm = "Bagus Rahmat";
        detailPembeli(adm);
        
        System.out.print("\tAlamat \t: ");
        alamat = "Cibeber, Cimahi";
        Gen1.showAddress(alamat);
        
        Gen1<String> em = new Gen1<>();
        
        System.out.print("\tEmail \t: ");
        em.setType("bagusrhmt@gmail.com");
        System.out.println(em.getType());
        
        Gen1<Integer> um = new Gen1<>();
        System.out.print("\tUmur \t: ");
        u = 20;
        System.out.println(um.umur(u));
    }

}
