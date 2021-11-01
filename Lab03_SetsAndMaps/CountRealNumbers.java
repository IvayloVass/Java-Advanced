package Lab03_SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> map = new LinkedHashMap<>();
        for (double currentValue : numbers) {
            if (!map.containsKey(currentValue)) {
                map.put(currentValue, 1);
            } else {
                map.put(currentValue, map.get(currentValue) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
