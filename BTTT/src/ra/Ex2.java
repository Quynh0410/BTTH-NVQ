package ra;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử vào mảng: ");
        int n = scanner.nextInt();
        double[] arry = new double[n];
        System.out.println("Hãy nhập giá trị cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1)  + ": ");
            arry[i] = Double.parseDouble(scanner.next());
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arry[i];
        }
        double avg = sum / n;
        System.out.print("Giá trị trung bình cộng của mảng là: " + avg);
    }
}
