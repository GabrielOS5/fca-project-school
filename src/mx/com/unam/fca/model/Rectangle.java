package mx.com.unam.fca.model;

public class Rectangle extends Figure {

    private final double base;

    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return (base * height) * 2;
    }

}
