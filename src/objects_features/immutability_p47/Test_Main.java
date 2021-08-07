package objects_features.immutability_p47;

import java.util.Date;

class TestMain
{
    public static void main(String[] args)
    {
        Immutable_Class im = Immutable_Class.createNewInstance(100,"test", new Date());
        System.out.println(im);
        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);
    }

    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
    }
}
/*
Immutable classes in JDK
Apart from your written classes, JDK itself has lots of immutable classes. Given is such a list of immutable classes in Java.

String
Wrapper classes such as Integer, Long, Double etc.
Immutable collection classes such as Collections.singletonMap() etc.
java.lang.StackTraceElement
Java enums (ideally they should be)
java.util.Locale
java.util.UUID
*/

//output
/*

100 - test - Sun Jul 25 17:52:04 IST 2021
100 - test - Sun Jul 25 17:52:04 IST 2021
 */