// we can create file with the createNewFile().
// This method returns True or False.
// It is necessary to wrap this method in try..catch to check whether it is created or not.


import java.io.File;
import java.io.IOException;
public class b_CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("b.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created: " + myObj.getName());
            } else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace(); // prints error details...
        }
    }
}


// we can create a file in a specific folder...
// File myObj = new File("C:\\Users\\MyName\filename.txt");