// A TreeMap is a collection that stores key/value pairs in sorted order by key.
// Unlike HashMap, which does not maintain order, TreeMap keeps its keys sorted.

import java.util.TreeMap;

public class m_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Australia", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);


        // Access an Item.
        capitalCities.get("England");


        // Remove an Item.
        capitalCities.remove("England");


        // HashMap Size.
        capitalCities.size();
    }
}





// HashMap vs. TreeMap :-

/*

HashMap :- No guaranteed order.
TreeMap :- Sorted by Keys.


HashMap :- Allow one null key.
TreeMap :- Does not allow null keys.


HashMap :- Faster Performance (no sorting).
TreeMap :- Slower Performance (Maintains sorted order).

*/