package pakage.data;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Product: " + name + " Price: " + price;
    }

    // equals method
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        return this.name.equals(product.name) && this.price == product.price;
    }
    // hashCode method
    public int hashCode() {
        return this.name.hashCode() + this.price;
    }

    public static int PRICE = 1000000;

    public static void printPrice() {
        System.out.println(PRICE + " is the price");
    }
}
