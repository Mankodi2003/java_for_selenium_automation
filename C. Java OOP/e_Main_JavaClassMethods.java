// simple method creation in the class...
// public class e_Main_JavaClassMethods {
    
//         static void myMethod() {
//             System.out.println("Hello World !");
//         }
    
// }




// calling method...
// public class e_Main_JavaClassMethods {
    
//         static void myMethod() {
//             System.out.println("Hello World !");
//         }

//         public static void main(String[] args) {
//             myMethod();
//         }
    
// }




// static vs public...
// when there is static keyword used we don't need to make an object, we can call method itself without object.
// but when we use public we have to make object and then call method using that made object.

// public class e_Main_JavaClassMethods {
    
//         static void myStaticMethod() {
//             System.out.println("Static method");
//         }

//         public void myPublicMethod() {
//             System.out.println("Public method");
//         }

//         public static void main(String[] args) {
//             myStaticMethod();

//             e_Main_JavaClassMethods myObj = new e_Main_JavaClassMethods();
//             myObj.myPublicMethod();
//         }
    
// }



// real world example...
// public class e_Main_JavaClassMethods {
//     public void fullThrottle() {
//         System.out.println("The car is going as fast as it can!");
//     }

//     public void speed(int maxSpeed) {
//         System.out.println("Max speed is: " + maxSpeed);
//     }
//         public static void main(String[] args) {
//             e_Main_JavaClassMethods myCar = new e_Main_JavaClassMethods();
//             myCar.fullThrottle();
//             myCar.speed(200);
//         }
    
// }



// same above example using teo classes...
public class e_Main_JavaClassMethods {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}

    class second {
        public static void main(String[] args) {
            e_Main_JavaClassMethods myCar = new e_Main_JavaClassMethods();
            myCar.fullThrottle();
            myCar.speed(200);
        }
    }