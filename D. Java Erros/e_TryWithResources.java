// we should close the resources after using it, because if we are not closing it, memory will be used for the infinite time...
// close() keyword is being used to close and unallocate resources...

/*

import java.io.FileOutputStream;
import java.io.IOException;

public class e_TryWithResources {
    public static void main(String[] args) {
        try{
            FileOutputStream output = new FileOutputStream("filename.txt");
            output.write("Hello".getBytes());
            output.close();
            System.out.println("Successfuly wrote to the file.");
        } catch (IOException e){
            System.out.println("Errror writing file");
        }
    }
}

*/




// now we will not close, but use try-with-resources...
// there's no need to useclose() while using try-with-resources...

import java.io.FileOutputStream;
import java.io.IOException;

public class e_TryWithResources {
    public static void main(String[] args) {
        try(FileOutputStream output = new FileOutputStream("filename.txt")){
            output.write("Hello".getBytes());
            System.out.println("Successfuly wrote to the file.");
        } catch (IOException e){
            System.out.println("Errror writing file");
        }
    }
}