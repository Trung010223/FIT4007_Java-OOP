import java.util.Scanner;

public class Lesson26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int N = scanner.nextInt();

        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < N) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }

        System.out.println("Tổng " + N + " số nguyên tố đầu tiên là: " + sum);
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