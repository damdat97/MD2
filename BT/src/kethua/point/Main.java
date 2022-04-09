package kethua.point;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(6.6f, 9.9f);
        System.out.println("Point2D: " + point2D.toString());
        for (double values: point2D.getXY()) {
            System.out.println(values + "\t");
        }

        Point3D point3D = new Point3D(3.3f, 4.4f, 7.7f);
        System.out.println("Point3D: " + point3D.toString());
        for (double values:  point3D.getXYZ()) {
            System.out.println(values + "\t");
        }
    }
}
