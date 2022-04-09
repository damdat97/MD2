package mangvaphuongthuc;

public class demsolanxuathienkytutrongchuoi {
    static void demkytu(String str) {
        int count[] =  new int[256];
        int num = str.length();

        for (int i = 0; i < num; i++) {
            count[str.charAt(i)]++;
        }

        char arr[] = new char[str.length()];
        for (int i = 0; i < num; i++) {
            arr[i] = str.charAt(i);
            int dem = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == arr[j]) {
                    dem++;
                }
                if (dem == 1) {
                    System.out.println("So lan xuat hien cua " + str.charAt(i) + " trong chuoi: " + count[str.charAt(i)]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "Dam Xuan Dat";
        System.out.println("Chuoi ky tu: " + str);
        demkytu(str);
    }
}