// public => The code is accessible for every classes.
// privare => The code is only accessible within the declared classes
// default => The code is only accessible in the same package. this is used when we don't specify a modifier.
// protected => The code is accessible in same package and subclasses.



// in this there is a private variable so if we are writing and calling function in other class, there will be an error because private only can be accessible in same class...

public class h_JavaModifiers {
    public String name = "John";
    private int age = 30;


    public static void main(String[] args) {
        h_JavaModifiers h = new h_JavaModifiers();
        System.out.println(h.name);
        System.out.println(h.age);
    }
}


