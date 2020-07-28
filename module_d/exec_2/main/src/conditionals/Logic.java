package conditionals;

import java.util.Random;
import java.util.Scanner;

public class Logic {

    public static void main(String[] args) {

        Random r = new Random();

        /*
            Mając podany dzień tygodnia wyświetl komunikat mówiący, czy jest to:
            - dzień ood poniedziałku do czwartku,
            - piątek
            - weekend.

            Przyjmij, że dni numerujemy od 0 (poniedziałek)
         */
        {
            int weekDay = r.nextInt(7);
        }

        /*
            Mając podany dzień tygodnia oraz godzinę wyświetl komunikat mówiący, że trzeba już
            wstać. Przyjmij, że trzeba wstać gdy:
            - jest od wtorku do czwartku po 7 rano,
            - jest poniedziałek po 8 rano,
            - jest weekend po 10 rano.
         */
        {
            int weekDay = r.nextInt(7);
            int hour = 4 + r.nextInt(8);
        }

        /*
            Mając trzy liczby określ, która z liczb jest największa. Wynik przypisz do zmiennej
            result
         */
        int result = -1;
        {
            int a = r.nextInt(10);
            int b = r.nextInt(10);
            int c = r.nextInt(10);
        }
        System.out.println("Największa z liczb: " + result);

        /*
            Odczytaj imię i wiek użytkownika. Określ ile lat brakuje do emerytury lub od ilu lat
            użytkownik jest już na emeryturze:

            TIP: Do określenia płci użytkownika wykorzystaj uproszczony algorytm, że jest kobietą,
            gdy imię kończy się na literę `a`.
         */
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Podaj imię: ");
            String firstName;

            System.out.print("Podaj wiek: ");
            int age;

        }
    }
}
