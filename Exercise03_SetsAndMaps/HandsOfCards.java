package Exercise03_SetsAndMaps;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Set<String>> participantHands = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");
            Set<String> cardsSet = new HashSet<>();
            Collections.addAll(cardsSet, cards);

            if (!participantHands.containsKey(name)) {
                participantHands.put(name, cardsSet);
            } else {
                Set<String> currentCards = participantHands.get(name);
                currentCards.addAll(Arrays.asList(cards));
                participantHands.put(name, currentCards);
            }

            input = sc.nextLine();
        }
        for (Map.Entry<String, Set<String>> player : participantHands.entrySet()) {
            int points = getPlayerPoints(player.getValue());
            System.out.println(player.getKey() + ": " + points);
        }
    }

    private static int getPlayerPoints(Set<String> cards) {
        int sum = 0;
        Map<Character, Integer> values = getValues();
        for (String card : cards) {
            int points = 0;
            if (card.contains("10")) {
                char strength = card.charAt(2);
                points = 10 * values.get(strength);

            } else {
                char number = card.charAt(0);
                char strength = card.charAt(1);
                points = values.get(number) * values.get(strength);

            }
            sum += points;
        }
        return sum;
    }

    private static LinkedHashMap<Character, Integer> getValues() {
        LinkedHashMap<Character, Integer> points = new LinkedHashMap<>();
        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}
