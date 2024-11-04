package ra;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập số phần tử của mảng (n),
        System.out.println("Nhập phần tử của mảng: ");
        int n = sc.nextInt();
        // khai báo nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arry[%d] = ", i);
            array[i] = Integer.parseInt(sc.next());
        }
        //Nhập vào một giá trị (findNumber),
        System.out.println("Nhập vào một giá trị (findNumber)");
        int findNumber = sc.nextInt();
        // in ra chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == findNumber) {
                sum += array[i];
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có phần tử nào bằng giá trị findNumber.");
        } else {
           System.out.printf("Tổng các phần tử có giá trị bằng %d là: %d\n", findNumber, sum);
        }
    }
}
