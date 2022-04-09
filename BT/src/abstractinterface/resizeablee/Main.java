package abstractinterface.resizeablee;

import abstractinterface.resizeablee.circle.Circle;
import abstractinterface.resizeablee.rectangle.Rectangle;
import abstractinterface.resizeablee.shape.Shape;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.floor(Math.random()*100));

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5, "blue", false);
        shapes[1] = new Rectangle(4.5, 6.7, "red", true);
        shapes[2] = new Square("white", true, 3.4);

        System.out.println("Before: ");
        for (Shape elements : shapes){
            System.out.println(elements.toString());
        }

        System.out.println("After: ");
        for (Shape elements : shapes){
            elements.resize(randomNumber);
            System.out.println(elements.toString());
        }
    }
}
