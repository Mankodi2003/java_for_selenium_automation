public class w_LogicalOperators {
    public static void main(String[] args){
        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }






        int x = 200;
        int y = 33;
        int z = 500;

        if(x > y || x > z){
            System.out.println("At least one condition is true");
        }





        int d = 33;
        int e = 200;

        if(!(a > b)) {
            System.out.println("a is NOT greater than b");
        }





        // Real life example...

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

        if(isLoggedIn && (isAdmin || securityLevel <= 2)){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }


    }

}