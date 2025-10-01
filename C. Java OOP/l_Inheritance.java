// subclass = child
// superclass = parents



public class l_Inheritance {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut !");
    }
}


class Car extends l_Inheritance {
    private String modelName = "Mustang";
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}



// If we use final class then it can't be inharited...