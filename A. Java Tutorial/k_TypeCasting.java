// Type casting means how to convert one data type in other data type...

// widening casting : byte -> short -> char -> int -> long -> float -> double...

// narrowing casting : double -> float -> long -> int -> char -> short -> byte...

public class k_TypeCasting {
    public static void main(String[] args) {

        // Widening Casting...
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);





        
        double myDoublee = 9.78d;
        int myInte = (int)myDoublee;

        System.out.println(myDoublee);
        System.out.println(myInte);





    //real world example...
    // Set the maximum possible score in the game to 500
    int maxScore = 500;

    // The actual score of the user
    int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to double to make sure that the division is accurate */
    double percentage = (double) userScore / maxScore * 100.0d;

    // Print the result
    System.out.println("User's percentage is " + percentage);
        
    }
}
