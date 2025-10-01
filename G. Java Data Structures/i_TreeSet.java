// A TreeSet is a collection that stores unique elements in sorted order.
// Unlike HashSet, which has no order, TreeSeet keeps its elements sorted automatically.
// Elements will be soorted automatically.


import java.util.TreeSet;

public class i_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);


        // Contains or not...
        cars.contains("Ford");


        // Remove an Element...
        cars.remove("Volvo");


        // HashSet size...
        cars.size();
    }
}



// HashSet vs. TreeSet :-

/*

HashSet :- No guaranteed order.
TreeSet :- Sorted (natural order).


HashSet :- Duplicates not allowed.
TreeSet :- Duplicates not allowed.


HashSet :- Faster Performance (no sorting).
TreeSet :- Slower Performance (due to sorting).

*/