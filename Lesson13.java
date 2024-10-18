public class Lesson13 {
    public static void main(String[] args) {
        // Kiểm tra xem có tham số nào được nhập từ dòng lệnh không
        if (args.length == 0) {
            System.out.println("Vui lòng nhập một số nguyên dương vào dòng lệnh!");
            return;
        }

        // Chuyển đổi tham số đầu tiên thành số nguyên
        int n = Integer.parseInt(args[0]);

        // Kiểm tra xem n có phải là số nguyên dương không
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
            return;
        }

        // Tính tổng
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // In kết quả
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
    }
}
