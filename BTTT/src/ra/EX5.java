package ra;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        //Nhập số phần tử của mảng số thực 2 chiều (row*col),
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        // khai báo và  nhập giá trị các phần tử mảng 2 chiều số thực (row*col)
        double[][] array = new double[row][col];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                array[i][j] = Double.parseDouble(sc.next());
            }
        }
        // in ra gia tri các phần tử có giá trị chẵn,  tính tổng các phần tử đó
        double sum = 0;
        System.out.printf("Các phần tử có giá trị chẵn: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               if (array[i][j] % 2 == 0) {
                   System.out.printf("%.2f ",array[i][j]);
                   sum += array[i][j];
               }
            }
        }
        System.out.printf("Tổng các phần tử chẵn: %.2f", sum);
    }
}
