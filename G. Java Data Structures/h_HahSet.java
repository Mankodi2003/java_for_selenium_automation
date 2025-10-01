// A HashSet is a collection of elements where every element is unique.


import java.util.HashSet;

public class h_HahSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);


        // Contains or not...
        cars.contains("BMW");


        // Remove an Element...
        cars.remove("Volvo");


        // HashSet size...
        cars.size();
    }
}
