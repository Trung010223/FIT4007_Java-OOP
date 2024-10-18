import java.util.Scanner;

public class Lesson19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }

        System.out.println("Số lần ký tự 'a' xuất hiện trong chuỗi: " + count);

        scanner.close();
    }
}