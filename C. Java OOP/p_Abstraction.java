// Abstraction is the process of hiding certain details and showing only essential information to the user...
// Abstraction can be achieved with either abstract classes or interfaces...
// abstract keyword should be used...
// abstract classes are the classes of which we can't make object...
// abstract methods are the methods which only can be created inside abstract class...
//abstract methods don't have any body... so when we extend the abstract class, we have to override that method and have to write body in that overridden method...


// Syntax of abstract class and abstract method...

/* 

abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }

    public static void main(String[] args) {
        Animal myObj = new Animal();      // not possible and will give error...
    }
}

*/




// Real world Example...

abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }
}


class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
}

class p_Abstraction{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}