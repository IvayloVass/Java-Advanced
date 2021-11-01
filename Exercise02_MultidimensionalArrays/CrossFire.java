package Exercise02_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossFire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        List<List<Integer>> matrix = new ArrayList<>();
        fillList(matrix, rows, cols);
        printList(matrix);

        String input = sc.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            String[] tokens = input.split("\\s+");
            int rowEdge = Integer.parseInt(tokens[0]);
            int colEdge = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);
            for (int currentRow = rowEdge - radius; currentRow <= rowEdge + radius; currentRow++) {
                if (isValid(currentRow, colEdge, matrix)) {
                    matrix.get(currentRow).remove(colEdge);
                }
            }
            for (int currentCol = colEdge + radius; currentCol >= colEdge - radius; currentCol--) {
                if (isValid(rowEdge, currentCol, matrix)) {
                    matrix.get(rowEdge).remove(currentCol);
                }
            }

            input = sc.nextLine();
        }

        matrix.removeIf(List::isEmpty);
        printList(matrix);

    }

    private static boolean isValid(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();


    }

    public static void fillList(List<List<Integer>> matrix, int rows, int cols) {
        int startElement = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(startElement++);
            }
        }

    }

    public static void printList(List<List<Integer>> matrix) {
        for (List<Integer> Lists : matrix) {
            for (Integer element : Lists) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}

