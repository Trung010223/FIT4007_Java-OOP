import java.util.Scanner;

public class Lesson24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Tổng " + N + " số nguyên là: " + sum);
        scanner.close();
    }
}