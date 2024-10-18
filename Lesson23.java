import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("Ước số chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}