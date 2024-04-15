package mx.com.unam.fca.model;

public class Circle extends Figure {

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radio;
    }

}
