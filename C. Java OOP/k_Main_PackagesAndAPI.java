// package is used to group related classes.
// Think of folders in a file directory.
// 1. Built-in Packages   2. User-Defined Packages
// Java API is a library of prewritten classes, that are free to use.



// import package.name.Class;   => this will import only class speifued from specific package.
// import package.name.*;   => this will import all classes of specific package.




// Simplest Example of importing package...

// import java.util.Scanner;
// public class k_Main_PackagesAndAPI {
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Enter username: ");

//         String userName = myObj.nextLine();
//         System.out.println("Username is: " + userName);

//         myObj.close();
//     }
// }



// creating own package...
// package mypack; // this file shouuld be saved at java -> packages -> with .java extension.
class k_Main_PackagesAndAPI{
    public static void main(String[] args) {
        System.out.println("This is my package !");
    }
}