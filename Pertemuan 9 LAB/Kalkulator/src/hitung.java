
public class hitung extends Calculator{
    
    
    @Override
    protected double hasilTambah(double x, double y) {
        return (x+y);        
    }

    @Override
    protected double hasilKurang(double x, double y) {
        return (x-y);    
    }

    @Override
    protected double hasilKali(double x, double y) {
        return (x*y);        
    }

    @Override
    protected double hasilBagi(double x, double y) {
        return (x/y);
    }
}
