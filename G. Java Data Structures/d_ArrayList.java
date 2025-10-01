// An ArrayList is like a resizable array.
// It is part of the java.utill package.


// 1) ArrayList :- It allows us to store element and access them by index.


import java.util.ArrayList;
import java.util.Collections;

public class d_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // we can add item on wanted index.
        cars.add(0, "Volkswagon");


        // Access specific indexed item.
        System.out.println(cars.get(2));


        // change the item.
        cars.set(0, "Toyota");


        // remove the item.
        cars.remove(0);


        // ArrayList size.
        cars.size();


        // Loop through an ArrayList.
        for(int i = 0 ; i < cars.size() ; i++){
            System.out.println(cars.get(i));
        }


        // print all cars.
        System.out.println(cars);


        // Sort the ArrayList.
        Collections.sort(cars);

        for(String i : cars) {
            System.out.println(i);
        }


    }
}