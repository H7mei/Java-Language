public class Method {
    public static void main(String[] args) {
        myMethod("John");
        sum(1, 3);
        calculate(1, "+", 2);
        sample(1, 2, 3, 4, 5);
        sample(1, 2);
        factorial(5);
    }

    static void myMethod(String name) {
        System.out.println("Hello World" + name);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int calculate(int x, String operator, int y) {
        switch (operator) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                return 0;
        }
    }

    // method Variabel Argument | spread operator
    static int sample(int... numbers) {
        int sample = 0;
        for (int number : numbers) {
            sample += number;
        }
        return sample;
    }

    // method overloading
    static int sample(int x, int y) {
        return x + y;
    }

    // recursive method
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }



}
