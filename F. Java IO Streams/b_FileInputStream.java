// We saw scanner for file to read file content, like that for binary data, we have to use FileInputStream.

/*

import java.io.FileInputStream;
import java.io.IOException;

public class b_FileInputStream {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("b.txt")) {
            int i;

            while((i = input.read()) != -1){
                System.out.println((char) i);
            }
        } catch(IOException e) {
            System.out.println("Error Reading File.");
        }
    }
}

*/





// Real Worlld example of copying a binary file.


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class b_FileInputStream {
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



// FileWriter  =>  best for simple text and when you want to parse numbers or words easily.
// BufferedWriter  =>  best for large text files, because it is faster and reads line by line.
// FileOutputStream  =>  best for binary data(Images, Audio, PDFs) or when you need full control of raw byes.