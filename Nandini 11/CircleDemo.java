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
        System.out.println("Point (x, y): (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle(4, 5, 3);
        c.display();
    }
}