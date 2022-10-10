import pakage.data.*;

public class AbstractClass {
    public static void main(String[] args) {
        // location location = new Location(); // error

        City F = new City();
        F.name = "France";
        System.out.println(F.name);
        // abstract method
        F.show();

    }
}
