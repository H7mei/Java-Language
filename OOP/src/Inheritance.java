class Manager extends Employee{
    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is Manager " + this.name);
    }

}
// inheritance
class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }

    // method overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VP " + super.name);
    }
}


public class Inheritance {
    public static void main(String[] args){
        var manager = new Manager("antichoice");
        manager.sayHello("j oma");

        var vicePresident = new VicePresident("Teddy");
        vicePresident.sayHello(manager.name);


        System.out.println("Name Employee " + manager.name);
        System.out.println("Name Vice " + vicePresident.name);
    }
}