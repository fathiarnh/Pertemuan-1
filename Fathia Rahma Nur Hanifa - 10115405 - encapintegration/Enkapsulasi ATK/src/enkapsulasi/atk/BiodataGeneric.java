package enkapsulasi.atk;


public class BiodataGeneric<T> {
    private T identitas;

    public T getIdentitas() {
        return identitas;
    }

    public void setIdentitas(T identitas) {
        this.identitas = identitas;
    }  
}
