enum Level {
    LOW("Standard Edition"),
    MEDIUM("Professional Edition"),
    HIGH("Enterprise Edition"),
    HIGHEST("Ultimate Edition");
    private String description;

    private Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class Enum {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2 + " " + myVar2.getDescription());
            if (myVar2 == Level.HIGHEST) {
                System.out.println(myVar2 + " is the highest level");
            } else if (myVar2 == Level.LOW) {
                System.out.println(myVar2 + " is the lowest level");
            }
        }
    }
}
