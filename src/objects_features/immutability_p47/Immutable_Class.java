package objects_features.immutability_p47;

import java.util.Date;

public final  class Immutable_Class {
    /*  Rules to be followed to make a class Immutable
1.Declare the class as final so it can’t be extended.
2.Make all fields private so that direct access is not allowed.
3.Don’t provide setter methods for variables.
4.Make all mutable fields final so that its value can be assigned only once.
5.Initialize all the fields via a constructor performing deep copy.
6.Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/

/*
*A blank final variable can be initialized inside instance-initializer block or inside constructor.
* If you have more than one constructor in your class then it must be initialized in all of them, otherwise compile time error
* will be thrown.*/

    /**
     * Integer class is immutable as it does not provide any setter to change its content
     * */
    private final Integer immutableField1;

    /**
     * String class is immutable as it also does not provide setter to change its content
     * */
    private final String immutableField2;

    /**
     * Date class is mutable as it provide setters to change various date/time parts
     * */
    private final Date mutableField;

    //Default private constructor will ensure no unplanned construction of class
    private Immutable_Class(Integer fld1, String fld2, Date date)
    {
        this.immutableField1 = fld1;
        this.immutableField2 = fld2;
        this.mutableField = new Date(date.getTime());
    }

    //Factory method to store object creation logic in single place
    public static Immutable_Class createNewInstance(Integer fld1, String fld2, Date date)
    {
        return new Immutable_Class(fld1, fld2, date);
    }

    //Provide no setter methods

    /**
     * Integer class is immutable so we can return the instance variable as it is
     * */
    public Integer getImmutableField1() {
        return immutableField1;
    }

    /**
     * String class is also immutable so we can return the instance variable as it is
     * */
    public String getImmutableField2() {
        return immutableField2;
    }

    /**
     * Date class is mutable so we need a little care here.
     * We should not return the reference of original instance variable.
     * Instead a new Date object, with content copied to it, should be returned.
     * */
    public Date getMutableField() {
        return new Date(mutableField.getTime());
    }

    @Override
    public String toString() {
        return immutableField1 +" - "+ immutableField2 +" - "+ mutableField;
    }
}


/*
* Immutable classes in JDK
Apart from your written classes, JDK itself has lots of immutable classes. Given is such a list of immutable classes in Java.

String
Wrapper classes such as Integer, Long, Double etc.
Immutable collection classes such as Collections.singletonMap() etc.
java.lang.StackTraceElement
Java enums (ideally they should be)
java.util.Locale
java.util.UUID
*
* */