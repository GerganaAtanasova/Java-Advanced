package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                    input = scanner.nextLine();
                    continue;
                } else {
                    String canceled = queue.pollFirst();
                    System.out.printf("Canceled %s%n", canceled);
                    input = scanner.nextLine();
                    continue;
                }
            }
            queue.offer(input);
            input = scanner.nextLine();
        }
        for (String file :
                queue) {
            System.out.println(file);
        }
    }
}
