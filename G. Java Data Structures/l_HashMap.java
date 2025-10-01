// A HashMap stores items in key-value pairs, where each key maps to a specific values.
// Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.

// A HashMap can store many different combinations, such as :

/*

String keys and Integer values
String keys and String values

*/


import java.util.HashMap;

public class l_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
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


        // Loop through a HashMap.

        // use the keySeet() if you only want the keys, and use the values() method if you only want the values.

        for(String i  : capitalCities.keySet()){
            System.out.println(i);
        }
    }
}
