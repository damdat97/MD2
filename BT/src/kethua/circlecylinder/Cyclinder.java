package kethua.circlecylinder;


public class Cyclinder extends Circle {
    private double height;

    public Cyclinder() {
    }

    public Cyclinder(double height) {
        this.height = height;
    }

    public Cyclinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAreaCyc() {
        return (2 * Math.PI * getRadius() * height + 2 * Math.PI * getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "Cyclinder: "
                + "height = " + height
                + ", radius = " + getRadius()
                + ", color = " + getColor()
                + "\n" + "Area = " + getAreaCyc();
    }
}
