// static import
import static pakage.data.Product.*;

public class StaticKeyword {
    static int a = 3;
    public static final int PROCESSOR;
    static int b;
    // static method
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    static {
        System.out.println("Static block 2 initialized.");
        b = a * 5;
    }
    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    public static void main(String args[]) {
        meth(42);

        System.out.println(PROCESSOR + "core processors");
        // static import
        PRICE += 100000 * PROCESSOR;
        printPrice();
    }
}
