public class Lesson28 {
    public static void main(String[] args) {
        String[][] array = new String[9][9];

        // Khởi tạo tất cả các phần tử trong mảng là " "
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = " ";
            }
        }

        // In các ký tự "*" theo yêu cầu
        for (int i = 0; i < 9; i++) {
            array[i][0] = "*";
            array[8][i] = "*";
            array[i][i] = "*";

        }

        // In ra mảng
        System.out.println("Hình 1");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++){
            array[0][i] = "*";
            array[i][8] = "*";
            array[i][0] = "*";
            array[8][i] = "*";
            array[i][i] = "*";
            array[i][8-i] = "*";
        }
        // In ra mảng
        System.out.println("Hình 2");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }

        for (int i = 0; i < 9; i++){
            array[0][i] = " ";
            array[i][8] = " ";
            array[i][0] = " ";
            array[8][i] = " ";
            array[4][i] = "*";

        }
        // In ra mảng
        System.out.println("Hình 3");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}