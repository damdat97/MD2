package abstractinterface.doituonghinhhoc;

public class ComparableCircle extends Circle implements Comparable<Kethua.DoiTuongHinhHoc.ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Kethua.DoiTuongHinhHoc.ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else
            return 1;
    }
}
