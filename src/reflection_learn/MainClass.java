package reflection_learn;


import java.lang.reflect.Field;

public class MainClass {
    public static void main(String[] args) {
        try {
            // create an object of Cat
            Cat c1 = new Cat("Oliver", "white");

            // create an object of Class using getClass() method present in Object class
            Class obj = c1.getClass();
            System.out.println("Simple name of class "+c1.getClass().getSimpleName());

            System.out.println(c1 instanceof Cat);
           // System.out.println(obj instanceof Cat);

            Field fcatName = c1.getClass().getDeclaredField("catName");
            fcatName.setAccessible(true);
            fcatName.set(c1,"Leo");

            String modifiedCatName = (String) fcatName.get(c1);
            System.out.println("Modified Cat Name "+modifiedCatName);

            Field factName = obj.getClass().getDeclaredField("catName");
            factName.setAccessible(true);
            factName.set(c1,"hello");

            String modifiedName = (String) fcatName.get(c1);
            System.out.println("Modified Cat Name "+modifiedName);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
