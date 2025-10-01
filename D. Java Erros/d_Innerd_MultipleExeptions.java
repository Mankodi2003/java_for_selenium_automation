// 1. One try, Many catch...


/*
public class d_MultipleExeptions {
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[10]);
            int result = 10 / 0;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index doesn't exist");
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch(Exception e){
            System.out.println("Something Elsewent wrong");
        }
    }
}

*/



// 2. Order Matters(Bad Order Example)
// We should put specific exceptions first, general ones later.

public class d_Innerd_MultipleExeptions {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
        } catch (Exception e){
            System.out.println("General error.");
        } catch (ArithmeticException e){          // this is showing error because now we can't write specific reason.
            System.out.println("Divide by zero.");
        }
    }    
}