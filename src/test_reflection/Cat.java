package test_reflection;

public class Cat extends Animal {

   private   String catName;
    private  String catColor;

    // public constructor without parameter
    public Cat() {

    }

    // private constructor with a single parameter
    public Cat(String catName, String catColor) {
        this.catName = catName;
        this.catColor = catColor;

    }

    @MyAnnotation(name = "cat", weight = 100)
    public void display() {
        System.out.println("I am a Cat.");
    }


    private void makeSound() {
        System.out.println("Meow Meow");
    }
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public void setParam(int param)
    {
        System.out.println(" You have set parameters successfully ");
    }

}