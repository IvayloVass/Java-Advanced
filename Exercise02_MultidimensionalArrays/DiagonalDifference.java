package Exercise02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = readMatrix(size, sc);
        int sumPrimaryDiagonal = getPrimarySum(matrix, size);
        int sumSecondaryDiagonal = getSecondarySum(matrix, size);
        calculateDiff(sumPrimaryDiagonal, sumSecondaryDiagonal);

    }

    private static int getSecondarySum(int[][] matrix, int size) {
        int sum = 0;
        int colCounter = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum += matrix[i][colCounter];
            colCounter++;
        }
        return sum;
    }

    private static int getPrimarySum(int[][] matrix, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static void calculateDiff(int sumPrimaryDiagonal, int sumSecondaryDiagonal) {
        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }


    private static int[][] readMatrix(int size, Scanner sc) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
