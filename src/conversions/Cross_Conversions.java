package conversions;

public class Cross_Conversions {
    public static void main(String[] args) {
        int i=200;
        long l=i;
        System.out.println(l);
        //convert integer to long
        int i1=100;
        Long l1= new Long(i);//first way
        Long l2=Long.valueOf(i);//second way
        System.out.println(l1);
        System.out.println(l2);
        //convert long to integer
        long l3=500;
        int i2=(int)l3;
        System.out.println(i2);
        //convert long to integer
        Long l4= new Long(10);
        int i3=l4.intValue();
        System.out.println(i3);

        //int to double
        int i4=200;
        double d=i;
        System.out.println(d);
        //int to double
        int i5=100;
        Double d1= new Double(i5);//first way
        Double d2=Double.valueOf(i5);//second way
        System.out.println(d1);
        System.out.println(d2);
        //double to int
        double d3=10.5;
        int i6=(int)d;
        System.out.println(i6);
        //double to int
        Double d4=new Double(10.5);
        int i7=d4.intValue();
        System.out.println(i7);
        //char  to int
        char c='a';
        char c2='1';
        int a=c;
        int b=c2;
        System.out.println(a);
        System.out.println(b);
        //char  to int
        char c1='1';
        int a1=Character.getNumericValue(c1);
        System.out.println(a1);
        //char  to int
        char c3='1';
        int a2=Integer.parseInt(String.valueOf(c3));
        System.out.println(a2);
    }
}
