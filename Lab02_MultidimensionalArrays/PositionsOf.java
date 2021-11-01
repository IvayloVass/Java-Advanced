package Lab02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rowsAndColumns = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndColumns[0];
        int cols = rowsAndColumns[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(sc);
        }
        int searchedNum = sc.nextInt();
        boolean isFound = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int currentNum = matrix[row][col];
                if (currentNum == searchedNum) {
                    isFound = true;
                    System.out.print(row + " " + col);
                    System.out.println();

                }
            }
        }
        if (!isFound) {

            System.out.println("not found");
        }

    }

    private static int[] readArray(Scanner sc) {
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
