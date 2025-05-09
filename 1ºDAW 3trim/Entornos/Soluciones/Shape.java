public abstract class Shape {
    private double size;

    public Shape(double size) {
        this.size = size;
    }

    public double getSize() { return size; }
    public abstract double area();
}

public class Square extends Shape {
    public Square(double size) {
        super(size);
    }

    public double area() {
        double size = getSize();
        return size * size;
    }
}

public class Circle extends Shape {
    public Circle(double size) {
        super(size);
    }

    public double area() {
        double size = getSize();
        return Math.PI * size * size / 4.0;
    }
}

public class Triangle extends Shape {
    public Triangle(double size) {
        super(size);
    }

    public double area() {
        double size = getSize();
        return size * size / 2.0;
    }
}



