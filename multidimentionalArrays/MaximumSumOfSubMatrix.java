package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfSubMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        ;
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = readMatrix(rows, cols, scanner);
        int sum = 0;
        int[][] maxMatrix = new int[2][2];

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int current = matrix[row][col];
                int right = matrix[row][col + 1];
                int bottom = matrix[row + 1][col];
                int rightBottom = matrix[row + 1][col + 1];
                int currentSum = current + right + bottom + rightBottom;
                if (sum < currentSum) {
                    sum = currentSum;
                    maxMatrix = new int[][]{
                            {current, right},
                            {bottom, rightBottom}
                    };
                }
            }
        }
        for (int r = 0; r < maxMatrix.length; r++) {
            for (int c = 0; c < maxMatrix[r].length; c++) {
                int current = maxMatrix[r][c];
                System.out.print(current + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }


    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = input;
        }
        return matrix;
    }
}
