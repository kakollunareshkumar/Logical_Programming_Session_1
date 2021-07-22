package concatinate_string_n_times_p20;

public class Concatinate_String_N_Times_M3 {
    public static void main(String[] args)
    {
        String str = "Abc";

        String repeated = new String(new char[3]).replace("\0", str);

//        String r = new String(new char[3]);
//        System.out.println(r);


        System.out.println(repeated);
    }
}
