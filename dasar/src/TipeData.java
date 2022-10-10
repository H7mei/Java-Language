public class TipeData {
    public static void main(String[] args) {
        // tipe data primitif
        // 1. integer Number
        byte a1 = 10; // bilangan bulat
        short a2 = 10; // bilangan bulat
        int a = 10; // bilangan bulat
        long a3 = 10; // bilangan bulat

        int sum = 60_000_000; // Kode ini sama dengan 60000000
        long balance = 1_000_000_000_000L; // Kode: UnderScore

        System.out.println(a1 + a2 + a + a3 + sum + balance);

        // 2. floating point number
        float b1 = 10.5f; // bilangan desimal
        double b = 10.5; // bilangan desimal

        System.out.println(b1 + b);

        // Konversi Tipe Data Number
        // Widening Casting (automatis)
        // byte -> short -> int -> long -> float -> double
        int i = 10;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Nilai d = " + d);

        // Narrowing Casting (manual)
        // double -> float -> long -> int -> short -> byte
        double d2 = 10.25;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

        System.out.println("Nilai byte: " + b2);

        // 3. character
        char c = 'a'; // karakter
        char os = '\u0041'; // unicode

        System.out.print(c + " " + os);
        System.out.println(c);

        // 4. boolean
        boolean dc = true; // true
        boolean d2c = false; // false
        boolean as; // default: false

        System.out.println(dc + " " + d2c + " "  );
        
        // variabel
        // var s ; // error
        var s = "Hello World!"; // string

        System.out.println(s);

        // Kata Kunci final/const
        final int x = 10;
        // x = 5; // error

        System.out.println(x);
        
        // Tipe Data Non Primitif
        // 1. String
        String e = "Hello World!"; // string
        String sf = "Hello Jakarta"; // string

        System.out.println(e + " " + sf);
        
        // 2. Array
        int[] fa = {1, 2, 3, 4, 5}; // array bilangan bulat
        int[][] g = {{1, 2, 3}, {4, 5, 6}}; // array bilangan bulat 2 dimensi
        String[] h = {"Hello", "World"}; // array string
        String[] cda; // array string

        cda = new String[2];

        cda[0] = "Hello";
        cda[1] = "World";

        System.out.println(g[0][0] + " " + g[0][1] + " " + g[0][2]);
        System.out.println(fa[0] + " " + fa[1] + " " + fa[2] + " " + fa[3] + " " + fa[4]);
        System.out.println(h[0] + " " + h[1]);
        System.out.println(cda[0] + " " + cda[1]);

        System.out.println("Panjang Array fa: " + fa.length);

        // 3. Class
         class Person {
             String name;
             int age;
         }
        
         Person person1 = new Person();
        
         person1.name = "John";
         person1.age = 24;
         
         System.out.println(person1.name + " " + person1.age);
            
        // 4. Interface
        interface Persons {
            String name = "John";
            int age = 24;
        }
        
        System.out.println(Persons.name + " " + Persons.age);
        
        // 5. Enum
        enum Color {
            RED, GREEN, BLUE
        }
        
        Color color = Color.RED;
        
        System.out.println(color);

        // 6. case class non-primitif
        Byte b3 = 10;
        Integer i3 = 10;
        Long l3 = 10L;
        Float f3 = 10.5f;
        Double d3 = 10.5;
        Character c3 = 'a';
        Boolean dc3 = true;

        // konversi tipe data non-primitif
        int i4 = i3.shortValue();
        long l4 = i3.longValue();
        float f4 = i3.floatValue();
        double d4 = i3.doubleValue();

        System.out.println(i4 + " " + l4 + " " + f4 + " " + d4);
    }
}
