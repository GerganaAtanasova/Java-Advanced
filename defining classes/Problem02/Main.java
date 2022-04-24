package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] carInformation = scanner.nextLine().split("\\s+");
            Car car;
            if (carInformation.length == 1) {
                car = new Car(carInformation[0]);
            } else {
                car = new Car(carInformation[0], carInformation[1], Integer.parseInt(carInformation[2]));
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
