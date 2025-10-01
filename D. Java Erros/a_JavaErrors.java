// Compile Time Error  =>  Detected by the compiler. Prevents code from running.
// Run Time Error  =>  Occurs while the program is running. Often cause Crashes.
// Logical Error  =>  Code runs but gives incorrect result. Hardest to find.

// 1. Missing Semicolon...

/*

public class a_JavaErrors {
    public static void main(String[] args){
        int x = 5
        System.out.println(x);
    }
}

*/



// 2. Undeclared Variables...

/* 

public class a_JavaErrors {
    public static void main(String[] args){
        System.out.println(x);
    }
}

*/


// 3. Mismatched Types...

/*

public class a_JavaErrors {
    public static void main(String[] args){
        int x = "Hello";
    }
}

*/


// 4. Common Runtime Errors...
// 1) Division by Zero...


/*

public class a_JavaErrors {
    public static void main(String[] args){
        int x = 10;
        int y = 0;
        
        int result = x / y;
        System.out.println(result);
    }
}

*/




// 2) Array Index Out Of Bound...


/*

public class a_JavaErrors {
    public static void main(String[] args){
        int[] numbers = {1,2,3};
        System.out.println(numbers[8]);
    }
}

*/



// 5. Logical Errors...


/*

public class a_JavaErrors {
    public static void main(String[] args){
        int x = 10;
        int y = 2;

        int sum = x - y;
        System.out.println("x + y = " + sum);
    }
}

*/






// Always use meaningful variable names...
// Read the error message carefully. What line does it mention?
// Check for missing semicolon or braces...
// Look for typos in variable or method names...