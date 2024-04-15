package mx.com.unam.fca;

import mx.com.unam.fca.model.Circle;
import mx.com.unam.fca.model.Figure;
import mx.com.unam.fca.model.Rectangle;
import mx.com.unam.fca.model.Square;
import mx.com.unam.fca.model.Triangle;

import static mx.com.unam.fca.util.CommonConstants.HYPOTENUSE;
import static mx.com.unam.fca.util.CommonConstants.PERIMETER;
import static mx.com.unam.fca.util.CommonConstants.AREA;
import static mx.com.unam.fca.util.CommonConstants.TYPE;

public class Application {

    public static void main(String[] args) {
        Figure circle = new Circle(2);
        System.out.println("-- Circle --");
        printInformation(circle);

        Figure rectangle = new Rectangle(5, 2);
        System.out.println("-- Rectangle --");
        printInformation(rectangle);

        Figure square = new Square(5);
        System.out.println("-- Square --");
        printInformation(square);

        Triangle triangle = new Triangle(3, 4);
        System.out.println("-- Triangle --");
        printInformation(triangle);
        System.out.println(HYPOTENUSE + triangle.getValueHypotenuse());
        System.out.println(TYPE + triangle.getTypeTriangle(3, 4, 5));
    }

    private static void printInformation(Figure figure) {
        System.out.println(PERIMETER + figure.perimeter());
        System.out.println(AREA + figure.area());
    }

}