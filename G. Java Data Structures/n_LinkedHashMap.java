// A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
// Use LinkedHashMap when you want predictable iteration order.


import java.util.LinkedHashMap;

public class n_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
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


        // Loop through a LinkedHashMap.
        for(String key : capitalCities.keySet()){
            System.out.println(key);
        }


        // Loop through a LinkedHashMap.
        for(String key : capitalCities.values()){
            System.out.println(key);
        }
    }
}





// HashMap vs. LinkedHashMap :-

/*

HashMap :- No guaranteed order.
LinkedHashMap :- insertion order preserved.


HashMap :- Faster for random access.
LinkedHashMap :- Slightly slower due to ordering.


HashMap :- Keys must be unique.
LinkedHashMap :- Keys must be unique.

*/