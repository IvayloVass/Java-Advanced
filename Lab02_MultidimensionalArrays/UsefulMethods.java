package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class UsefulMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = readMatrix(rows, sc, "\\s+");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }
    }

    public static int[][] readMatrix(int rows, Scanner sc, String pattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split(pattern))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }

    private static char[][] fillCharMatrixV1(Scanner sc, int size) {
        char[][] matrix = new char[size][size];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = sc.nextLine().toCharArray();
        }
        return matrix;
    }


    private static char[][] fillCharMatrixV2(Scanner sc, int size) {
        char[][] matrix = new char[size][size];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = sc.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }
    private static boolean isInBounds(int newRow, int newCol, char[][] matrix) {
        return newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[newRow].length;
    }

}
