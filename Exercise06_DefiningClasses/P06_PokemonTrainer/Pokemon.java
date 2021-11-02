package Exercise06_DefiningClasses.P06_PokemonTrainer;

public class Pokemon {

    private String pokemonName;
    private String element;
    private int health;

    public Pokemon(String pokemonName, String element, int health) {
        this.pokemonName = pokemonName;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public void reduceHealth() {
            this.health -= 10;

    }

    public int getHealth() {
        return health;
    }

    public String getPokemonName() {
        return pokemonName;
    }
}
