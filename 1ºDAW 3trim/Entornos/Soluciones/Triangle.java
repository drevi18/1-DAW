public class Triangle extends Shape {
    public Triangle(double size) {
        super(size);
    }

    @Override
    public double area() {
        double size = getSize();
        return size * size / 2.0;
    }
}