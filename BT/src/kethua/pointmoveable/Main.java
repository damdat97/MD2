package kethua.pointmoveable;

public class Main {
    public static void main(String[] args) {

            Point point =new Point(4.3f,10.10f);
            System.out.println("Point: "+point.toString());

            MoveAblePoint moveablePoint = new MoveAblePoint(5.5f, 6.6f, 3.2f, 1.2f);
            System.out.println("Movable point before: "+moveablePoint.toString());
            moveablePoint.move();
            System.out.println("Movable point after: "+moveablePoint.toString());

    }
}
