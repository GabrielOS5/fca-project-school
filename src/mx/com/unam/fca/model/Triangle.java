package mx.com.unam.fca.model;

import static mx.com.unam.fca.util.CommonConstants.ESCALENO;
import static mx.com.unam.fca.util.CommonConstants.ISOSCELES;
import static mx.com.unam.fca.util.CommonConstants.EQUILATERO;

public class Triangle extends Figure {

    private final double base;

    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public double getValueHypotenuse() {
        return Math.sqrt((base * base) + (height * height));
    }

    public String getTypeTriangle(double side_a, double side_b, double side_c) {
        if (side_a == side_b && side_b == side_c) {
            return EQUILATERO;
        } else if ((side_a == side_b && side_a != side_c) ||
                (side_a == side_c && side_a != side_b) ||
                (side_b == side_c && side_b !=side_a)) {
            return ISOSCELES;
        } else {
            return ESCALENO;
        }
    }

}
