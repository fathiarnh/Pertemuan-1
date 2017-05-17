

package enkapsulasi.atk;

import java.util.Scanner;


public class EnkapsulasiATK {

    public static void main(String[] args) {
        int jbuku, jpensil, jpenggaris;
        int tbuku, tpensil, tpenggaris, tbarang;
        
        enkapsulasiHarga list = new enkapsulasiHarga();
        hitungATK hitung = new hitungATK();
        System.out.println("========== TOKO ALAT TULIS ==========");
        System.out.println("LIST HARGA :");
        System.out.println("\tBuku      = Rp."+list.getBuku());
        System.out.println("\tPensil    = Rp."+list.getPensil());
        System.out.println("\tPenggaris = Rp."+list.getPenggaris());
        System.out.println("-------------------------------------");
        
        Scanner input = new Scanner(System.in);        
             
        System.out.print("Masukan nama Pembeli     : ");
        String nama = input.nextLine();
        list.setPembeli(nama);
        
        System.out.print("Masukan Jumlah Buku      : ");
        jbuku = input.nextInt();
        
        System.out.print("Masukan Jumlah Pensil    : ");
        jpensil = input.nextInt();
        
        System.out.print("Masukan Jumlah Penggaris : ");
        jpenggaris = input.nextInt();
        
         System.out.println("-------------------------------------");
        
        tbuku = hitung.hitungBarang(jbuku, list.getBuku());
        tpensil = hitung.hitungBarang(jpensil, list.getPensil());
        tpenggaris = hitung.hitungBarang(jpenggaris, list.getPenggaris());
        
        tbarang = hitung.hitungTotal(tbuku, tpensil, tpenggaris);
        
        System.out.println("Nama Pembeli         : "+list.getPembeli());
        System.out.println("Total Harga Buku      : Rp."+tbuku);
        System.out.println("Total Harga Pensil    : Rp."+tpensil);
        System.out.println("Total Harga Penggaris : Rp."+tpenggaris);
        System.out.println("\nJumlah Pembayaran     : Rp."+tbarang);
         System.out.println("-------------------------------------");
        System.out.println("\t\tTERIMAKASIH");
        System.out.println("======================================");
    }
    
}
