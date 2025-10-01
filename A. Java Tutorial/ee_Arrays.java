public class ee_Arrays {
    public static void main(String[] args){
        String cars[] = {"Volvo" , "BMW" , "Ford" , "Mazda"};
        int myNum[] = {10 , 20 , 30 , 40};


        String car[] = new String[4];
        int myNums[] = new int[4];

        System.out.println(myNum[1]);

        System.out.println(cars[3]);

        for(int i = 0 ; i < cars.length ; i++){
            System.out.println(cars[i]);
        }

        for(int i = 0 ; i < myNum.length ; i++){
            System.out.println(myNum[i]);
        }







        // Real life example...
        int ages[] = {20 , 22 , 18 , 35 , 48 , 26 , 87 , 70};
        float avg , sum = 0;

        int length = ages.length;

        for (int age : ages){
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);
    }
}
