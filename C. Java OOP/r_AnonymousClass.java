// Anonymous class means it has no name...
// It is made and used at the same time...
// We often use anonymous class to override methods of an existing class or interface, without writing a separate file...




// Anonymous Classes..

/* 
class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

public class r_AnonymousClass{
    public static void main(String[] args) {
        Animal myAnimal = new Animal(){

        public void makeSound() {
            System.out.println("Woof Woof");
        }
    };

    myAnimal.makeSound();
  }
}

*/




// Anonymous Class from an Interface...
interface Greeting {
    void sayHello();
}

public class r_AnonymousClass{
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            public void sayHello(){
                System.out.println("Hello, world !");
            }
        };

        greet.sayHello();
    }
}