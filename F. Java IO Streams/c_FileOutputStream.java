// We saw FileWriter for file to read file content, like that for binary data, we have to use FileOuputStream.




/*

import java.io.FileOutputStream;
import java.io.IOException;

public class c_FileOutputStream {
    public static void main(String[] args) {
        String text = "Hello, World!";

        try(FileOutputStream output = new FileOutputStream("c.txt")){
            output.write(text.getBytes());
            System.out.println("Successfully wrote to file.");
        } catch(IOException e){
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}

*/





// Real World Exampl Copying File...


/*

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class c_FileOutputStream {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("image.jpg"); 
            FileOutputStream output = new FileOutputStream("copy.jpg")){

                int i;
                while((i = input.read()) != -1){
                    output.write(i);
                }
                System.out.println("File copied Successfully!");
            } catch(IOException e){
                System.out.println("Error handling File");
            }
        
    }
}

*/



// Append to a file...

import java.io.FileOutputStream;
import java.io.IOException;

public class c_FileOutputStream {
    public static void main(String[] args) {
        String text = "\nAppend text!";

        try (FileOutputStream output = new FileOutputStream("filename.txt",true)){
            output.write(text.getBytes());
            System.out.println("Successfully append to file.");
        } catch(IOException e){
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}



// Scanner  =>  best for simple text and when you want to parse numbers or words easily.
// BufferedReader  =>  best for large text files, because it is faster and reads line by line.
// FileInputStream  =>  best for binary data(Images, Audio, PDFs) or when you need full control of raw byes.