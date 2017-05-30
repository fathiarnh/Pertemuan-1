
package enkapsulasi.atk;

import java.util.Scanner;


public class EnkapsulasiATK {

    public static void main(String[] args) {
        int jbuku, jpensil, jpenggaris;
        int tbuku, tpensil, tpenggaris, tbarang;
        double diskon, tbayar;
        
        enkapsulasiHarga list = new enkapsulasiHarga();
        hitungATK hitung = new hitungATK();
        classTampilan tampil = new classTampilan();
        Scanner input = new Scanner(System.in);
                
        BiodataGeneric<String> nama = new BiodataGeneric<String>();
        //DI SAYA EEROR JIKA : ... = new BiodataGeneric<>();
        BiodataGeneric<String> alamat = new BiodataGeneric<String>();
        BiodataGeneric<Integer> umur = new BiodataGeneric<Integer>();
        
        tampil.tampilBarang();
        tampil.tampilDiskon();
                
             
        System.out.print("Masukan nama Pembeli     : ");
        nama.setIdentitas(input.nextLine());        
        
        System.out.print("Masukan alamat Pembeli   : ");
        alamat.setIdentitas(input.nextLine());
        
        System.out.print("Masukan umur Pembeli     : ");
        umur.setIdentitas(input.nextInt());
        
        System.out.println("--------------------------------------");
        
        System.out.print("Masukan Jumlah Buku      : ");
        jbuku = input.nextInt();
        
        System.out.print("Masukan Jumlah Pensil    : ");
        jpensil = input.nextInt();
        
        System.out.print("Masukan Jumlah Penggaris : ");
        jpenggaris = input.nextInt();
        
        System.out.println("--------------------------------------");
        
        tbuku = hitung.hitungBarang(jbuku, list.getBuku());
        tpensil = hitung.hitungBarang(jpensil, list.getPensil());
        tpenggaris = hitung.hitungBarang(jpenggaris, list.getPenggaris());
        
        tbarang = hitung.hitungTotal(tbuku, tpensil, tpenggaris);
        
        System.out.println("Nama Pembeli          : "+nama.getIdentitas());
        System.out.println("Alamat Pembeli        : "+alamat.getIdentitas());
        System.out.println("Umur Pembeli          : "+umur.getIdentitas()+" tahun");
        System.out.println("--------------------------------------");
        System.out.println("Total Harga Buku      : Rp."+tbuku);
        System.out.println("Total Harga Pensil    : Rp."+tpensil);
        System.out.println("Total Harga Penggaris : Rp."+tpenggaris);
        System.out.println("\nJumlah Pembayaran     : Rp."+tbarang);
        
        if(tbarang >= 25000){
            diskon = hitung.hitungDiskon(tbarang);
        }else{
            diskon = hitung.hitungDiskon(0);
        }
        
        tbayar = hitung.hitungTotalAkhir(tbarang, diskon);
        
        System.out.println("Diskon                : Rp."+diskon);
        System.out.println("Total Bayar           : Rp."+tbayar);
        System.out.println("--------------------------------------");
        int stokBuku = list.hitungStokBarang(list.stokBuku(), jbuku );
        int stokPensil = list.hitungStokBarang(list.stokPensil(), jpensil );
        int stokPenggaris = list.hitungStokBarang(list.stokPenggaris(), jpenggaris );
        System.out.println("stok buku      : "+stokBuku);
        System.out.println("stok pensil    : "+stokPensil);
        System.out.println("stok penggaris : "+stokPenggaris);
        tampil.tampilFooter();
    }
    
}
