class Company {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void getCompany() {
            System.out.println(Company.this.name);
        }

        public void show() {
            System.out.println("Company: " + Company.this.name);
            System.out.println("Employee: " + this.name);
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Google");

        Company.Employee employee = company.new Employee();
        employee.setName("John");
        employee.getCompany();

        employee.show();
    }
}
