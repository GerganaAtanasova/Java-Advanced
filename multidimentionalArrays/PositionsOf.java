package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = readMatrix(rows, cols, scanner);
        int numberToFind = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int current = matrix[row][col];
                if (current == numberToFind) {
                    isFound = true;
                    System.out.println(row + " " + col);
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String numbers = scanner.nextLine();
            int[] arr = Arrays.stream(numbers.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;


        }
        return matrix;
    }
}
