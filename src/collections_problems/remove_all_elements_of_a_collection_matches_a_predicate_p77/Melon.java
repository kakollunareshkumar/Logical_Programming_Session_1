package collections_problems.remove_all_elements_of_a_collection_matches_a_predicate_p77;

public class Melon {

    private final String type;
    private final int weight;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

// constructor, getters, equals(),
// hashCode(), toString() omitted for brevity

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

    }
