public class fathiarnh extends cAbstrak{
    int nilai;
    char index;
    
    @Override
    protected void kuliah(String nama) {
        String kampus = "Universitas Komputer Indonesia Bandung";
        System.out.println("Nama saya \t: "+nama);
        System.out.println("Saya Kuliah di \t: "+kampus);
    }

    @Override
    protected void lulus() {
        nilai = 80;
        index = 'A';
        System.out.println("Saya lulus jika : ");
        System.out.println("\t\tNilai saya  : "+nilai);
        System.out.println("\t\tIndex Nilai : "+index);
    }

    @Override
    protected void tidakLulus() {
        nilai = 40;
        index = 'E';
        System.out.println("Saya tidak lulus jika : ");
        System.out.println("\t\tNilai saya  : "+nilai);
        System.out.println("\t\tIndex Nilai : "+index);
    }
    
}
