package ra;


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Hãy nhập số nguyên: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.next());
        }

    }
}
