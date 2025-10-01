// public class d_JavaAttributes {
//     public static void main(String[] args) {
//         int x = 5;
//         int y = 3;

//         // these x and y are attributes or we can say class attributes are variables within a class or we also can say it fields...
//     }
// }







// simple example of class and object...
// public class d_JavaAttributes {

//     int x = 5;
//     public static void main(String[] args) {
//         d_JavaAttributes myObj = new d_JavaAttributes();
//         System.out.println(myObj.x);   
//     }
// }






// modify attributes...
// public class d_JavaAttributes {

//     int x = 5;
//     public static void main(String[] args) {
//         d_JavaAttributes myObj = new d_JavaAttributes();
//         myObj.x = 40;
//         System.out.println(" " + myObj.x);   
//     }
// }






// usage of final...
// public class d_JavaAttributes {

//     final int x = 5; 
//     public static void main(String[] args) {
//         d_JavaAttributes myObj = new d_JavaAttributes();
//         // myObj.x = 40;       // we can't change it as declared as final...
//         System.out.println(" " + myObj.x);   
//     }
// }






// multiple objects...
// public class d_JavaAttributes {

//     int x = 5; 
//     public static void main(String[] args) {
//         d_JavaAttributes myObj1 = new d_JavaAttributes();
//         d_JavaAttributes myObj2 = new d_JavaAttributes();
//         myObj2.x = 25;
//         System.out.println(" " + myObj1.x);   
//         System.out.println(" " + myObj2.x);   
//     }
// }





// Real worls example...
public class d_JavaAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args) {
        d_JavaAttributes myObj = new d_JavaAttributes();
        System.out.println("Name : " + myObj.fname + " " + myObj.lname);
        System.out.println("Age : " + myObj.age);
    }
}