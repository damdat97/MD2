package vonglap;

import java.util.Scanner;

public class sntnhohon100 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= 100; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Cac so nguyen to tu 1 den 100 la: " +primeNumbers);
    }
}
