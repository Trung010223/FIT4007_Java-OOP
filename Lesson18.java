public class Lesson18 {
    public static void main(String[] args) {
        int start = 300;
        int end = 3;

        System.out.println("Các bội số của 3 từ 300 đến 3 là:");

        for (int i = start; i >= end; i -= 3) {
            System.out.println(i);
        }
    }
}