package collections_problems.remove_all_elements_of_a_collection_matches_a_predicate_p77;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Remove_All_Elements_Of_A_Collection_Matches_Predicate {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));

/*Removing via Stream
Starting with JDK 8, we can create a Stream from a collection (Collection.stream()) and filter its
elements via filter(Predicate p). The filter will only retain those elements that satisfy the given
Predicate */

        List<Melon> filteredMelons = melons.stream()
                .filter(t -> t.getWeight() >= 3000)
                .collect(Collectors.toList());
        /*Collectors.partitioningBy()
Sometimes, we don't want to delete the elements that don't match our predicate. What we actually want is to separate elements based on our predicate. Well,
this is achievable via Collectors.partitioningBy(Predicate p).
Basically, Collectors.partitioningBy() will separate the elements into two lists. These two lists are added to a Map as values.
The two keys of this Map will be true and false:

  So, the true key is for retrieving the List that contains the elements that match the predicate,
   while the false key is for retrieving the List that contains the elements that didn't match the predicate
  */


        Map<Boolean, List<Melon>> separatedMelons = melons.stream()
                .collect(Collectors.partitioningBy(
                        (Melon t) -> t.getWeight() >= 3000));

        List<Melon> weightLessThan3000 = separatedMelons.get(false);
        List<Melon> weightGreaterThan3000 = separatedMelons.get(true);

        System.out.println(weightLessThan3000);
        System.out.println(weightGreaterThan3000);

/*
Removing via Collection.removeIf()

 */
        melons.removeIf(t -> t.getWeight() < 3000);

    }
}
