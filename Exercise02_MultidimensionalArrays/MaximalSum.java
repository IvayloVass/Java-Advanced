package Exercise02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[][] matrix = readMatrix(rowsAndCols, sc);

        int maxSum = Integer.MIN_VALUE;
        int[] bestVector = new int[2];

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int[] start = {row, col};
                if (findSum(matrix, start) > maxSum) {
                    maxSum = findSum(matrix, start);
                    bestVector = start;
                }
            }

        }
        System.out.println("Sum = " + maxSum);
        printMatrix(bestVector, matrix);

    }

    private static int findSum(int[][] matrix, int[] start) {
        int sum = 0;
        for (int row = start[0]; row < start[0] + 3; row++) {
            for (int col = start[1]; col < start[1] + 3; col++) {
                sum += matrix[row][col];

            }
        }

        return sum;
    }

    private static void printMatrix(int[] bestVector, int[][] matrix) {
        for (int row = bestVector[0]; row < bestVector[0] + 3; row++) {
            for (int col = bestVector[1]; col < bestVector[1] + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }

    }

    private static int[][] readMatrix(int[] rowsAndCols, Scanner sc) {
        int[][] matrix = new int[rowsAndCols[0]][rowsAndCols[1]];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }


}
