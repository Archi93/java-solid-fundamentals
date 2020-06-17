package elements;

import java.util.Arrays;
import java.util.List;

public class Hard {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alicja", "Jakub", "Zygmut", "Anna", "Aleksandra");

        System.out.println("Wszystkie imiona: " + names);

        System.out.println("\nPoszczegolne imiona...");
        int counter = 0;
        while (counter < names.size()) {
            System.out.println("Imie z listy: " + names.get(counter));
            counter = counter + 1;
        }

        System.out.println("\nLosowanie nowych imion...");
        counter = 0;
        while (counter < names.size()) {
            String randomName = randomName();
            names.set(counter, randomName);
            counter++;
        }

        System.out.println("\nKobiety i mezczyzni...");
        counter = 0;
        while (counter < names.size()) {
            String value = names.get(counter);
            if (value.charAt(value.length() - 1) == 'a') {
                System.out.println("Kobieta: " + value);
            }
            else {
                System.out.println("Mezczyzna: " + value);
            }
            counter += 1;
        }

    }

    private static String randomName() {
        String[] names = new String[] {"Alicja", "Jakub", "Zygmunt", "Anna", "Aleksandra", "Michal", "Marcel", "Tomasz",
                "Stanislaw", "Zofia"};

        int randomNameIndex = 0 + (int) (names.length * Math.random());
        return names[randomNameIndex];
    }
}