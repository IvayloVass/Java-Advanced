package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
        String[] coordinates = sc.nextLine().split("\\s+");
        int rowPosition = Integer.parseInt(coordinates[0]);
        int colPosition = Integer.parseInt(coordinates[1]);
        int wrongElement = matrix[rowPosition][colPosition];


        for (int row = 0; row < rows; row++) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (wrongElement == matrix[row][col]) {
                    // check for index in left
                    if (col >= 1 && matrix[row][col - 1] != wrongElement) {
                        sum += matrix[row][col - 1];
                    }
                    // check for index Up
                    if (row - 1 >= 0 && matrix[row - 1][col] != wrongElement) {
                        sum += matrix[row - 1][col];
                    }
                    // check for index right
                    if (col + 1 <= matrix[row].length - 1 && matrix[row][col + 1] != wrongElement) {
                        sum += matrix[row][col + 1];
                    }
                    // check for index down
                    if (row + 1 <= matrix.length - 1 && matrix[row + 1][col] != wrongElement) {
                        sum += matrix[row + 1][col];
                    }

                    matrix[row][col] = sum;
                }
            }
        }

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
}
