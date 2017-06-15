package enkapsulasi.atk;

public class Gen1 <T> {
    private T type;
    public static <T> void showAddress(T t){
        System.out.println(t);
    }
    public static <T> void showNIP(T a){
        System.out.println(a);
    }
    
    public T getType() {
        return type;
    }
    public void setType(T type) {
        this.type = type;
    }
    
    public T umur(T x){
        return x;        
    }

}
