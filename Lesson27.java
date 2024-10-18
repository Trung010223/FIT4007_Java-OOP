import java.util.Scanner;

public class Lesson27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        printFibonacci(n);
        scanner.close();
    }

    public static void printFibonacci(int n) {
        int a = 1, b = 1;
        System.out.print("Chuỗi Fibonacci với " + n + " số: ");

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b + " ");
        }
        System.out.println();
    }
}