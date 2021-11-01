package Lab02_MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];
        char[][] outputMatrix = new char[rows][cols];

        firstMatrix = readCharMatrix(rows, cols, sc);
        secondMatrix = readCharMatrix(rows, cols, sc);

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    outputMatrix[row][col] = '*';
                } else {
                    outputMatrix[row][col] = firstMatrix[row][col];
                }
            }
        }
        printMatrix(outputMatrix);

    }

    // reading a char matrix from console
    public static char[][] readCharMatrix(int rows, int cols, Scanner sc) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] elements = sc.nextLine().split("\\s+");
            for (int col = 0; col < elements.length; col++) {
                char current = elements[col].charAt(0);
                matrix[row][col] = current;
            }

        }
        return matrix;
    }

    // printing a Matrix
    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }
    }
}

