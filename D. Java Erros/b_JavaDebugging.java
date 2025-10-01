// Debug means how to find and fix the error...

/*


=> it includes... 
1) Reading Error Messages
2) Tracing variable values step by step
3) Testing small pieces of code independently


*/

// Add print statements before and after key lines of code to find out where things go wrong...
public class b_JavaDebugging {
    public static void main(String[] args) {
        
    int x = 10;
    int y = 0;

    System.out.println("Before Division");   // Debug output...

    int result = x / y;    // Crashes...

    System.out.println("Result: " + result);

    }
}





// Debugging with IDEs...

/*

modern IDEs like Intellij Idea, Eclipse and NetBeans come with built-in debugging tool.

1) Set Breakthrough to pause the program at specific lines.
2) Step through code line by line.
3) Inspect variable values in real manner.



*/