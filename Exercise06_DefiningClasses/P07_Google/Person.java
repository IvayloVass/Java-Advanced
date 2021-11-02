package Exercise06_DefiningClasses.P07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Parents> parents;
    private List<Children> children;
    private List<Pokemon> pokemon;


    public Person() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemon = new ArrayList<>();

    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public void setCar(Car car) {
        this.car = car;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public List<Pokemon> getPokemon() {
        return this.pokemon;
    }

    public List<Parents> getParents() {
        return this.parents;
    }

    public List<Children> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Company:").append("\n");
        if (company != null) {
            builder.append(company.toString()).append("\n");
        }
        builder.append("Car:").append("\n");
        if (car != null) {
            builder.append(car.toString()).append("\n");
        }
        builder.append("Pokemon:").append("\n");
        if (pokemon != null) {
            for (Pokemon singlePokemon : pokemon) {
                builder.append(singlePokemon.toString()).append("\n");
            }
        }
        builder.append("Parents:").append("\n");
        if (parents != null) {
            for (Parents parent : parents) {
                builder.append(parent.toString()).append("\n");
            }
        }
        builder.append("Children:").append("\n");
        if (children != null) {
            for (Children child : children) {
                builder.append(child.toString()).append("\n");
            }
        }

        return builder.toString();
    }

}
