class Category {
    private String name;
    private String description;

    // getter
    public String getName() {
        if (name == "") {
            return "No name";
        }
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public class GetterSetter {
    // proses encapsulation
    public static void main(String[] args) {
        Category category = new Category();
        // set value
        category.setName("Java");
        category.setDescription("Java is a programming language");
        // get value
        System.out.println(category.getName());
        System.out.println(category.getDescription());
    }
}
