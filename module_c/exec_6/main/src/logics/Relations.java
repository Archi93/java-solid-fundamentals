package logics;

public class Relations {

    public static void main(String[] args) {

        /*
            W pierwszej części Twoim zadaniem jest zapisanie w kodzie wartości (literałów) i użycie
            ich do poprawnego zamodelowania wyrażeń logicznych. Wyniki wyrażeń powinny być wyświetlone
            na konsoli.

            W tej części nie używasz zmiennych.
         */
        System.out.print("Czy liczba " + 3 + " jest większa od zera? ");
        System.out.println(3 > 0);

        System.out.print("Czy liczba " + 12 + " jest liczbą ujemną? ");
        System.out.println();

        System.out.print("Czy liczba " + 120 + " jest równa wynikowi mnożenia 6 i 20? ");
        System.out.println();

        System.out.print("Czy jesteś osobą pełnoletnią? ");
        System.out.println();

        System.out.print("Czy liczba " + 131 + " jest liczbą parzystą? ");
        System.out.println();

        System.out.print("Czy litera " + 'A' + " jest przed literą H? ");
        System.out.println();

        System.out.print("Czy urodziłeś się przed " + 2000 + " rokiem i po " + 1980 + " roku? ");
        System.out.println();

        System.out.print("Czy liczba " + 12 + " jest podzielna przez " + 2 + " i jest podzielna przez " + 3 + "? ");
        System.out.println();

        System.out.println("Czy jest przed " + 5 + " rano albo po " + 7 + "? ");
        System.out.println();

        // Analogicznie jak we wcześniejszych przykładach zapisze teraz dwa własne warunki, które
        // chcesz wyświetlić i sprawdzić.


        /*
            W drugiej części Twoim zadaniem jest pobranie od użytkownika wartości (z konsoli), zapisanie
            ich do zmiennych oraz przy pomocy tych zmiennych wyrażenie zdań logicznych. Wyniki zdań logicznych
            musisz przypisać do zmiennych.
         */

        int age;
        boolean adult = false;
        System.out.println("Czy jesteś pełnoletni? " + adult);

        int yearOfBirth;
        // Wprowadź odpowiednią zmienną typu `boolean`, która będzie reprezentowała poprawnie
        // prawdę wyrażoną w zdaniu wyświetlanym na konsoli
        System.out.println("Czy urodziłeś się po 2000 roku? ");

        double monthlySallary;
        System.out.println("Czy zarabiasz powyżej średniej krajowej? ");

        double amountOfSleepInHours;
        System.out.println("Czy śpisz między 6 a 8 godzin każdego dnia? ");

        int monthOfBirth;
        System.out.println("Czy urodziłeś się w maju albo w grudniu? ");

        int dayOfMonthOfBirth;
        System.out.println("Czy urudziłeś się w wiosnę? ");

        int currentDayOfYear;
        System.out.println("Czy masz urodziny za 100 dni albo miałeś urodziny 50 dni temu? ");

        char lastLetterOfFirstName;
        System.out.println("Czy Twoje imię kończy się na literę 'a'? ");

        char firstLetterOfFirstName;
        char firstLetterOfLastName;
        System.out.println("Czy Twoje imię i nazwisko zaczyna się na tą samą literę? ");

        // Analogicznie jak we wcześniejszych przykładach zapisz teraz dwa własne warunki i zdania
        // logiczne.
    }
}
