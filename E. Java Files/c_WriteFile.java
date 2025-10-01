// FileWriter() class with write() method is used to write in the file...
// wgen we are done, we should close the writer with the close() method.


/*

import java.io.FileWriter;
import java.io.IOException;

public class c_WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("c.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successful wrote to the file.");
        } catch(IOException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
}

*/


// we can use try-with-resources to not to write close().




// Append to a File.

import java.io.FileWriter;
import java.io.IOException;

public class c_WriteFile {
    public static void main(String[] args) {
        try(FileWriter myWriter = new FileWriter("c.txt", true)){
            myWriter.write("\nAppended text!");
            System.out.println("Successfully appended to the file.");
        } catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}

// FileWriter  =>  easiest choice for basic text.
// BufferedWriter  =>  better for large text files, because it is faster and supports handy features.
// FileOutputStream  =>  best for binary data