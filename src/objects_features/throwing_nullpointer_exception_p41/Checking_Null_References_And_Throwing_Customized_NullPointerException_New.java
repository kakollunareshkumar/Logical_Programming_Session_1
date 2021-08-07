package objects_features.throwing_nullpointer_exception_p41;
//New Approach
import java.util.Objects;

public class Checking_Null_References_And_Throwing_Customized_NullPointerException_New {
    private final String name;
    private final String color;

    public Checking_Null_References_And_Throwing_Customized_NullPointerException_New(String name, String color) {

        this.name = Objects.requireNonNull(name, " name cannot be null");
        this.color = Objects.requireNonNull(color, " color cannot be null");
    }

    public void assignDriver(String license, String location) {
// if the specified reference is null, then Objects.requireNonNull() will throw a NullPointerException with the message provided.
// Otherwise, it returns the checked reference.
        Objects.requireNonNull(license, "License cannot be null");
        Objects.requireNonNull(location, "Location cannot be null");
    }
    public static void main(String[] args) {
        Checking_Null_References_And_Throwing_Customized_NullPointerException_New c = new Checking_Null_References_And_Throwing_Customized_NullPointerException_New(null,"Red");
        System.out.println(c);

    }
}

