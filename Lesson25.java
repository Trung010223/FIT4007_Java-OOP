import java.util.Scanner;

public class Lesson25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Tổng các số nguyên tố nhỏ hơn " + N + " là: " + sum);
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}