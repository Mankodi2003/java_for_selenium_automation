// Collections class is used to sort the ArrayList and LikedList.

import java.util.Collections;
import java.util.ArrayList;

public class f_ListSorting {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        // In Order.
        Collections.sort(cars);
        System.out.println(cars);


        // In Reverse Order.
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
    }
}
