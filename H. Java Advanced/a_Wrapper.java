// Wrapper classes provide a way to use primitive data types (int, boolean, etc.) as object.


/*

Primitive          wrapper

byte                Byte
short               Short  
int                 Integer
long                Long
float               Float
double              Double
boolean             Boolean
char                Character

*/

// sometimes we must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (The list can store only store objects),


// use of wrapper class in ArrayList.

import java.util.ArrayList;

public class a_Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(3);
        myNumbers.add(81);
        myNumbers.add(64);
        System.out.println(myNumbers);
    }
}


// creating wrapper object.

/*

Integer myInt = 5;
Double myDouble = 5.99;
Character myChar = 'A';
System.out.println(myInt);
System.out.println(myDouble);
System.out.println(myChar);

*/







// since we are using objects, we can use different methods associated with it.

/*

intValue()
byteValue()
shortValue()
longValue()
floatValue()
doubleValue()
charValue()
booleanValue()

*/






// example of using methods in wrapper object..

/*

Integer myInt = 5;
Double myDouble = 5.99;
Character myChar = 'A';
System.out.println(myInt.intValue());
System.out.println(myDouble.doubleValue());
System.out.println(myChar.charValue());

*/






// Another useful methods...

/*

=> toString()  =  converts wrapper objects to String.



public class a_Wrapper{
    public static void main(String[] args){
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length);
    }
}


*/