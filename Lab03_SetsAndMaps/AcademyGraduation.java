package Lab03_SetsAndMaps;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsNum = Integer.parseInt(sc.nextLine());
        Map<String, double[]> gradesBook = new TreeMap<>();
        while (studentsNum-- > 0) {
            String studentName = sc.nextLine();
            double[] grades = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            gradesBook.putIfAbsent(studentName, grades);
        }
        for (Map.Entry<String, double[]> entry : gradesBook.entrySet()) {
            double avg = Arrays.stream(entry.getValue()).average().orElse(0);
            System.out.printf("%s is graduated with %f\n", entry.getKey(), avg);
        }

    }
}
