// Non access modifiers don't affect visibility, but it adds some other features
// 1. final
// 2. static
// 3. abstract




// 1. final => if you don't want the ability to  override existing attribute values, declare attribute as final...

// public class i_Main_JavaNonAbstractModifiers {
//     final int x = 10;
//     final double PI = 3.14;

//     public static void main(String[] args) {
//         i_Main_JavaNonAbstractModifiers myObj = new i_Main_JavaNonAbstractModifiers();
//         // myObj.x = 50;           can do this both because both are declared as final...
//         // myObj.PI = 25; 
//     }
// }








// 2. static => A static method means that it can be accessed without creating an object of the class, unlike public...

// public class i_Main_JavaNonAbstractModifiers {
//     static void myStaticMethod() {
//         System.out.println("Static methods can be called without creating object");
//     }

//     public void myPublicMethod() {
//         System.out.println("Public methods must be called by creating object");
//     }

//     public static void main(String[] args) {
//         myStaticMethod();

//         i_Main_JavaNonAbstractModifiers myObj = new i_Main_JavaNonAbstractModifiers();
//         myObj.myPublicMethod();
//     }
// }





// 3. Abstract => An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclasses...

abstract class i_Main_JavaNonAbstractModifiers {
    public String fname = "John";
    public int age = 24;
    public abstract void study();  // abstract method
}

class Student extends i_Main_JavaNonAbstractModifiers {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }

    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println(myObj.fname);
        System.out.println(myObj.age);
        System.out.println(myObj.graduationYear);
        myObj.study();  // also call the abstract method implementation
    }
}



// transient => attributes and methods are skipped when serializing the object containing them...
// synchronized => methods can only be accessed by one thread at a time...
// volatile => the value of an attribute is not cached thread-locally, and is always read from "main memory"...