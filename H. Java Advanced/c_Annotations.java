// Annotation are special notes you add to your Java Code.
// They start with "@" symbol.
// They Don't change how your program runs, but they give extra information to the compiler or tools.


/*

=> Built-in Annotations :-

@Override => indicates that a method overrides a method in a superclass.
@Deprecated  =>  marks a method or class as outdated or discouraged from use.
@SuppressWarnings  =>  Tells the compiler to ignore certain Warnings.

*/


// 1. @Override Annotation.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {  // Correctly overrides the method from Animal class
        System.out.println("Dog barks");
    }
}
class c_Annotations{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks
    }
}







// 2. @Deprecated Annotation.

class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }
}
class NewClass {
    void newMethod() {
        System.out.println("This method is recommended");
    }
}
class c_Annotations2{
    public static void main(String[] args) {
        OldClass oldObj = new OldClass();
        oldObj.oldMethod();  // Warning: This method is deprecated

        NewClass newObj = new NewClass();
        newObj.newMethod();  // Output: This method is recommended
    }
}







// 3. @SuppressWarnings Annotation.

class WarningExample {
    @SuppressWarnings("unchecked")
    void unsafeMethod() {
        java.util.List list = new java.util.ArrayList(); // Raw type usage
        list.add("Hello");
        System.out.println(list);
    }
}
class c_Annotations3{
    public static void main(String[] args) {
        WarningExample example = new WarningExample();
        example.unsafeMethod();  // No warning about unchecked operation
    }
}

// In above SuppressWarning, generaly if we doesn't specify the type of ArryList, it generate unchecked warning, but here if we use @SuppressWarnings("unchecked"), it will suppress that warning.