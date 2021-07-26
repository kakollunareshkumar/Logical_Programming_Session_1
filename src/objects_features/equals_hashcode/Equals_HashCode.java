package objects_features.equals_hashcode;

import java.util.*;

public class Equals_HashCode {
/*
Reflexivity: An object is equal to itself, which means that p1.equals(p1) must return true.
Symmetry: p1.equals(p2) must return the same result (true/false) as p2.equals(p1).
Transitive: If p1.equals(p2) and p2.equals(p3), then also p1.equals(p3).
Consistent: Two equal objects must remain equal all the time unless one of them is changed.
Null returns false: All objects must be unequal to null
 */
    public static void main(String[] args) {
        Player p1 = new Player(1, "Rafael Nadal");
        Player p2 = new Player(1, "Rafael Nadal");
    //p1==p2 this is reference comparision  p1.equals(p2)  this is string comparision or content comparision inside
        //object
        //p1==p2  false
        System.out.println(p1.equals(p2)); // true
        System.out.println("p1 hash code: " + p1.hashCode()); // 1809787067
        System.out.println("p2 hash code: " + p2.hashCode()); // 157627094
        Set<Player> set  = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
    }

}
//single-line comment KB short cut  ctrl+/
class Player {

    private int id;
    private String name;

    public Player(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
/*the first comparison, == compares the current object instance with the object that has been passed.
If the two objects have the same values, == will return true*/
        if (this == obj) {
            return true;
        }
   // In the second comparison, third comparision  == checks to see whether the passed object is null,
   // or if it’s typed as a different class. If it’s a different class then the objects are not equal.
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        //passed object is typecasted to player object
        final Player other = (Player) obj;

        if (this.id != other.id) {
            return false;
        }
        //checking objects are eauals or not by using built in function Objects.equals
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        return true;
    }
    //block level code KB shortcut ctrl+shift+/

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);

        return hash;
    }
}
/*
Summary of equals() and hashCode()
======================================
The equals() method compares if two objects are equal semantically, e.g. comparing the data members of the class.
The hashCode()method returns an integer value which is used to distribute elements in buckets of a hashtable-based collection.
And remember the contract between equals() and hashCode()methods:
When the equals() method is overridden, the hashCode() method must be overridden as well.

If two objects are equal, their hash codes must be equal as well.
If two objects are not equal, there’s no constraint on their hash codes (their hash codes can be equal or not).
If two objects have identical hash codes, there’s no constraint on their equality (they can be equal or not).
If two objects have different hash codes, they must not be equal.
*/