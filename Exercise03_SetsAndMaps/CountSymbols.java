package Exercise03_SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 1);
            } else {
                map.put(currentChar, map.get(currentChar) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " " + "time/s");
        }
    }
}
