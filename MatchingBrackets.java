import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder expression = new StringBuilder(input);
        ArrayDeque<Integer> index = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (current == '(') {
                index.push(i);
            } else if (current == ')') {
                int startIndex = index.pop();
                String content = expression.substring(startIndex, i + 1);
                System.out.println(content);
            }

        }
    }
}
