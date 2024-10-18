import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();

        int count = countDigits(s);
        System.out.println("Số lượng ký tự là số trong chuỗi: " + count);

        scanner.close();
    }

    public static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Cách 1: Kiểm tra bằng mã ASCII
            // if (c >= '0' && c <= '9') {
            //     count++;
            // }

            // Cách 2: Sử dụng class Character
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}