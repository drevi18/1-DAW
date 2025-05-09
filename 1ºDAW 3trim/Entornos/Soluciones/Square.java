public class Square extends Shape {
    public Square(double size) {
        super(size);
    }

    @Override
    public double area() {
        double size = getSize();
        return size * size;
    }
}