package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvenOrOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        filter(range[0], range[1], command.equals("even")
                ? x -> x % 2 == 0
                : x -> x % 2 != 0);

    }

    public static void filter(int startNumber, int endNumber, Predicate<Integer> predicate) {
        System.out.println(IntStream.rangeClosed(startNumber, endNumber)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
