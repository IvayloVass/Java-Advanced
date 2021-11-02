package Exercise06_DefiningClasses.P06_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String trainerName;
    private int numberOfBadges;
    private List<Pokemon> pokemonList;

    public Trainer(String trainerName, Pokemon pokemon) {
        this.trainerName = trainerName;
        this.numberOfBadges = 0;
        this.pokemonList = new ArrayList<>();
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setNumberOfBadges() {
        this.numberOfBadges +=1;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }
}
