
package enkapsulasi.atk;

public class classTampilan implements implementTampilan{

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
        
        Gen1<String> em = new Gen1<String>();
        
        System.out.print("\tEmail \t: ");
        em.setType("bagusrhmt@gmail.com");
        System.out.println(em.getType());
        
        Gen1<Integer> um = new Gen1<Integer>();
        System.out.print("\tUmur \t: ");
        u = 20;
        System.out.println(um.umur(u));      
        
        System.out.println("-------------------------------------");
    }

}
