package conversions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class String_To_Other_primitive_Data_Types {
    public static void main(String[] args) throws ParseException {
        //Source Javatpoint.com
        String s="4000";
        //Converting String into int using Integer.parseInt()
        int i=Integer.parseInt(s);
        //Printing value of i
        System.out.println(i);
        System.out.println(s+100);
        //Converting String into long using Integer.parseLong()
        String st="9990449935";
        long l=Long.parseLong(st);
        System.out.println(l);
        //Converting String into float using Integer.parseFloat()
        String str="23.6";
        float f=Float.parseFloat(str);
        System.out.println(f);
        //Extract single character from string
        String ch="hello";
        char c=ch.charAt(0);//returns h
        System.out.println("1st character is: "+c);
        //convert string to  date
        String sDate1="31/12/1998";
        String sDate2 = "31-Dec-1998";
        String sDate3 = "12 31, 1998";
        String sDate4 = "Thu, Dec 31 1998";
        String sDate5 = "Thu, Dec 31 1998 23:37:50";
        String sDate6 = "31-Dec-1998 23:37:50";
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date1=formatter1.parse(sDate1);
        Date date2=formatter2.parse(sDate2);
        Date date3=formatter3.parse(sDate3);
        Date date4=formatter4.parse(sDate4);
        Date date5=formatter5.parse(sDate5);
        Date date6=formatter6.parse(sDate6);
        Date date7  = new Date();
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        System.out.println(sDate3+"\t"+date3);
        System.out.println(sDate4+"\t"+date4);
        System.out.println(sDate5+"\t"+date5);
        System.out.println(sDate6+"\t"+date6);
        System.out.println(sDate6+"\t"+date7);


        // String to boolean
        String s5="true";
        String s6="TRue";
        String s7="ok";
        boolean b1=Boolean.parseBoolean(s5);
        boolean b2=Boolean.parseBoolean(s6);
        boolean b3=Boolean.parseBoolean(s7);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
