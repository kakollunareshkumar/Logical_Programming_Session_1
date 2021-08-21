package pair;

public class PairMain {
    public static void main(String[] args) {

        Pair<Integer,String> p = new Pair<Integer,String>(2,"naresh");
        String name = p.getU();
        System.out.println("name of person "+name);

        Pair<Double, String> ds = p.returnPair();

    }
}
