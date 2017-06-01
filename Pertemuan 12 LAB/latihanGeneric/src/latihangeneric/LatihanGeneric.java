
package latihangeneric;

public class LatihanGeneric {

    
    public static void main(String[] args) {
        Mahasiswa<String> genNama = new Mahasiswa<>();
        MhsKonkrit kNama = new MhsKonkrit();
        kNama.setNama("Fathia Rahma");
        genNama.setNama(kNama.getNama());
        System.out.println(genNama.getNama());        
    } 
}
