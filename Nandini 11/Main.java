class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p;
    double radius;

    Circle(int x, int y, double radius) {
        p = new Point(x, y);
        this.radius = radius;
    }

    void display() {
        System.out.println("Center Point: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5);
        c.display();
    }
}