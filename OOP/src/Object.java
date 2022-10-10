// class
class Person {
    String name;
    int age;
    // field final
    final String tear = "Indonesia";

    // nested class
    static class Address {
        String street;
        String city;
        String country;
    }
    // method
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }

}

class Car {
    String brand;
    String type;
    int cc;
    // constructor
    Car(String brand, String type, int cc) {
        this.brand = brand;
        this.type = type;
        this.cc = cc;
    }
    // method
    void printData() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("CC: " + this.cc);
    }
}

class Bike {
    String name;
    byte type;
    // Constructor Overloading
    Bike(String bikeName, byte typeBike){
        name = bikeName;
        type = typeBike;
    }
    Bike(String bikeName){
        // memanggil Constructor lain
        this(bikeName, (byte) 0);
    }


    void bik() {
        System.out.println(this.name);
        if((byte) this.type != 0){
            System.out.println(this.type);
        }else{
            System.out.println("Unknown");
        }
    }
}

public class Object {
    public static void main(String[] args) {
        var person = new Person();
        person.name = "John";
        person.age = 20;
        // person.tear = "USA"; // error
        var address = new Person.Address();
        address.street = "Jl. ABC";
        address.city = "Jakarta";
        address.country = "Indonesia";

        String addressString = address.street + ", " + address.city + ", " + address.country;

        System.out.println(person.name + " is " + person.age + " years old" + " from " + person.tear);
        System.out.println(addressString);
        person.sayHello("Teddy");

        // Car
        Car();

        // Bike
        Bike();
    }

    static void Car(){
        var car = new Car("Honda", "Jazz", 1500);

        car.printData();
    }

    static void Bike(){
        var bike = new Bike("forms");
        var fullBike = new Bike("Full", (byte) 2);

        bike.bik();
        fullBike.bik();
    }
}
