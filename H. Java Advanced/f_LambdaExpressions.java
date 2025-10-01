// A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.





// Syntax :-

/*

parameter -> expression
(parameter1, parameter2) -> expression

(parameter1, parameter2) -> {
    return result;
}

*/





// Using Lambda Expressions :-

import java.util.ArrayList;

public class f_LambdaExpressions {
    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach((n) -> { System.out.println(n); });
    }
}






// Lambdas in Variables :-

import java.util.ArrayList;
import java.util.function.Consumer;

public class f_LambdaExpressions2 {
    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Create a Consumer using a lambda expression
        Consumer<Integer> method = (n) -> { System.out.println(n); };

        // Use the Consumer to print each number
        numbers.forEach(method);
    }
}

// in above example, we created a Consumer variable named method, which is assigned a lambda expression that takes one parameter (n) and prints it. We then passed this Consumer to the forEach() method to print each number in the list.







// Lambdas as Method Parameters :-

interface StringFunction {
    String run(String str);
}

public class f_LambdaExpressions3 {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

// In the example above, we defined a functional interface named StringFunction with a single method run(). We then created two lambda expressions, exclaim and ask, that implement this interface. The printFormatted() method takes a string and a StringFunction as parameters, applies the function to the string, and prints the result.