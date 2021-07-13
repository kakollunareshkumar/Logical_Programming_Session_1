package duplicate_characters;

import java.util.ArrayList;

public class Dummy {
    public static void main(String[] args) {
        //Non Generic ArrayList
        //Collections can add only object   i.e collection is a group of objects
        ArrayList al = new ArrayList();
        al.add(1);   //Primitive --> Wrapper class    int -->Integer
        al.add("naresh");
        al.add('c');   //char-->Character
        al.add(true);  //boolean--->Boolean

        //Generic AL
        //Datatype  --- wrapper classes  not primitive types
      ArrayList<String> al2  = new ArrayList<>();
    }
}
