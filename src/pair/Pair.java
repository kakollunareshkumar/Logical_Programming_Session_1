package pair;

public class Pair<T,U> {

    private T t;
    private U u;

    public  Pair()
    {

    }

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public Pair<Double,String> returnPair(){

        return new Pair<Double, String>(10.0, "harsha");
    }
}
