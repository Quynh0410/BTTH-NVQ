package ra;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập số phần tử của mảng (n),
        System.out.println("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        // khai báo và nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        int[] array = new int[n];
        System.out.println("Nhập giá trị của phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array [%d] = ", i);
            array[i] = Integer.parseInt(sc.next());
        }
        // Nhập giá trị (addValue) và chỉ số chèn phần tử vào mảng (addIndex),
        System.out.println("Nhập giá trị cần cập nhật (addValue): ");
        int aadValue = Integer.parseInt(sc.next());
        System.out.println("Nhập chỉ số cần cập nhật (addIndex): ");
        int addIndex = Integer.parseInt(sc.next());
        // thực hiện thêm chèn giá trị addValue và chỉ số addIndex của mảng
        if (addIndex >= 0 && addIndex < n) {
            array[addIndex] = aadValue;
            System.out.println("Mảng sau khi cập nhật: ");
            for (int i = 0; i < array.length; i++) {
                System.out.printf("array [%d] = %d\n", i, array[i]);
            }
        }else{
                System.out.println("Chỉ số không hợp lệ.");
            }
        }
    }
