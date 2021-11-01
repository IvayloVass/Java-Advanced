package Lab03_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TreeMap<String, LinkedHashMap<String, Double>> catalog = new TreeMap<>();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(",\\s+");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            catalog.putIfAbsent(shop, new LinkedHashMap<>());
            LinkedHashMap<String, Double> internalMap = catalog.get(shop);
            internalMap.putIfAbsent(product, price);

            input = sc.nextLine();
        }
        for (var list : catalog.entrySet()) {
            String shop = list.getKey();
            LinkedHashMap<String, Double> internalMap = list.getValue();
            System.out.println(shop + "->");
            for (var product : internalMap.entrySet()) {
                System.out.println("Product: " + product.getKey() + ", " + "Price: " + product.getValue());
            }


        }
    }
}
