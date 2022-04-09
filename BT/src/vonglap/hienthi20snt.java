package vonglap;

import java.util.Scanner;

public class hienthi20snt {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap: ");
        number = scanner.nextInt();
        int count = 0;
        int N = 2;
        String text = "";
        while (count < number) {
            if (N == 2) {
                text = text + " " + N;
                N++;
                count++;
            } else {
                int a = 0;
                for (int i = 2; i < N; i++) {
                    if (N%i == 0) {
                        a++;
                        N++;
                        break;
                    }
                }
                if (a == 0) {
                    text = text + " " + N;
                    N++;
                    count++;
                }
            }
        }
        System.out.println("Chuoi so nguyen to: " +text);
    }
}
