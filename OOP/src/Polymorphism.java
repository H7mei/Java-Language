import java.lang.reflect.Array;

class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}

// variable Hiding
class Parent {
    String name;
    void doIt() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    String name;
    void doIt(String name) {
        System.out.println("Child");
        System.out.println("My Parent Name is " + name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // kode Polymorphism / perubahan bentuk
        Employee employee = new Employee("Eks");
        employee.sayHello("nike");

        employee = new Manager("coma");
        employee.sayHello("mos");

        employee = new VicePresident("karma");
        employee.sayHello("bis");

        // cara lain
        sayHello(new Employee("Eks"));
        sayHello(new Manager("coma"));
        sayHello(new VicePresident("karma"));

        // variable Hiding
        variableHiding();
    }
    // Type Check & Cast
    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            var vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice " + vicePresident.name);
        } else if(employee instanceof Manager) {
            var manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else if(employee != null) {
            System.out.println("Hello Employee " + employee.name);
        }
    }
    // Variable Hiding
    static void variableHiding() {
        var parent = new Parent();
        parent.name = "Parent name";
        parent.doIt();

        var child = new Child();
        child.name = "Child name";
        child.doIt(parent.name);

        // variable Hiding
        System.out.println(parent.name);
        System.out.println(child.name);
    }

}
