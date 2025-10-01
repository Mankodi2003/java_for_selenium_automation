// Generics allow you to write classes, interfaces, and methods that work with different data types, without having to specify that exact type in advance.

// It makes your code more flexible, reusable, and type-safe.



// Example of generics...


class Box<T>{
    T value;

    void set(T value){
        this.value = value;
    }

    T get(){
        return value;
    }
}

public class b_Generics {
    public static void main(String[] args) {
        // For String Type.

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());


        
        // For Int Type.

        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("value: " + intBox.get());
    }
}


// when you create a Box<String>, T becomes String.
// when you create a Box<Integer>, T becomes Integer.







// Generic Method Example...

public class b_Generics2 {
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        String[] names = {"Jenny", "Liam"};

        Integer[] numbers = {1,2,3};


        printArray(names);
        printArray(numbers);
    }
}



// Bounded types...

// You can use the extends keyword to limit the types a generic class or method can acccess.
// For Example, you can require that the type must be a subclass of Number.

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average(){
        double sum = 0;
        for(T num : nums){
            sum += sum / num.doubleValue();
        }
        return sum / nums.length;
    }
}

class b_Generics3 {
    public static void main(String[] args){
        Integer[] intNums = {10,20,30,40};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("Integer average: " + intStats.average());


        Double[] doubleNums = {1.5,2.5.,3.5};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println("Double average: " + doubleStats.average());

    }
}