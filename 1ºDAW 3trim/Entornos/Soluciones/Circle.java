public class Circle extends Shape {
    public Circle(double size) {
        super(size);
    }

    @Override
    public double area() {
        double size = getSize();
        return Math.PI * size * size / 4.0;
    }
}