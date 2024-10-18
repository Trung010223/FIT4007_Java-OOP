import java.util.StringTokenizer;

public class Lesson21 {
    public static void main(String[] args) {
        String originalString = "Bai Tap Mon Lap Trinh Java";
        String[] tokens = splitString(originalString);

        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static String[] splitString(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        String[] tokens = new String[tokenizer.countTokens()];

        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            tokens[i++] = tokenizer.nextToken();
        }

        return tokens;
    }
}