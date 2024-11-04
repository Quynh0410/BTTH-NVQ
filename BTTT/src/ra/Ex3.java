package ra;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập vào số dòng và cột của mảng 2 chiều (row * col)
        System.out.println("Hãy nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Hãy nhập số cột: ");
        int col = sc.nextInt();
        //khai báo và nhập giá trị các phần tử mảng số nguyên 2 chiều.
        int[][] matrix = new int[row][col];
        System.out.println("Nhập các phần tủ vào ma trận: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
                matrix[i][j] = Integer.parseInt(sc.next());
            }
        }
        //In giá trị các phần tử mảng theo ma trận
        System.out.println("Ma trận đã nhâp:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
}
