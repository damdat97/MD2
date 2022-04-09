package mangvaphuongthuc;

public class themphantuvaomang {
    public static void main(String[] args) {
        int size = 10;   //Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 3;
        arr[4] = 7;
        int n = 5;  //So luong phan tu trong mang hien tai
        int x = 6;  //So muon them vao

        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i ++) {
            System.out.print(arr[i] + " ");
        }

        n = insertToPos(arr, size, n, x, 3);
        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int insertToPos(int[]arr, int size, int n, int x, int postision) {
        //Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
        if (n >= size) {
            return n;
        }
        //Vi tri them phan tu phai thuoc khoang [0, n]
        if (postision < 0 || postision > n) {
            return n;
        }

        for (int i = n; i > postision; i--) {
            arr[i] = arr[i - 1];
        }
        //Them X vao vi tri postision cua mang
        arr[postision] = x;
        return n + 1; //tang so luong phan tu cua mang them 1
    }
}
