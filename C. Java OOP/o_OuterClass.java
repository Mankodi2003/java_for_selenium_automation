// Simple meaning of inner class is => class in other class...

// class OuterClass {
//     int x = 10;

//     class InnerClass {
//         int y = 5;
//     }
// }

// class o_OuterClass{
//     public static void main(String[] args) {
//         OuterClass myOuter = new OuterClass();
//         OuterClass.InnerClass myInner = myOuter.new InnerClass();
//         System.out.println(myInner.y + myOuter.x);
//     }
// }






// Private Inner Class...
class OuterClass{
    int x = 10;

    private class InnerClass{
        int y = 5;
    }
}

class o_OuterClass{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        // OuterClass.InnerClass myInner = myOuter.new InnerClass();
        // System.out.println(myInner.y + myOuter.x);
    }
}
// Error because if inner class is made private, outerclass can not access innerclass.