package setsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shopsInfo = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] parameters = input.split(", ");
            String shop = parameters[0];
            String product = parameters[1];
            double price = Double.parseDouble(parameters[2]);

            shopsInfo.putIfAbsent(shop, new LinkedHashMap<>());
            Map<String, Double> productAndPrices = shopsInfo.get(shop);
            productAndPrices.put(product, price);


            input = scanner.nextLine();
        }
        for (String shop : shopsInfo.keySet()) {
            System.out.println(shop + "->");
            for (Map.Entry<String, Double> entry : shopsInfo.get(shop).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
