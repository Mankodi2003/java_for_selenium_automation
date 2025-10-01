// Scanner class to read the contents...


/*

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d_ReadFile {
    public static void main(String[] args) {
        File myObj = new File("c.txt");

        try(Scanner myReader = new Scanner(myObj)){
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}

*/



// get file informtion...

import java.io.File;

public class d_ReadFile {
    public static void main(String[] args) {
        File myObj = new File("c.txt");

        if(myObj.exists()) {
            System.out.println("File Name: " + myObj.getName());
            System.out.println("Absolute Path: " + myObj.getAbsolutePath());
            System.out.println("Writable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}


// Scanner  =>  best for simple text and when you want to parse numbers or words easily.
// BufferedReader  =>  best for large text files, because it is faster and reads line by line.
// FileInputStream  =>  best for binary data or when you need full control of raw bytes.
