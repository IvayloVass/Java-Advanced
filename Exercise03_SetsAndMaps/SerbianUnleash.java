package Exercise03_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerbianUnleash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "(?<venue>[A-Za-z]+\\s([A-Za-z]+\\s)*)(?<price>[0-9]+)[\\s+](?<sits>[0-9]+)";
        //(?<venue>[A-Za-z]+[\s+][A-Za-z]+[\s+])(?<price>[0-9]+)[\s+](?<sits>[0-9]+)
        Pattern pattern = Pattern.compile(regex);

        Map<String, Map<String, Integer>> concertData = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+@");

            if (tokens.length == 1) {
                input = sc.nextLine();
                continue;
            }
            String singer = tokens[0];
            Matcher matcher = pattern.matcher(tokens[1]);
            while (matcher.find()) {
                String venue = matcher.group("venue").trim();
                int price = Integer.parseInt(matcher.group("price"));
                int sits = Integer.parseInt(matcher.group("sits"));
                int turnover = price * sits;
                if (!concertData.containsKey(venue)) {
                    concertData.put(venue, new LinkedHashMap<>());
                    Map<String, Integer> innerMap = concertData.get(venue);
                    innerMap.put(singer, turnover);
                } else {
                    Map<String, Integer> innerMap = concertData.get(venue);
                    if (!innerMap.containsKey(singer)) {
                        innerMap.put(singer, turnover);
                    } else {
                        innerMap.put(singer, innerMap.get(singer) + turnover);
                    }
                }
            }
            input = sc.nextLine();
        }

        for (var innerMap : concertData.entrySet()) {
            System.out.println(innerMap.getKey());
            Map<String, Integer> singersTurnover = innerMap.getValue();
            singersTurnover.entrySet().stream().sorted((t1, t2) -> Integer.compare(t2.getValue(), t1.getValue()))
                    .forEach(entry -> System.out.println("#  " + entry.getKey() + " -> " + entry.getValue()));
        }

    }
}
