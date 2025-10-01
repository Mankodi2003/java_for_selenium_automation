// The Linked is Linked Nodes with chain but similar in function to the ArrayList.
// ArrayList is used to store and retrieval of data, where LinkedList is used to Manipulate Data.


/*

=> LinkedList Methods...

1) addFirst()
2) addLast()
3) removeFirst()
4) removeLast()
5) getFirst()
6) getLast()

*/ 

import java.util.LinkedList;
import java.util.List;

public class e_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        // we can also use var.
        var car = new LinkedList<String>();

        //Also we can use List Interface.
        List<String> carrs = new LinkedList<String>();
    }
}
