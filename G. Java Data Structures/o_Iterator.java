// An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
// "Iterator" is called as it "iterates" to run loop.


import java.util.ArrayList;
import java.util.Iterator;

public class o_Iterator {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        

        // Get The Iterator.
        Iterator<String> it = cars.iterator(); 

        // Iterator for whole loop.
        Iterator<String> it1 = cars.iterator();


        // print the first item in the list.
        System.out.println(it.next()); // prints Volvo
        System.out.println(it.next()); // prints BMW
        System.out.println(it.next()); // prints Ford
        System.out.println(it.next()); // prints BMW
        System.out.println(it.next()); // prints Mazda

        // Loop Through the items of the list.
        while(it1.hasNext()){
            System.out.println(it1.next());
        } 

        // Remove items from the list.
        while(it1.hasNext()){
            String car = it1.next();
            if(car == "BMW"){
                it1.remove();
            }
        }

    }
}