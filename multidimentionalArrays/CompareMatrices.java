package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputFirst = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = inputFirst[0];
        int cols = inputFirst[0];
        int[][] firstMatrix = readMatrix(rows, cols, scanner);

        int[] inputSecond = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        rows = inputSecond[0];
        cols = inputSecond[1];
        int[][] secondMatrix = readMatrix(rows, cols, scanner);

        boolean areEquals = areEquals(firstMatrix, secondMatrix);
        System.out.println(areEquals ? "equal" : "not equal");
    }

    private static boolean areEquals(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }

        }
        return true;
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
