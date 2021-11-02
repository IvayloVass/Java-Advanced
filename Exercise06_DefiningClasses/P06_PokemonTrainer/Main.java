package Exercise06_DefiningClasses.P06_PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Pokemon pokemon = null;
        Trainer trainer = null;
        Map<String, Trainer> trainersMap = new HashMap<>();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
            pokemon = new Pokemon(pokemonName, element, health);
            trainer = new Trainer(trainerName, pokemon);

            if (!trainersMap.containsKey(trainerName)) {
                trainersMap.put(trainerName, trainer);
            } else {
                trainer = trainersMap.get(trainerName);
                trainer.getPokemonList().add(pokemon);
            }

            input = sc.nextLine();
        }
        String command = sc.nextLine();

        while (command.equals("End")) {

            for (var kvp : trainersMap.entrySet()) {
                List<Pokemon> pokemonList = kvp.getValue().getPokemonList();
                for (Pokemon pokemon1 : pokemonList) {
                    if (pokemon1.getElement().equals(command)) {
                        kvp.getValue().setNumberOfBadges();
                    } else {
                        pokemon.reduceHealth();
                        if (pokemon.getHealth() <= 0) {
                            kvp.getValue().getPokemonList().remove(pokemon);
                            if (kvp.getValue().getPokemonList().size() < 1) {
                                break;
                            }
                        }

                    }
                }
            }

            command = sc.nextLine();

        }
        trainersMap.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumberOfBadges(), b1.getValue().getNumberOfBadges()))
                .forEach(t -> {
                    System.out.printf("%s %s %s%n", t.getKey(),
                            t.getValue().getNumberOfBadges(),
                            t.getValue().getPokemonList().size());
                });


    }

}
