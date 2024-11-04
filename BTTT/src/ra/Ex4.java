package ra;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Nhập số phần tử và giá trị các phần tử của mảng một chiều số nguyên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] nunbers = new int[n];
        System.out.println("Nhập giá trị: ");
        for (int i = 0; i < nunbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            nunbers[i] = Integer.parseInt(sc.next());
        }
        int max = nunbers[0];
        int min = nunbers[0];
        //Tìm giá trị lớn nhất và nhỏ nhất trong mảng
        for (int i = 1; i < nunbers.length; i++) {
            if (nunbers[i] > max) {
                max = nunbers[i];
            }
            if (nunbers[i] < min) {
                min = nunbers[i];
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
