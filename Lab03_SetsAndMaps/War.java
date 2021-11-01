package Lab03_SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class War {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = readDeck(sc.nextLine());
        LinkedHashSet<Integer> secondDeck = readDeck(sc.nextLine());
        int round = 50;
        while (round-- > 0) {
            int firstCard = getCard(firstDeck);
            int secondCard = getCard(secondDeck);
            firstDeck.remove(firstCard);
            secondDeck.remove(secondCard);

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else {
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }

        }
        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (firstDeck.size() < secondDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static int getCard(LinkedHashSet<Integer> desk) {
        return desk.stream().findFirst().orElse(0);
    }

    private static LinkedHashSet<Integer> readDeck(String nextLine) {
        return Arrays.stream(nextLine.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
    }


}
