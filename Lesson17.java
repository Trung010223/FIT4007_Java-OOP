import java.util.Scanner;

public class Lesson17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Số bạn nhập là zero.");
        } else if (num % 2 == 0) {
            System.out.println("Số bạn nhập là số chẵn.");
        } else {
            System.out.println("Số bạn nhập là số lẻ.");
        }

        scanner.close();
    }
}