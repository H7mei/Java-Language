class Shape {
    int x, y;
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void draw() {
        System.out.println("Drawing Shape");
    }
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    // Super Constructor
    Rectangle(int x, int y) {
        super(x, y);
    }
    int getCorner() {
        return 4;
    }
    // super keyword
    int getParentCorner() {
        return super.getCorner();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        var rect = new Rectangle(10, 20);
        System.out.println(rect.getCorner());
        rect.draw();
        System.out.println(rect.getParentCorner());
    }
}
