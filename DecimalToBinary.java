import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }

        for (Integer num :
                stack) {
            System.out.print(num);
        }
    }
}
