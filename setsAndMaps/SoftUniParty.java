package setsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();

        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                if (input.length()==8) {
                    vipGuests.add(input);
                }
            } else if (!Character.isDigit(input.charAt(0))) {
                if (input.length()==8) {
                    regularGuests.add(input);
                }
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0)) && input.length() == 8) {
                vipGuests.remove(input);
            } else if (!Character.isDigit(input.charAt(0)) && input.length() == 8) {
                regularGuests.remove(input);
            }
            input = scanner.nextLine();
        }
        int sumOfGuest = vipGuests.size() + regularGuests.size();
        System.out.println(sumOfGuest);
        for (String guest : vipGuests) {
            System.out.println(guest);
        }
        for (String guest : regularGuests) {
            System.out.println(guest);
        }
    }
}
