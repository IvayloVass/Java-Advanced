package Lab03_SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowsNum = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> nestedMap = new LinkedHashMap<>();
        for (int i = 0; i < rowsNum; i++) {
            String[] data = sc.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            nestedMap.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> innerMap = nestedMap.get(continent);
            innerMap.putIfAbsent(country, new ArrayList<>());
            innerMap.get(country).add(city);

        }
        for (var entry : nestedMap.entrySet()) {
            String continent = entry.getKey();
            LinkedHashMap<String, List<String>> innerMap = entry.getValue();
            System.out.println(continent + ":");
            for (var innerEntry : innerMap.entrySet()) {
                System.out.println("  "+ innerEntry.getKey() + " -> " +
                        String.join(", ", innerEntry.getValue()));

            }

        }
    }
}
