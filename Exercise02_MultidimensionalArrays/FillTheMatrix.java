package Exercise02_MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matrixType = (sc.nextLine().split(",\\s+"));
        int matrixSqrSize = Integer.parseInt(matrixType[0]);
        String matrixPattern = matrixType[1];
        int[][] matrix = new int[matrixSqrSize][matrixSqrSize];

        if (matrixPattern.equals("A")) {
            fillPatternA(matrix);

        } else if (matrixPattern.equals("B")) {
            fillPatternB(matrix);
        }

        printMatrix(matrix);
    }

    private static void fillPatternB(int[][] matrix) {
        int startElement = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = startElement++;
                }
            } else {
                for (int row = matrix[col].length - 1; row >= 0; row--) {
                    matrix[row][col] = startElement++;
                }
            }
        }
    }


    private static void fillPatternA(int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = startNumber++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
