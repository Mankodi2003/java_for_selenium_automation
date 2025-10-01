// same method different implementation...



// compile time polymorphism (overloading) (static)


// public class m_Polymorphism {
//     public int add(int a , int b) {
//         return a + b;
//     }

//     public double add(double a , double b){
//         return a + b;
//     }

//     public static void main(String[] args) {
//         m_Polymorphism calc = new m_Polymorphism();

//         System.out.println(calc.add(5 , 10));
//         System.out.println(calc.add(5.457 , 10.654));

//     }
// }









// runtime polymorphism (overriding) (dynamic)
class Main {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Main {
    @Override
    public void sound() {
        System.out.println("Bow Wow");
    }
}

public class m_Polymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Output: Bow Wow
    }
}
