import pakage.data.Product;

public class Equals {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000000);
        Product product2 = new Product("Laptop", 1000000);

        System.out.println(product1.equals(product2)); // false

        // another example
        String s3 = "Hello";
        String s2 = s3 + " " + "World";

        String s1 = "Hello World";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        // another example
        System.out.println(product1.equals(product2)); // true
    }
}
