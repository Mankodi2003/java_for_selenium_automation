// simple constructor making...

// public class f_Main_JavaConstructor {
//     int x;

//     public f_Main_JavaConstructor() {
//         x = 5;
//     }

//     public static void main(String[] args) {
//         f_Main_JavaConstructor myObj = new f_Main_JavaConstructor();
//         System.out.println(myObj.x);
//     }
// }




// parameterized constructor...
// public class f_Main_JavaConstructor {
//     int x;

//     public f_Main_JavaConstructor(int y) {
//         x = y;
//     }

//     public static void main(String[] args) {
//         f_Main_JavaConstructor myObj = new f_Main_JavaConstructor(5);
//         System.out.println(" " + myObj.x);
//     }
// }





// real world example...
public class f_Main_JavaConstructor {
    int modelYear;
    String modelName;

    public f_Main_JavaConstructor(int year , String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        f_Main_JavaConstructor myCar = new f_Main_JavaConstructor(1969, "Mustang");
        System.out.println(" " + myCar.modelYear + " " + myCar.modelName);
    }
}