package Exercise03_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String material = sc.nextLine();
        Map<String, Integer> treasury = new LinkedHashMap<>();

        while (!material.equals("stop")) {
            int quantity = Integer.parseInt(sc.nextLine());
            if (!treasury.containsKey(material)) {
                treasury.put(material, quantity);
            } else {
                treasury.put(material, treasury.get(material) + quantity);
            }

            material = sc.nextLine();
        }

        for (Map.Entry<String, Integer> entry : treasury.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
