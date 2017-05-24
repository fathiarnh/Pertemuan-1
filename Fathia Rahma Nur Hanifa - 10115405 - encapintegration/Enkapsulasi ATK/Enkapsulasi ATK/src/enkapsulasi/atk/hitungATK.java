

package enkapsulasi.atk;

public class hitungATK extends abstrakATK{

    @Override
    protected int hitungBarang(int x, int y) {
        return x*y;
    }

    @Override
    protected int hitungTotal(int x, int y, int z) {
       return x+y+z;
    }

    @Override
    protected double hitungDiskon(int x) {
        return 0.1*x;
    }

    @Override
    protected double hitungTotalAkhir(int x, double y) {
        return x-y;
    } 
    
}
