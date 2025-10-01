// Algorithms are used to solve problems by sorting, searching, and manipulating data structures.
// They provide efficient ways to handle data and perform operations on it.
// In Java, many useful algorithms are already built into the Java Collections Framework.
// For example, sorting a list of numbers or searching for an element in a collection.
// You can use these built-in algorithms to make your code more efficient and easier to read.







// Searching Algorithms: These algorithms are used to find a specific element in a data structure. Common searching algorithms include linear search and binary search.

/*

import java.util.*;
public class p_Algorithms {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names); // Sorts the list in alphabetical order
        System.out.println(names); // Output: [Angie, Jenny, Kasper, Liam]
        int index = Collections.binarySearch(names, "Angie"); // Searches for "Kasper" in the sorted list
        System.out.println("Angie is at index: " + index); // Output: Angie is at index: 0
    }
}

*/










// sorting Algorithms: These algorithms are used to arrange elements in a specific order. Common sorting algorithms include bubble sort, selection sort, and quicksort.

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers); // Sorts the list in ascending order
        System.out.println(numbers); // Output: [1, 2, 5, 8]
        
        Collections.sort(numbers, Collections.reverseOrder()); // Sorts the list in descending order
        System.out.println(numbers); // Output: [8, 5, 2, 1]
    }
}

*/









/*

=> Other Useful Algorithms in Java Collections Framework:

1. Collections.max(): This method returns the maximum element in a collection.
2. Collections.min(): This method returns the minimum element in a collection.
3. Collections.shuffle(): This method randomly shuffles the elements in a list.
4. Collections.reverse(): This method reverses the order of elements in a list.
5. Collections.frequency(): This method counts the number of occurrences of a specific element in a collection.
6. Collections.copy(): This method copies elements from one list to another.
7. Collections.fill(): This method fills a list with a specified value.
8. Collections.replaceAll(): This method replaces all occurrences of a specified value in a list with another value.
9. Collections.rotate(): This method rotates the elements in a list by a specified distance.
10. Collections.synchronizedList(): This method returns a synchronized (thread-safe) list backed by the specified list.

*/












// 1. 2. Collections.max() and Collections.min()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        int max = Collections.max(numbers); // Finds the maximum element in the list
        int min = Collections.min(numbers); // Finds the minimum element in the list

        System.out.println("Maximum: " + max); // Output: Maximum: 9
        System.out.println("Minimum: " + min); // Output: Minimum: 1
    }
}

*/







// 3. Collections.shuffle()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.shuffle(numbers); // Randomly shuffles the elements in the list
        System.out.println("Shuffled List: " + numbers); // Output: Shuffled List: [3, 7, 1, 9, 5] (example output)
    }
}

*/




//4. Collections.reverse()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.reverse(numbers); // Reverses the order of elements in the list
        System.out.println("Reversed List: " + numbers); // Output: Reversed List: [9, 3, 7, 1, 5]
    }
}

*/





// 5. Collections.frequency()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");
        names.add("Kasper");

        int frequency = Collections.frequency(names, "Kasper"); // Counts the occurrences of "Kasper" in the list
        System.out.println("Frequency of Kasper: " + frequency); // Output: Frequency of Kasper: 2
    }
}

*/






// 6. Collections.copy()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<String> source = new ArrayList<String>();
        source.add("Liam");
        source.add("Jenny");
        source.add("Kasper");
        source.add("Angie");

        ArrayList<String> destination = new ArrayList<String>(Arrays.asList(new String[source.size()]));
        Collections.copy(destination, source); // Copies elements from source to destination
        System.out.println("Destination List: " + destination); // Output: Destination List: [Liam, Jenny, Kasper, Angie]
    }
}

*/







// 7. Collections.fill()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.fill(names, "Unknown"); // Fills the list with "Unknown"
        System.out.println("Filled List: " + names); // Output: Filled List: [Unknown, Unknown, Unknown, Unknown]
    }
}

*/








// 8. Collections.replaceAll()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");
        names.add("Kasper");

        Collections.replaceAll(names, "Kasper", "Casper"); // Replaces all occurrences of "Kasper" with "Casper"
        System.out.println("Updated List: " + names); // Output: Updated List: [Liam, Jenny, Casper, Angie, Casper]
    }
} 

*/






// 9. Collections.rotate()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.rotate(numbers, 2); // Rotates the list by 2 positions to the right
        System.out.println("Rotated List: " + numbers); // Output: Rotated List: [3, 9, 5, 1, 7]
    }
}   

*/









// 10. Collections.synchronizedList()

/*

import java.util.*;
public class p_Algorithms_Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        List<String> synchronizedNames = Collections.synchronizedList(names); // Creates a synchronized (thread-safe) list
        System.out.println("Synchronized List: " + synchronizedNames); // Output: Synchronized List: [Liam, Jenny, Kasper, Angie]
    }
} 

*/