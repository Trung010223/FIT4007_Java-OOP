public class Lesson14 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Vui lòng cung cấp giá trị n.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n < 1) {
                System.out.println("n phải là số nguyên dương.");
                return;
            }

            int total;
            if (n % 2 == 0) {
                total = sumEven(n);
            } else {
                total = sumOdd(n);
            }

            System.out.println("Tổng từ 1 đến " + n + " là: " + total);
        } catch (NumberFormatException e) {
            System.out.println("Giá trị n phải là số nguyên.");
        }
    }

    public static int sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
