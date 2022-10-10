public class OperasiLogika {
    public static void main(String[] args) {
        // Operasi Matematika
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) ); // penjumlahan
        System.out.println("a - b = " + (a - b) ); // pengurangan
        System.out.println("a * b = " + (a * b) ); // perkalian
        System.out.println("b / a = " + (b / a) ); // pembagian
        System.out.println("b % a = " + (b % a) ); // modulus

        // Unary Operator
        System.out.println("++a = " + ++a ); // prefix increment
        System.out.println("b++ = " + b++ ); // postfix increment
        System.out.println("--a = " + --a ); // prefix decrement
        System.out.println("b-- = " + b-- ); // postfix decrement

        // Augmented Assignment
        a += b;
        System.out.println("a += b = " + a ); // a = a + b
        a -= b;
        System.out.println("a -= b = " + a ); // a = a - b
        a *= b;
        System.out.println("a *= b = " + a ); // a = a * b
        a /= b;
        System.out.println("a /= b = " + a ); // a = a / b
        a %= b;
        System.out.println("a %= b = " + a ); // a = a % b


        // Operasi logika
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y) ); // AND
        System.out.println("x || y = " + (x || y) ); // OR
        System.out.println("!(x && y) = " + !(x && y) ); // NOT

        // Operasi Perbandingan
        System.out.println("a == b = " + (a == b) ); // sama dengan
        System.out.println("a != b = " + (a != b) ); // tidak sama dengan
        System.out.println("a > b = " + (a > b) ); // lebih besar dari
        System.out.println("a < b = " + (a < b) ); // lebih kecil dari
        System.out.println("b >= a = " + (b >= a) ); // lebih besar sama dengan
        System.out.println("b <= a = " + (b <= a) ); // lebih kecil sama dengan



    }
}
