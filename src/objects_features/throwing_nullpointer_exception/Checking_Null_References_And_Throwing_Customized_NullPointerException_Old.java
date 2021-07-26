package objects_features.throwing_nullpointer_exception;
//Old approach
public class Checking_Null_References_And_Throwing_Customized_NullPointerException_Old {
    private final String name;
    private final String color;

// final variables should be initialized either in constructor or instance intialize blocks
    public Checking_Null_References_And_Throwing_Customized_NullPointerException_Old(String name, String color) {


        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }

        if (color == null) {
            throw new NullPointerException(" color cannot be null");
        }
        this.name = name;
        this.color = color;

    }
    public void assignDriver(String license, String location) {

        if (license == null) {
            throw new NullPointerException("License cannot be null");
        }

        if (location == null) {
            throw new NullPointerException("Location cannot be null");
        }
    }

    public static void main(String[] args) {
        Checking_Null_References_And_Throwing_Customized_NullPointerException_Old c = new Checking_Null_References_And_Throwing_Customized_NullPointerException_Old("naresh","Red");
        System.out.println(c);

        }
    }

