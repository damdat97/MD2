package string_regex.validate_lophoc;

public class Main {
    private static final String[] valid = {"C0222H", "C0322I", "C1222G"};
    private static final String[] invalid = {"B0222H", " A0322Y", "F123@I"};

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        for (String name : valid) {
            boolean isValid = validateClassName.isValidate(name);
            System.out.println("Class name: " + name + " is valid: " + isValid);
        }
        for (String name : invalid) {
            boolean isValid = validateClassName.isValidate(name);
            System.out.println("Class name: " + name + " is valid: " + isValid);
        }
    }
}
