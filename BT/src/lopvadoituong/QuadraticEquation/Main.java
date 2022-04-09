package lopvadoituong.QuadraticEquation;

public class Main {
    public static void main(String[] args) {

        QuadraticEquation QuadraticEquation = new QuadraticEquation(3,2,1);

        System.out.println("Phuowng trinh co delta: " + QuadraticEquation.getDiscriminant());
        if (QuadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (QuadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem = " + (-QuadraticEquation.getB() / 2 * QuadraticEquation.getA()));
        } else if (QuadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co nghiem : " + "\nx1 = " + QuadraticEquation.getRoot1() + "\nx2 = " + QuadraticEquation.getRoot2());
        }
    }
}
