// public class c_Main_JavaScope {

//     // variables declared inside a method are available anywhere in the method
//     public static void main(String[] args) {
//         int x = 100;

//         System.out.println(x);
//     }
// }





// public class c_Main_JavaScope{
//     // whole code should inside "{}"

//     public static void main(String[] args) {
//         int x = 100;
//         System.out.println(x);
//     }
// }






// public class c_Main_JavaScope{
//     // if statement in loop is single then it is ok not to put "{}"

//     public static void main(String[] args) {
//         for(int i = 0 ; i  < 5 ; i++)
//             System.out.println(i);
//     }
// }






public class c_Main_JavaScope{
    // variable declared inside class but outside of function can be accessible by all methods...
    int x = 5;
    public static void main(String[] args) {
        c_Main_JavaScope myObj = new c_Main_JavaScope();
        System.out.println(myObj.x);
    }
}