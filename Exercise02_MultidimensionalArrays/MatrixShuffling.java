package Exercise02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = array[0];
        int cols = array[1];
        String[][] matrix = readMatrix(rows, cols, sc);
        String input = sc.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "swap":
                    if (tokens.length == 5) {
                        int oldRow = Integer.parseInt(tokens[1]);
                        int oldCol = Integer.parseInt(tokens[2]);
                        int newRow = Integer.parseInt(tokens[3]);
                        int newCol = Integer.parseInt(tokens[4]);
                        if (areValidCoordinates(rows, cols, oldRow, oldCol, newRow, newCol)) {
                            swapElements(oldRow, oldCol, newRow, newCol, matrix);
                            printMatrix(matrix);
                        } else {
                            System.out.println("Invalid input!");
                        }
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
            }

            input = sc.nextLine();
        }

    }

    private static void swapElements(int oldRow, int oldCol, int newRow, int newCol, String[][] matrix) {
        String oldPosition = matrix[oldRow][oldCol];
        String newPosition = matrix[newRow][newCol];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == oldRow && col == oldCol) {
                    matrix[row][col] = newPosition;
                }
                if (row == newRow && col == newCol) {
                    matrix[row][col] = oldPosition;
                }

            }
        }
    }

    private static boolean areValidCoordinates(int rows, int cols, int oldRow, int oldCol, int newRow, int newCol) {
        return oldRow >= 0 && oldRow < rows && newRow >= 0 && newRow < rows &&
                oldCol >= 0 && oldCol < cols && newCol >= 0 && newCol < cols;
    }


    private static String[][] readMatrix(int rows, int cols, Scanner sc) {
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = sc.nextLine().split("\\s+");
        }
        return matrix;
    }


    private static void printMatrix(String[][] palindromeMatrix) {
        for (String[] matrix : palindromeMatrix) {
            for (String s : matrix) {
                System.out.print(s + " ");
            }
            System.out.println();

        }
    }
}