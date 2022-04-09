package abstractinterface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", false, 8.5);
        shapes[1] = new Rectangle("yellow", true, 4.5, 9.3);
        shapes[2] = new Square("white", true, 5.6);

        Square square = new Square();

        for (Shape elements : shapes){
            System.out.println(elements.toString());
            if (elements instanceof Square){
                square.howToColor();
            }
        }
    }
}
