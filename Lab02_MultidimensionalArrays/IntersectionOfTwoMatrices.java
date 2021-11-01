package Lab02_MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        String[][] firstMatrix = new String[rows][cols];
        String[][] secondMatrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            firstMatrix[row] = sc.nextLine().split("\\s+");
        }

        for (int row = 0; row < rows; row++) {
            secondMatrix[row] = sc.nextLine().split("\\s+");
        }

        String[][] intersectionMatrix = new String[rows][cols];
        String elementFirstMatrix = "";
        String elementSecondMatrix = "";

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                elementFirstMatrix = firstMatrix[row][col];
                elementSecondMatrix = secondMatrix[row][col];
                if (elementFirstMatrix.equals(elementSecondMatrix)) {
                    intersectionMatrix[row][col] = elementFirstMatrix;
                } else {
                    intersectionMatrix[row][col] = "*";
                }
            }
        }

        for (int row = 0; row < intersectionMatrix.length; row++) {
            for (int col = 0; col < intersectionMatrix[row].length; col++) {
                System.out.print(intersectionMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
