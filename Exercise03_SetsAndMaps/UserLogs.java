package Exercise03_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, LinkedHashMap<String, Integer>> attackers = new TreeMap<>();

        while (!input.equals("end")) {
            String[] serverLog = input.split("\\s+");
            String ip = serverLog[0].split("=")[1];
            String user = serverLog[2].split("=")[1];

            if (!attackers.containsKey(user)) {
                attackers.put(user, new LinkedHashMap<>());
                attackers.get(user).put(ip, 1);
            } else {
                LinkedHashMap<String, Integer> innerMap = attackers.get(user);
                if (!innerMap.containsKey(ip)) {
                    innerMap.put(ip, 1);
                } else {
                    innerMap.put(ip, innerMap.get(ip) + 1);
                }
            }

            input = sc.nextLine();
        }
        System.out.println();

        for (Map.Entry<String, LinkedHashMap<String, Integer>> log : attackers.entrySet()) {
            String username = log.getKey();
            System.out.println(username + ": ");
            LinkedHashMap<String, Integer> innerMap = log.getValue();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> ipAppearances : innerMap.entrySet()) {
                String output = String.format("%s => %d", ipAppearances.getKey(), ipAppearances.getValue());
                sb.append(output);
                sb.append(", ");
            }
            String format = sb.substring(0, sb.length() - 2);
            System.out.println(format + ".");

        }
    }
}
