// Thread allows a program to operate more efficiently by doing multiple things at the same time.
// Threads can be used to perform complicated tasks in the background without interrupting the main program.



// => Creating a Thread.

// There are two ways to create a thread in Java:
// 1. By extending the Thread class
// 2. By implementing the Runnable interface

//1. Extending the Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

//2. Implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running");
    }
}








// Running a Thread extends example.
public class e_Threads extends Thread {
    public static void main(String[] args) {
        e_Threads thread = new e_Threads();
        thread.start(); // Start the thread
        System.out.println("This code is running outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}







// Running a Thread implements example.
public class e_Threads2 implements Runnable {
    public static void main(String[] args) {
        e_Threads2 myRunnable = new e_Threads2();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread
        System.out.println("This code is running outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}








// Difference between Thread and Runnable :-


/*

1. Thread is a class, while Runnable is an interface.

2. To create a thread by extending the Thread class, you need to create a new class that extends the Thread class and override its run() method. To create a thread by implementing the Runnable interface, you need to create a new class that implements the Runnable interface and override its run() method.

3. A class can extend only one class (Thread), but it can implement multiple interfaces (Runnable).

4. When you extend the Thread class, you cannot extend any other class. When you implement the Runnable interface, you can still extend another class.

*/






// Difference between "extending" and "implementing" Thread :-


/*

The major difference between extending the Thread class and implementing the Runnable interface is that when you extend the Thread class, you cannot extend any other class, as Java does not support multiple inheritance. On the other hand, when you implement the Runnable interface, you can still extend another class.

*/






// Concurrency Problems :-

/*

When multiple threads access shared resources (like variables, files, etc.) simultaneously, it can lead to concurrency problems. For example, if two threads try to update the same variable at the same time, it can lead to inconsistent or incorrect results.
To avoid concurrency problems, Java provides synchronization mechanisms that allow you to control access to shared resources. The most common way to synchronize threads is by using the synchronized keyword.

*/



// Example of synchronized method :-

public class e_Threads3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args){
        e_Threads3 thread = new e_Threads3();
        thread.start();
        System.out.println("Amount: " + amount);
        amount++;
        System.out.println("Amount: " + amount);  // output: Amount: 2
    }
}




// using isAlive() method to prevent concurrency problems :-

public class e_Threads4 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        e_Threads4 thread = new e_Threads4();
        thread.start();
        
        while(thread.isAlive()) {
            // wait for the thread to finish
            System.out.println("Thread is still running...");
        }

        System.out.println("Amount: " + amount);
        amount++;
        System.out.println("Amount: " + amount);  // output: Amount: 1
    }

    public void run() {
        amount++; // output: Amount: 2
    }
}