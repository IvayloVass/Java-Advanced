package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rowsAndCols = getArray(sc.nextLine());

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] firstMatrix = readMatrix(rows, cols, sc);

        rowsAndCols = getArray(sc.nextLine());

        rows = rowsAndCols[0];
        cols = rowsAndCols[1];

        int[][] secondMatrix = readMatrix(rows, cols, sc);

        if (matricesAreEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int col = 0; col < firstArr.length; col++) {
                if (firstArr[col] != secondArr[col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = getArray(sc.nextLine());
            matrix[row] = arr;
        }
        return matrix;
    }

    public static int[] getArray(String line) {
        return Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }

            System.out.println();
        }
    }
}

