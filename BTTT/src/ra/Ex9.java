package ra;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        //Nhập số phần tử của mảng (n),
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        // khai báo và nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        int[] array = new int[n];
        System.out.println("Nhập giá trị của các phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        // Nhập chỉ số phần tử cần xóa (deleteIndex) và thực hiện xóa phần tử trong mảng theo deleteIndex
        System.out.println("Nhập chỉ số cần xóa: ");
        int deleteIndex = Integer.parseInt(sc.nextLine());
        if (deleteIndex < 0 || deleteIndex >= array.length) {
            System.out.println("Chỉ số phần tử không tồn tại.");
        } else {
            int[] newNumber = new int[array.length - 1];
            for (int i = 0; i < newNumber.length; i++) {
                if (i < deleteIndex) {
                    newNumber[i] = array[i];
                } else {
                    newNumber[i] = array[i + 1];
                }
            }
            System.out.println("Giá trị các phần tử còn lại sau khi xóa là:");
            for (int element : newNumber) {
                System.out.printf("%d\t", element);
            }
            System.out.println("\n");
        }
    }

}

