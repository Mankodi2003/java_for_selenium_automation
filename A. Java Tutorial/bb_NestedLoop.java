public class bb_NestedLoop {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 2 ; i++){
            System.out.println("Outer: " + i);
        

        for(int j = 1 ; j <=3 ; j++){
            System.out.println(" Inner: " + j);
        }
      }
    





    for(int i = 0 ; i <= 3 ; i++){
        for(int j = 1 ; j <= 3 ; j++){
            System.out.println(i * j + " ");
        }
        System.out.println();
    }
}
}
