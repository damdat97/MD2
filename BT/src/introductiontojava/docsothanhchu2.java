package introductiontojava;

import java.util.Scanner;

public class docsothanhchu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] arr = {"không","một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        String chuoi = null;
        if (num >= 0 && num <= 10) {
            chuoi = arr[num];
        }
        if (num > 10 && num <= 19) {
            if (num%10 != 5) {
                chuoi = "mười "+ arr[num%10];
            }
            else {
                chuoi = "mười" + " lăm ";
            }
        }
        if (num >= 20 && num <100) {
            if (num%10 == 0) {
                chuoi = arr[num/10] + " mươi ";
            }
            else if (num%10 == 1) {
                chuoi = arr[num/10] + " mươi mốt";
            }
            else if (num%10 == 5) {
                chuoi = arr[num/10] + " mươi lăm";
            }
            else {
                chuoi = arr[num/10] + " mươi " + arr[num%10];
            }
        }
        System.out.println(chuoi);
    }
}
