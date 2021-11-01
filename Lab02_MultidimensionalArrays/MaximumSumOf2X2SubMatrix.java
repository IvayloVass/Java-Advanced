package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rowsCols = Arrays.stream(sc.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];
        int[][] mainMatrix = readMatrix(rows, cols, sc);
        int maxSumOfElements = Integer.MIN_VALUE;
        int sum = 0;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < mainMatrix.length - 1; row++) {
            for (int col = 0; col < mainMatrix[row].length - 1; col++) {
                sum =
                        mainMatrix[row][col] +
                                mainMatrix[row][col + 1] +
                                mainMatrix[row + 1][col] +
                                mainMatrix[row + 1][col + 1];
                if (sum > maxSumOfElements) {
                    maxSumOfElements = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        System.out.println(mainMatrix[bestRow][bestCol] + " " + mainMatrix[bestRow][bestCol + 1]);
        System.out.println(mainMatrix[bestRow + 1][bestCol] + " " + mainMatrix[bestRow + 1][bestCol + 1]);
        System.out.println(maxSumOfElements);
    }

    private static void printMatrix(int[][] biggestElementsMatrix) {
        for (int row = 0; row < biggestElementsMatrix.length; row++) {
            for (int col = 0; col < biggestElementsMatrix[row].length; col++) {
                System.out.print(biggestElementsMatrix[row][col] + " ");
            }
            System.out.println();

        }
    }


    private static int[][] readMatrix(int rows, int cols, Scanner sc) {
        int[][] mainMatrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            mainMatrix[row] = Arrays.stream(sc.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return mainMatrix;
    }
}
