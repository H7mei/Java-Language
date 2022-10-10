import pakage.data.Product;

public class HashCode {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000000);
        Product product2 = new Product("Laptop", 1000000);
        Product product3 = new Product("Move", 1000000);

        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product3.hashCode());
    }
}
