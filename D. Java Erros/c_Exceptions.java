// We can use try and catch to handle Error or Exception.
// Main code should be in try block and error message should be in catch block.



// 1. try - catch...

/*

public class c_Exceptions {
    public static void main(String[] args) {
        try{
            int[] myNumbers = {1 , 2 , 3};
            System.out.println(myNumbers[10]);
        } catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

*/


// 2. Finally...
// also we can use finally to execute code after error.

/*

public class c_Exceptions {
    public static void main(String[] args) {
        try{
            int[] myNumbers = {1 , 2 , 3};
            System.out.println(myNumbers[10]);
        } catch(Exception e) {
            System.out.println("Something went wrong");
        } finally{
            System.out.println("The 'try catch' is finished.");
        }
    }
}

*/



// 3. Throw keyword...
// Throw keyword let us make our custom error...

/*

public class c_Exceptions {

    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access Denied - You must be at least 18 years old.");
        }
        else{
            System.out.println("Access Granted - You are old enough !");
        }
    }
    public static void main(String[] args) {
        checkAge(7);
    }
}

*/



// 4. Errors and Excepion Types...

/*

ArithmeticError  =>  Occurs when a numeric calculation goes wrong.

ArrayIndexOutOfBoundException  =>  Occurs when trying to access an index number that does not exist in an Array.

ClassNotFoundException  =>  Occurs when trying to access class that does not exist.

FileNotFoundException  =>  Occurs when a file cannot be accessed

InputMismatchException	=>  Occurs when entering wrong input (e.g. text in a numerical input)

IOException  =>  Occurs when an input or output operation is failed or interrupted.

NullPointerException  =>  Occurs when accessing a null object.

NumberFormatException  =>  Occurs when trying to convert a string to a numeric type,but the string does not have an appropriate format.

StringIndexOutOfBoundException  =>  Occurs when trying to access an index number that does not exist in a String.

*/