// A LinkedHashSet is a collection that stores unique elements and remember the order they were added.
// Use LinkedHashSet when you want a set that does not allow duplicates and keeps the originall insertion order.


import java.util.LinkedHashSet;

public class j_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
         cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);


        // Contains or not...
        cars.contains("Mazda");


        // Remove an Element...
        cars.remove("Volvo");


        // HashSet size...
        cars.size();
    }
}



// HashSet vs. LinkedHashSet :-

/*

HashSet :- No guaranteed order.
LinkedHashSet :- Insertion order preserved.


HashSet :- Duplicates not allowed.
LinkedHashSet :- Duplicates not allowed.


HashSet :- Faster Performance (no sorting).
LinkedHashSet :- Slightly Slower Performance (due to order tracking).

*/