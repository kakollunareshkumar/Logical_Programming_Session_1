package conversions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Other_Primitive_To_String {
    public static void main(String[] args) {
        //convert integer to string
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
        //convert integer to string
        int i1=200;
        String s1=Integer.toString(i1);
        System.out.println(i1+100);//300 because + is binary plus operator
        System.out.println(s1+100);//200100 because + is string concatenation operator
        //convert integer to string

        float i2=200f;
        String s2=String.format("%.2f",i2);
        System.out.println(s2);

        //convert date to string
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
        //convert string to boolean
        String s5="true";
        String s6="TRue";
        String s7="ok";
        Boolean b1=Boolean.valueOf(s5);
        Boolean b2=Boolean.valueOf(s6);
        Boolean b3=Boolean.valueOf(s7);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
