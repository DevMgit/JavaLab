abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Calculating area for rectangle...");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Calculating area for triangle...");
        return (dim1 * dim2) / 2;
    }
}

class Circle extends Figure {
    Circle(double a) {
        super(a, 0);
    }

    double area() {
        System.out.println("Calculating area for circle...");
        return Math.PI * dim1 * dim1;
    }
}

class AbstractAreas {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(10, 20);
        Circle c = new Circle(10);

        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Area of triangle: " + t.area());
        System.out.println("Area of circle: " + c.area());
    }

}
