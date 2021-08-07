package objects_features.checking_null_and_returning_non_null_default_references_p43;

import java.util.Objects;

public class Checking_Null_Reference_And_Returning_Non_Null_Default_References {
//Old Approach
        private final String name;
        private final String color;
        public Checking_Null_Reference_And_Returning_Non_Null_Default_References(String name, String color) {

            if (name == null) {
                this.name = "No name";
            } else {
                this.name = name;
            }

            if (color == null) {
                this.color = new String("No color");
            } else {
                this.color = color;
            }
        }

//starting with JDK 9, the preceding code can be simplified via two methods from the Objects class.
// These methods are requireNonNullElse() and requireNonNullElseGet(). Both of them take two arguments—the reference to
// check for nullity, and the non-null default reference to return in case the checked reference is null
    public class House {
//New Approach
        private final String name;
        private final String color;

        public House(String name, String color) {

            this.name = Objects.requireNonNullElse(name, "No name");
            this.color = Objects.requireNonNullElseGet(color,
                    () -> new String("No color"));

        }
    }

    }
