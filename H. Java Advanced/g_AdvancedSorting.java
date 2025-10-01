// In the List Sorting Chapter, you learned how to sort lists alphabetically and numerically, but what if the list has objects in it?

// To sort objects you need to specify a rule that decides how object should be sorted. For example, if you have a list of cars yoy might want to sort them by year, the rule could be that cars with an earlier year go first.

// The comparator and comparable interfaces allow you to specify what rule is used to sort objects.





// Comparators :-

/*

An object that implements the Comparator interface can be used to sort a collection of objects. The Comparator interface has a method called compare() that takes two objects as parameters and returns an integer value:

public int compare(Object obj1, Object obj2)
- A negative integer if obj1 should come before obj2
- A positive integer if obj1 should come after obj2
- Zero if obj1 and obj2 are equal

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class Car{
    public String brand;
    public String model;
    public int year;


    public Car (String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }
}


class SortByYear implements Comparator{
    public int compare(Object obj1 , Object obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        // compare the year of both objects.
        if(a.year < b.year){
            return -1;
        }
        else if (a.year > b.year){
            return 1;
        }
        else{
            return 0;
        }
    }

}


public class g_AdvancedSorting {
    public static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Ford", "Mustang", 1969));
        myCars.add(new Car("Toyota", "Corolla", 2010));


        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);


        // Display the cars
        for(Car c : myCars){
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }


    }
}












// Special Sorting Rules :-

// Comparators can also be used to make special sorting rules for strings and numbers. In this example we use a comparator to list all of the even numbers before the odd ones:




/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator {
  public int compare(Object obj1, Object obj2) {
    // Make sure the objects are integers
    Integer a = (Integer)obj1;
    Integer b = (Integer)obj2;
    
    // Check each number to see if it is even
    // A number is even if the remainder when dividing by 2 is 0
    boolean aIsEven = (a % 2) == 0;
    boolean bIsEven = (b % 2) == 0;
    
    if (aIsEven == bIsEven) {
    
      // If both numbers are even or both are odd then use normal sorting rules
      if (a < b) return -1;
      if (a > b) return 1;
      return 0;
      
    } else {
    
      // If a is even then it goes first, otherwise b goes first
      if (aIsEven) {
      	return -1;
      } else {
        return 1;
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Comparator myComparator = new SortEvenFirst();
    Collections.sort(myNumbers, myComparator);

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}

*/









//The Comparable Interface


/*
The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.

The compareTo() method takes an object as an argument and compares the comparable with the argument to decide which one should go first in a list.

Like the comparator, the compareTo() method returns a number which is:

Negative if the comparable should go first in a list.
Positive if the other object should go first in a list.
Zero if the order does not matter.
Many native Java classes implement the Comparable interface, such as String and Integer.

This is why strings and numbers do not need a comparator to be sorted.
*/



/*

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class which is comparable
class Car implements Comparable {
  public String brand;
  public String model;
  public int year;
  
  public Car(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
  
  // Decide how this object compares to other objects
  public int compareTo(Object obj) {
  	Car other = (Car)obj;
    if(year < other.year) return -1; // This object is smaller than the other one
    if(year > other.year) return 1;  // This object is larger than the other one
    return 0; // Both objects are the same
  }
}

public class Main { 
  public static void main(String[] args) { 
    // Create a list of cars
    ArrayList<Car> myCars = new ArrayList<Car>();    
    myCars.add(new Car("BMW", "X5", 1999));
    myCars.add(new Car("Honda", "Accord", 2006));
    myCars.add(new Car("Ford", "Mustang", 1970));

    // Sort the cars
    Collections.sort(myCars);

    // Display the cars
    for (Car c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}

*/





// Comparator vs. Comparable :-


/*

=>  A Comparator is an object with on emethod that is used to compare two different two different objects.
=>  A comparable is an object which can compare itself with other objects.



-->  It is easy to use the Comparable interface when possible, but the Comparator interface is more powerful because it allows you to sort any kind of object even if you cannot change its code.

*/