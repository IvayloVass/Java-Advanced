package Exercise06_DefiningClasses.P07_Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Car car = null;
        Children children = null;
        Company company = null;
        Parents parents = null;
        Pokemon pokemon = null;
        Map<String, Person> personData = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            if (!personData.containsKey(name)) {
                personData.put(name, new Person());
            }
            String dataSource = tokens[1];
            switch (dataSource) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    company = new Company(companyName, department, salary);
                    personData.get(name).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    pokemon = new Pokemon(pokemonName, pokemonType);
                    personData.get(name).getPokemon().add(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthDay = tokens[3];
                    parents = new Parents(parentName, parentBirthDay);
                    personData.get(name).getParents().add(parents);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthDay = tokens[3];
                    children = new Children(childName, childBirthDay);
                    personData.get(name).getChildren().add(children);
                    break;
                case "car":
                    String model = tokens[2];
                    int speed = Integer.parseInt(tokens[3]);
                    car = new Car(model, speed);
                    personData.get(name).setCar(car);
                    break;
            }

            input = sc.nextLine();
        }

        String nameForPrint = sc.nextLine();
        System.out.println(nameForPrint);

        Person googledPerson = personData.get(nameForPrint);
        System.out.println(googledPerson);


    }
}
