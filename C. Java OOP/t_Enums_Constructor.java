// enum can also have a constructor just like a class.
// The constructor is called automatically when the constants are created. You can't call it yourself.

import java.util.random.RandomGenerator.LeapableGenerator;

enum Level{
    LOW("Low level"),
    Medium("Medium level"),
    High("High level");

    private String description;

    private Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


public class t_Enums_Constructor{
    public static void main(String[] args) {
        // Level myVar = Level.Medium;
        // System.out.println(myVar.getDescription());




        for(Level myVar : Level.values()) {
            System.out.println(myVar + ": " + myVar.getDescription());
        }
    }
}
