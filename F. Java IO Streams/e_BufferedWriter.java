// faster reading and writing than scanner and Fileweriter...
//For bigger Text Files.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class e_BufferedWriter {
      public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))){
            
            bw.write("First Line");
            bw.newLine();
            bw.write("Second Line");
            System.out.println("Successfully Wrote to the file.");

        } catch(IOException e){
            System.out.println("Error writing file.");
        }
    }
}
