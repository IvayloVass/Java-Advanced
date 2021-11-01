package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = readMatrix(size, sc);
        int[] leftDiagonal = createLeftDiagonalArr(matrix);
        int[] rightDiagonal = createRightDiagonalArr(matrix);
        printArrays(leftDiagonal, rightDiagonal);

    }

    private static void printArrays(int[] leftDiagonal, int[] rightDiagonal) {
        for (int digits : leftDiagonal) {
            System.out.print(digits + " ");
        }
        System.out.println();

        for (int digits : rightDiagonal) {
            System.out.print(digits + " ");
        }
    }

    private static int[] createRightDiagonalArr(int[][] matrix) {
        int[] rightDiagonal = new int[matrix.length];
        int arraySize = 0;
        for (int col = matrix.length - 1; col >= 0; col--) {
            rightDiagonal[arraySize] = matrix[col][arraySize];
            arraySize++;
        }
        return rightDiagonal;

    }

    private static int[] createLeftDiagonalArr(int[][] matrix) {
        int[] leftDiagonal = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            leftDiagonal[row] = matrix[row][row];
        }
        return leftDiagonal;
    }

    private static int[][] readMatrix(int size, Scanner sc) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
