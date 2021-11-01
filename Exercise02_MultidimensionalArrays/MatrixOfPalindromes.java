package Exercise02_MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String[][] palindromeMatrix = new String[rows][cols];
        fillMatrix(rows, cols, palindromeMatrix);
        printMatrix(palindromeMatrix);

    }

    private static void printMatrix(String[][] palindromeMatrix) {
        for (String[] matrix : palindromeMatrix) {
            for (String s : matrix) {
                System.out.print(s + " ");
            }
            System.out.println();

        }
    }

    private static void fillMatrix(int rows, int cols, String[][] palindromeMatrix) {
        char middleLetter;
        StringBuilder element = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            char startLetter = 'a';
            startLetter = (char) (startLetter + row);
            for (int col = 0; col < cols; col++) {
                middleLetter = (char) (startLetter + col);
                element.append(startLetter).append(middleLetter).append(startLetter);
                palindromeMatrix[row][col] = element.toString();
                element.delete(0, element.length());
            }
        }
    }
}
