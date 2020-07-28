package conditionals;

import java.util.Random;
import java.util.Scanner;

public class MoreDecisions {

    public static void main(String[] args) {

        Random r = new Random();

        // -----------------------------------------------------------------------------------------
        // Zapisz poniższe linie korzystając z odpowiednich instrukcji warunkowych

        int number = -100 + r.nextInt(201);
        System.out.println("Liczba " + number + " jest dodania");
        System.out.println("Liczba " + number + " jest ujemna");
        System.out.println("Liczba " + number + " jest zerem");

        // -----------------------------------------------------------------------------------------
        // Zapisz poniższe linie korzystając z odpowiednich instrukcji warunkowych
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca (0 - Styczeń, 11 - Grudzień): ");
        int monthNumber = scanner.nextInt();
        System.out.println("Styczeń");
        System.out.println("Luty");
        System.out.println("Marzec");
        System.out.println("Kwiecień lub Maj lub Czerwiec");
        System.out.println("Lipiec lub Sierpień lub Wrzesień");
        System.out.println("Październik lub Listopad lub Grudzień");

        // -----------------------------------------------------------------------------------------
        // Zapisz poniższe linie korzystając z odpowiednich instrukcji warunkowych
        //
        // TIP: W zadaniu skorzystaj z dodatkowych zmiennych typu boolean określających wystąpienie
        // danej pory roku
        System.out.println("Podaj dzień miesiąca (0 - pierwszy dzien miesiąca): ");
        int dayOfMonth = scanner.nextInt();
        System.out.println("Wiosna");
        System.out.println("Lato");
        System.out.println("Jesień");
        System.out.println("Zima");
    }
}
