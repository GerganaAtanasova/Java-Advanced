package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[size][];

        for (int row = 0; row < size; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = input;
        }
        int row = 0;
        int col = 0;
        while (row < size && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();
        row = matrix.length - 1;
        col = 0;
        while (row >= 0 && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row--;
            col++;
        }

    }
}
