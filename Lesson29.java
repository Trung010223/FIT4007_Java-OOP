public class Lesson29 {
    public static void main(String[] args) {
        String[][] array = new String[9][9];
        String[][] array1 = new String[9][9];


        // Khởi tạo tất cả các phần tử trong mảng là " "
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = " ";
                array1[i][j] = " ";
            }
        }

        //Hình 1
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < i; j++){
                array[i][j] = "*";
            }
        }
        //Hình 2
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9 -i; j++){
                array1[i][j] = "*";
            }
        }
        //Hình 3

        // In ra mảng
        System.out.println("Hình 1");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
        // In ra mảng
        System.out.println("Hình 2");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array1[i][j] +" ");
            }
            System.out.println();
        }
        //Hình 3
        // Hình 3
        System.out.println("Hình 3");
        for (int i = 1; i <= 10; i++) {
            // In khoảng trắng trước mỗi hàng
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            // In dấu * cho mỗi hàng
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Vẽ tam giác rỗng
        for (int i = 1; i <= 10; i++) {
            // In khoảng trắng trước mỗi hàng
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            // In dấu * đầu tiên
            System.out.print("*");

            // In khoảng trắng ở giữa
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }

            // In dấu * cuối cùng nếu không phải là hàng đầu tiên
            if (i != 1) {
                System.out.print("*");
            }

            System.out.println(); // Xuống dòng sau mỗi hàng
        }

        // Vẽ đáy của tam giác
        for (int i = 1; i <= 12; i++) {
            System.out.print("*" + " ");
        }
        System.out.println(); // Xuống dòng sau khi vẽ đáy
    }
}
