// super keyword is used to refer parent class instance variable and method
// super() is used to invoke parent class constructor
// super() should be the first statement in child class constructor
// the most common use of the "Super" keyword is to eeliminate the confusion between superclass and subclass that have methods with the same name


// Example of Accessing Parent Method...


// class Main {
//     public void animalSound(){
//         System.out.println("The animal makes a sound");
//     }
// }

// class Dog extends Main {
//     public void animalSound() {
//         super.animalSound();   // Calls parent (Animal) version
//         System.out.println("The dog says : bow wow");
//     }
// }

// class n_super {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.animalSound();
//     }
// }








// Access Prent Attributes...



// class Main{
//     String type = "Animal";
// }

// class Dog extends Main{
//     String type = "Dog";

//     public void printType(){
//         System.out.println(super.type);
//     }
// }

// public class n_Super{
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.printType();
//     }
// }





// Call Parent Constructor...
class Main{
    Main(){
        System.out.println("Animal is created");
    }
}

class Dog extends Main{
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}

class n_Super{
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}