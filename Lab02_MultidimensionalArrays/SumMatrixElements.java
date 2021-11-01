package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(sc.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(sc);
        }
        int sumMatrixElement = getSumElements(matrix);

        output(rows, cols, sumMatrixElement);
    }

    private static int getSumElements(int[][] matrix) {
        int sumMatrixElement = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int element = matrix[row][col];
                sumMatrixElement += element;
            }
        }
        return sumMatrixElement;
    }

    private static void output(int rows, int cols, int sumMatrixElement) {
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumMatrixElement);
    }

    public static int[] readArray(Scanner sc) {
        return Arrays.stream(sc.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();

    }
}
