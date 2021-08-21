package reflection_learn;

public class Cat  {

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

    public void displayAnimalType() {
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