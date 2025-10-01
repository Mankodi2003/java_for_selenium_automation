public class ff_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = {
            {1 , 4 , 2},
            {3 , 6 , 8}
        };

        for(int i = 0 ; i < myNumbers.length ; i++){
            for(int j = 0 ; j < myNumbers[i].length ; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
