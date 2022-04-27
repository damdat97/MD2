package string_regex.validate_sodienthoai;

public class Main {
    private static final String[] valid = {"(74)-(0666666666)", "(84)-(0111111111)"};
    private static final String[] invalid = {" (a4)-(0978489648)", "(74)-(8666666666)"};

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

        for (String phoneNumber : valid) {
            boolean isValid  = validatePhoneNumber.isValidate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " is valid: " +isValid);
        }
        for (String phoneNumber : invalid) {
            boolean isValid = validatePhoneNumber.isValidate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " is valid: " + isValid);
        }
    }
}
