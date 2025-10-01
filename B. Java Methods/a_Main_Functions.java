// public class Main {
//         static void myMethod() {
//             System.out.println("I just got executed!");
//         }

//         public static void main(String[] args) {
//             myMethod();
//         }
// }





// public class Main{
//     static void myMethod(){
//         System.out.println("I just got executed !");
//     }

//     public static void main(String[] args){
//         myMethod();
//         myMethod();
//         myMethod();
//     }
// }




// public class Main{
//     static int myMethod(int x){
//         return 5 + x;
//     }

//     public static void main(String[] args) {
//         System.out.println(myMethod(3));
//     }
// }





// public class Main {
//     static int myMethod(int x , int y)  {
//         return x + y;
//     }

//     public static void main(String[] args) {
//         System.out.println(myMethod(5, 30));
//     }
// }




// public class Main {
//     static int myMethod(int x , int y) {
//         return x + y;
//     }

//     public static void main(String[] args) {
//         int z = (myMethod(5,3));
//         System.out.println(z);
//     }
// }





public class a_Main_Functions {
    static int doubleGame(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        for(int i = 0 ; i <= 5 ; i++){
            System.out.println(" Double of " + i + " is " + doubleGame(i));
        }
    }
}