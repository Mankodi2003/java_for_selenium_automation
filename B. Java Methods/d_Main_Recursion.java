// code to do sum...

// public class d_Main_Recursion {
//     public static int sum(int k) {
//         if(k > 0){
//             return k + sum(k - 1);
//         } else {
//             return 0;
//         }
//     }

//     public static void main(String[] args) {
//         int result = sum(10);
//         System.out.println(" " + result);
//     }
// }






// find sum of one start to end numbers...

// public class d_Main_Recursion {
//     public static int sum(int start , int end) {
//         if(end > start) {
//             return end + sum(start , end - 1);
//         } else {
//             return end;
//         }
//     }

//     public static void main(String[] args) {
//        int result = sum(5 , 10);
//        System.out.println(result);
//     }
// }





// coundown...

// public class d_Main_Recursion{
//     static void coundown(int n) {
//         if(n > 0) {
//             System.out.println(n + " ");
//             coundown(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         coundown(5);
//     }
// }






// Factorial...

public class d_Main_Recursion{
    static int factorial(int n) {
        if(n > 1) {
            return n * factorial(n - 1);
        } else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}