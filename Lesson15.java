public class Lesson15 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Vui lòng cung cấp các giá trị.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        try {
            for (String arg : args) {
                int value = Integer.parseInt(arg);
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }

            System.out.println("Giá trị nhỏ nhất: " + min);
            System.out.println("Giá trị lớn nhất: " + max);
        } catch (NumberFormatException e) {
            System.out.println("Các giá trị phải là số nguyên.");
        }
    }
}