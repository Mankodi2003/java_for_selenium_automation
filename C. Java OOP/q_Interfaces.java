// Another way to achieve Abstraction...
// An interfaces are a completely "Abstract class" that is used to group related methods with empty bodies...
// Interface methods don't have body in themselves...


//Simple Interface Example...


/* 

interface Animal{
    public void animalSound();
    public void run();
}

*/




// To accesss the interface methods, the interface must be "Implemented" by another class with the "implements" keyword.
// The body of the interface method is provided by the "Implement" class.
// Also in this, we cannot make objects...
// Interfaces never comes with constructoe, we can't...


interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("The Pig says : wee wee");
    }

    public void sleep(){
        System.out.println("Zzz");
    }
}

class q_Interfaces{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}