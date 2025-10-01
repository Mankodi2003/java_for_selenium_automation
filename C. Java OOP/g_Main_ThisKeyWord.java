// public class g_Main_ThisKeyWord {
//     // this keyword is used to refer current object in a method or constructor...
//     // itt often used to avoid confusion when class attributes have the same name as method or constructor parameters...

//     int x;

//     // constructor...
//     public g_Main_ThisKeyWord(int x) {
//         this.x = x;
//     }

//     public static void main(String[] args) {
//         g_Main_ThisKeyWord myObj = new g_Main_ThisKeyWord(5);
//         System.out.println("Value of x = " + myObj.x);
//     }
// }




// we can also use this to call one constructoe from same class...
public class g_Main_ThisKeyWord{
    int modelYear;
    String modelName;

    public g_Main_ThisKeyWord(String modelName) {
        this(2020, modelName);
    }

    public g_Main_ThisKeyWord(int modelYear , String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }


    public static void main(String[] args) {
        g_Main_ThisKeyWord car1 = new g_Main_ThisKeyWord("Covette");
        g_Main_ThisKeyWord car2 = new g_Main_ThisKeyWord(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}