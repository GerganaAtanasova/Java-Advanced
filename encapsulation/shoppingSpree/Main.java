package shoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleInfo = new LinkedHashMap<>();
        Map<String, Product> productInfo = new HashMap<>();

        String[] people = scanner.nextLine().split(";");
        for (String element : people) {
            String[] personData = element.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);
            try {
                Person person = new Person(name, money);
                peopleInfo.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        System.out.println();
        String[] products = scanner.nextLine().split(";");
        for (String element : products) {
            String[] productData = element.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);
                productInfo.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] commandParts = command.split("\\s+");
            String personName = commandParts[0];
            String productName = commandParts[1];

            try {
                Person person = peopleInfo.get(personName);
                Product product = productInfo.get(productName);
                person.buyProduct(product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        for (Person person : peopleInfo.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.print(person.getProducts().stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", ")) + System.lineSeparator());
            }
        }

    }
}
