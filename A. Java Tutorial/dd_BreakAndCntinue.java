public class dd_BreakAndCntinue {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++) {
            if (i == 4){
                break;
            }
            System.out.println(i);
        }





        for(int i = 0 ; i < 10 ; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }






        for(int i = 0 ; i < 6 ; i++){
            if(i == 2){
                continue;
            }

            if(i == 4){
                break;
            }
            System.out.println(i);
        }






        int[] numbers = {3  , -1 , 7 , 0 , 9};

        for(int n : numbers) {
            if(n < 0){
                continue;
            }

            if(n == 0){
                break;
            }
            System.out.println(n);
        }
    }
}