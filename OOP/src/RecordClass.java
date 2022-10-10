import pakage.file.LoginRequest;

public class RecordClass {
    public static void main(String[] args) {
        // record
        record Person(String name, int age) {
            // constructor
            public Person {
                System.out.println("Constructor");
            }
        }
        Person person = new Person("John", 20);
        System.out.println(person.name());
        System.out.println(person.age());

        // record
        LoginRequest hann = new LoginRequest("hann", "123");

        System.out.println(hann);
        System.out.println(hann.username());
        System.out.println(hann.password());

        if (hann instanceof LoginRequest) {
            System.out.println("hann is instance of LoginRequest");
            if (hann.username().equals("hann") && hann.password().equals("123")) {
                hann.susses();
            } else {
                hann.failed();
            }
        }


    }
}
