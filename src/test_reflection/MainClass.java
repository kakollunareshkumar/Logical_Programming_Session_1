package test_reflection;


import java.lang.Class;
import java.lang.reflect.*;

public class MainClass {
    public static void main(String[] args) {
        try {
            // create an object of Cat
            Cat c1 = new Cat("Oliver", "white");

            // create an object of Class using getClass() method present in Object class
            Class obj = c1.getClass();
            System.out.println("Simple name of class "+c1.getClass().getSimpleName());

         //   System.out.println(obj instanceof Cat);

            // get name of the class using getName() method by calling getName() method present in Class.java
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Cat
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());

            // convert the access modifier to string
            String mod1 = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod1);
            System.out.println(" ");

            //Get package name of a  class
            Package pack = obj.getClass().getPackage();
            String packageName = pack.getName();
            System.out.println("Package Name = " + packageName);
            System.out.println(" ");

            // get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor c : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors and convert it into string form
                int cmodifier = c.getModifiers();
                String cmod = Modifier.toString(modifier);
                System.out.println("Modifier: " + cmod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }

            // using object of Class to get all the declared methods of Cat
            Method[] methods = obj.getDeclaredMethods();

            // create an object of the Method class
            for (Method m : methods) {

                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int mmodifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(mmodifier));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }

            Field[] fields = obj.getDeclaredFields();

            for(Field f: fields)
            {
                System.out.println(f.getName());
                f.setAccessible(true);

                // get the access modifier of methods
                int fmodifier = f.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(fmodifier));

                // get the return types of method
                System.out.println("Return Types: " + f.getType());
                System.out.println(" ");
            }

            Field fcatName = c1.getClass().getDeclaredField("catName");
            fcatName.setAccessible(true);
            fcatName.set(c1,"Leo");

            String modifiedCatName = (String) fcatName.get(c1);
            System.out.println("Modified Cat Name "+modifiedCatName);

//            Field factName = obj.getClass().getDeclaredField("catName");
//            factName.setAccessible(true);
//            factName.set(c1,"hello");

//            String mCatName = (String) fcatName.get(c1);
//            System.out.println("Modified Cat Name "+modifiedCatName);

            Method m = obj.getMethod("display");
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.name()+" "+annotation.weight());

            //Invoking methods using reflections
            
            Method method = obj.getDeclaredMethod("setParam", int.class);
            method.invoke(c1,15);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
