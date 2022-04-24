package Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] carInformation = scanner.nextLine().split("\\s+");

            Car car = new Car(carInformation[0], carInformation[1], Integer.parseInt(carInformation[2]));


              System.out.println(car);
        }
    }
}
