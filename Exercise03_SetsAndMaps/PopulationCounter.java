package Exercise03_SetsAndMaps;

import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, LinkedHashMap<String, Integer>> aggregatePopulation = new LinkedHashMap<>();

        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            int population = Integer.parseInt(tokens[2]);
            aggregatePopulation.putIfAbsent(country, new LinkedHashMap<>());
            aggregatePopulation.get(country).putIfAbsent(city, population);
            input = sc.nextLine();
        }

        aggregatePopulation.entrySet().stream().sorted((c1, c2) -> {
            int p1 = c1.getValue().values().stream().mapToInt(e -> e).sum();
            int p2 = c2.getValue().values().stream().mapToInt((e -> e)).sum();
            return Integer.compare(p2, p1);
        }).forEach(c -> {
            int totalPopulation = c.getValue().values().stream().mapToInt(e -> e).sum();
            System.out.printf("%s (total population: %d)\n", c.getKey(), totalPopulation);
            LinkedHashMap<String, Integer> innerMap = c.getValue();
            innerMap.entrySet().stream().sorted((t1, t2) -> Integer.compare(t2.getValue(), t1.getValue()))
                    .forEach(t -> System.out.printf("=>%s: %d\n", t.getKey(), t.getValue()));
        });

    }
}
