interface HelloWorld {
    public void greet();
    public void greetSomeone(String someone);
}

public class AnonymousClass {
    public static void main(String[] args) {
        HelloWorld englishGreeting = new HelloWorld() {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        };

        System.out.println("Anonymous class");
        englishGreeting.greet();
        englishGreeting.greetSomeone("Java");

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        System.out.println("Anonymous class");
        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Java");
    }
}
