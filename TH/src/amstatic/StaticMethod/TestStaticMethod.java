package amstatic.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Dam");
        Student s2 = new Student(112, "Dat");

        s1.display();
        s2.display();
    }
}
