// Encapsulation is used to make sure that "sensitive" data is hidden from users.
// we must use class/variables/attributes as "private".
// provide public get and set methods to access and update the value of private variable...



// simplest example of encapsulation...
// public class j_Main_JavaEncapsulation {
//     private String name;


//     public String getName() {
//         return name;
//     }

//     public void setName(String newName) {
//         this.name = newName;
//     }

//     public static void main(String[] args) {
//         j_Main_JavaEncapsulation myObj = new j_Main_JavaEncapsulation();
//         myObj.name = "John";
//         System.out.println(myObj.name);         
//                       if we have accessed it in different class, then we had got an error , because name is private...

//     }
// }









// now use get and set method instead...
public class j_Main_JavaEncapsulation {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        j_Main_JavaEncapsulation myObj = new j_Main_JavaEncapsulation();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}