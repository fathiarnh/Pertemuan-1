
package enkapsulasi.atk;

import java.util.Scanner;
import data_transaksi.transaksi;


public class EnkapsulasiATK {

    public static void main(String[] args) {
        int jbuku, jpensil, jpenggaris;
        int tbuku, tpensil, tpenggaris, tbarang;
        double diskon, tbayar;
        
        enkapsulasiHarga list = new enkapsulasiHarga();
        hitungATK hitung = new hitungATK();
        classTampilan tampil = new classTampilan();
        Scanner input = new Scanner(System.in);
        transaksi nota = new transaksi();
                
        BiodataGeneric<String> nama = new BiodataGeneric<String>();
        //DI SAYA EEROR JIKA : ... = new BiodataGeneric<>();
        BiodataGeneric<String> alamat = new BiodataGeneric<String>();
        BiodataGeneric<Character> jk = new BiodataGeneric<Character>();
        BiodataGeneric<String> telp = new BiodataGeneric<String>();
        BiodataGeneric<String> mail = new BiodataGeneric<String>();
        
        tampil.tampilAdmin();
        tampil.tampilBarang();
        tampil.tampilDiskon();
        
        System.out.println("DATA TRANSAKSI : ");
        System.out.println("\tNo Nota      : "+nota.noNota(215));
        System.out.println("\tNama Kasir   : "+nota.nama("Nita A.P"));
        System.out.println("\tTanggal/Jam  : "+nota.tanggal("6/14/2017")+" "+nota.jam("9:18 AM"));
        System.out.println("\tDust         : "+nota.dust("01 CASH"));
        
        System.out.println("---------------------------------------------------");
                
        System.out.println("DATA PEMBELI : ");     
        System.out.print("\tMasukan nama Pembeli     : ");
        nama.setIdentitas(input.nextLine());        
        
        System.out.print("\tMasukan alamat Pembeli   : ");
        alamat.setIdentitas(input.nextLine());
               
        System.out.print("\tMasukan telepon Pembeli  : ");
        telp.setIdentitas(input.nextLine());
        
        System.out.print("\tMasukan email Pembeli    : ");
        mail.setIdentitas(input.nextLine());
        
        System.out.println("\tMasukan Gender Pembeli");
        System.out.print("\t(P/L)                    : ");
        jk.setIdentitas(input.next().charAt(0));
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("DATA TRANSAKSI BARANG : ");
        System.out.print("\tMasukan Jumlah Buku      : ");
        jbuku = input.nextInt();
        
        System.out.print("\tMasukan Jumlah Pensil    : ");
        jpensil = input.nextInt();
        
        System.out.print("\tMasukan Jumlah Penggaris : ");
        jpenggaris = input.nextInt();
        
        System.out.println("---------------------------------------------------");
        System.out.println("DATA PEMBELIAN : ");
        tbuku = hitung.hitungBarang(jbuku, list.getBuku());
        tpensil = hitung.hitungBarang(jpensil, list.getPensil());
        tpenggaris = hitung.hitungBarang(jpenggaris, list.getPenggaris());
        
        tbarang = hitung.hitungTotal(tbuku, tpensil, tpenggaris);
        
        System.out.println("\tNama           : "+nama.getIdentitas());
        System.out.println("\tJenis Kelamin  : "+jk.getIdentitas());
        System.out.println("\tAlamat         : "+alamat.getIdentitas());
        System.out.println("\tNo Telepon     : "+telp.getIdentitas());
        System.out.println("\tE-Mail         : "+mail.getIdentitas()); 
        System.out.println("\n\tTotal Harga Buku      : Rp."+tbuku);
        System.out.println("\tTotal Harga Pensil    : Rp."+tpensil);
        System.out.println("\tTotal Harga Penggaris : Rp."+tpenggaris);
        System.out.println("\n\tJumlah Pembayaran     : Rp."+tbarang);
        
        if(tbarang >= 25000){
            diskon = hitung.hitungDiskon(tbarang);
        }else{
            diskon = hitung.hitungDiskon(0);
        }
        
        tbayar = hitung.hitungTotalAkhir(tbarang, diskon);
        
        System.out.println("\tDiskon                : Rp."+diskon);
        System.out.println("\tTotal Bayar           : Rp."+tbayar);
        System.out.println("---------------------------------------------------");
        int stokBuku = list.hitungStokBarang(list.stokBuku(), jbuku );
        int stokPensil = list.hitungStokBarang(list.stokPensil(), jpensil );
        int stokPenggaris = list.hitungStokBarang(list.stokPenggaris(), jpenggaris );
        System.out.println("DATA STOK TERAKHIR : ");
        System.out.println("\tstok buku      : "+stokBuku);
        System.out.println("\tstok pensil    : "+stokPensil);
        System.out.println("\tstok penggaris : "+stokPenggaris);
        tampil.tampilFooter();
    }    
}
