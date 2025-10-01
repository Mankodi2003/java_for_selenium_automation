// Enum is a special class that represents a group of contants...
// To create an enum, enum keyword, and separte the constants with a comma...
// Note that they should be in uppercase letters...
// Enum is short for "enumaration", which means "Specifically listed".
// Enum can't be used to create objects and it can't extend other classes.



// Simple Enum Creation...

/* 

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class s_Enums{
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(" " + myVar);
    }
}

*/






// Enum in Swiitch case...

/*
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class s_Enums{
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar){

            case LOW :
                System.out.println("Low Level");
                break;

            case MEDIUM :
                System.out.println("Medium Level");
                break;

            case HIGH :
                System.out.println("High Level");
                break;
        }
    }
}

*/




// Loop Through An Enum...

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class s_Enums{
    public static void main(String[] args) {
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}