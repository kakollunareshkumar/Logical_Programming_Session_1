package collections_problems.filter_collection_by_list_p79;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Collection_By_List {
    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Apollo", 3000));
        melons.add(new Melon("Jade Dew", 3500));
        melons.add(new Melon("Cantaloupe", 1500));
        melons.add(new Melon("Gac", 1600));
        melons.add(new Melon("Hami", 1400));
        List<String> melonsByType
                = Arrays.asList("Apollo", "Gac", "Crenshaw", "Hami");


        List<Melon> results = melons.stream()
                .filter(t -> melonsByType.contains(t.getType()))
                .collect(Collectors.toList());
        System.out.println(results);

    }
}
