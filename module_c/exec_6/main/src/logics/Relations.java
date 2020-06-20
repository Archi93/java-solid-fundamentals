package logics;

import java.util.*;

public class Relations {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*
            W pierwszej części Twoim zadaniem jest zapisanie w kodzie wartości (literałów) i użycie
            ich do poprawnego zamodelowania wyrażeń logicznych. Wyniki wyrażeń powinny być wyświetlone
            na konsoli.

            W tej części nie używasz zmiennych.
         */
        System.out.print("Czy liczba " + 3 + " jest większa od zera? ");
        System.out.println(3 > 0);

        System.out.print("Czy liczba " + 12 + " jest liczbą ujemną? ");
        System.out.println(12 < 0);

        System.out.print("Czy liczba " + 120 + " jest równa wynikowi mnożenia 6 i 20? ");
        System.out.println(120 == 6 * 20);

        System.out.print("Czy jesteś osobą pełnoletnią? ");
        System.out.println(27 > 18);

        System.out.print("Czy liczba " + 131 + " jest liczbą parzystą? ");
        System.out.println(131 % 2 == 0);

        System.out.print("Czy litera " + 'A' + " jest przed literą H? ");
        System.out.println('A' < 'H');

        System.out.print("Czy urodziłeś się przed " + 2000 + " rokiem i po " + 1980 + " roku? ");
        System.out.println(1993 < 2000 & 1993 > 1980);

        System.out.print("Czy liczba " + 12 + " jest podzielna przez " + 2 + " i jest podzielna przez " + 3 + "? ");
        System.out.println((12 % 2 == 0 ) && (12 % 3 == 0));
 
        System.out.print("Czy jest przed " + 5 + " rano albo po " + 7 + "? ");
        System.out.println(6.31 > 5 ^ 6.31 > 7);

        // Analogicznie jak we wcześniejszych przykładach zapisze teraz dwa własne warunki, które
        // chcesz wyświetlić i sprawdzić.


        /*
            W drugiej części Twoim zadaniem jest pobranie od użytkownika wartości (z konsoli), zapisanie
            ich do zmiennych oraz przy pomocy tych zmiennych wyrażenie zdań logicznych. Wyniki zdań logicznych
            musisz przypisać do zmiennych.
         */
        System.out.print("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        boolean adult = age >= 18;
        System.out.println("Czy jesteś pełnoletni? " + adult);
           
        System.out.print("Podaj rok urodzenia: ");
        int yearOfBirth = scanner.nextInt();
        boolean birthAfter2000 = yearOfBirth > 2000;
        // Wprowadź odpowiednią zmienną typu `boolean`, która będzie reprezentowała poprawnie
        // prawdę wyrażoną w zdaniu wyświetlanym na konsoli
        System.out.println("Czy urodziłeś się po 2000 roku? " + birthAfter2000);

        System.out.print(" Podaj swoje zarobki brutto: ");
        double monthlySallary = scanner.nextDouble();
        boolean salaryAboveAverage = monthlySallary > 5331.31;
        System.out.println("Czy zarabiasz powyżej średniej krajowej? " + salaryAboveAverage);
        
        System.out.print("Ile godzin dziennie śpisz: ");
        double amountOfSleepInHours = scanner.nextDouble();
        boolean sleepBetween6And8Hours = amountOfSleepInHours > 6 & amountOfSleepInHours < 8;
        System.out.println("Czy śpisz między 6 a 8 godzin każdego dnia? " + sleepBetween6And8Hours);
        
        System.out.print("Podaj numer miesiąca, w którym się urodziłeś: ");
        int monthOfBirth = scanner.nextInt();
        boolean birthInMayOrDecember = monthOfBirth == 5 ^ monthOfBirth == 12;
        System.out.println("Czy urodziłeś się w maju albo w grudniu? " + birthInMayOrDecember);
        
        System.out.print("Podaj dzień roku w którym się urodziłeś: ");
        int dayOfMonthOfBirth = scanner.nextInt();
        boolean birthInSpring = dayOfMonthOfBirth >= 20 & monthOfBirth == 3
                              ^ dayOfMonthOfBirth <= 21 & monthOfBirth == 6
                              ^ monthOfBirth == 4
                              ^ monthOfBirth ==5;
        System.out.println("Czy urudziłeś się w wiosnę? " + birthInSpring);

        System.out.print("Który mamy dzień roku? ");
        int currentDayOfYear = scanner.nextInt();
        System.out.print("Podaj numer dnia w roku w którym się urodziłeś: ");
        int dayInYearOfBirth = scanner.nextInt();
        boolean birthdayIn100DaysOrWas50DaysAgo = currentDayOfYear + 100 == dayInYearOfBirth ^ currentDayOfYear - 50 == dayInYearOfBirth;
        System.out.println("Czy masz urodziny za 100 dni albo miałeś urodziny 50 dni temu? " + birthdayIn100DaysOrWas50DaysAgo);
           
        System.out.print("Podaj literę na którą kończy się twoje imię: ");
        char lastLetterOfFirstName = scanner.next().charAt(0);
        boolean lastLetterOfMyNameIsA = 'a' == lastLetterOfFirstName;
        System.out.println("Czy Twoje imię kończy się na literę 'a'? " + lastLetterOfMyNameIsA);
        
        System.out.print("Podaj literę na którą zaczyna się twoje imię: ");  
        char firstLetterOfFirstName = scanner.next().charAt(0);
        System.out.print("Podaj literę na którą zaczyna się twoje nazwisko: ");  
        char firstLetterOfLastName = scanner.next().charAt(0);
        boolean isNameAndSurnameFirstLetterTheSame = firstLetterOfFirstName == firstLetterOfLastName;
        System.out.println("Czy Twoje imię i nazwisko zaczyna się na tą samą literę? " + isNameAndSurnameFirstLetterTheSame);

        // Analogicznie jak we wcześniejszych przykładach zapisz teraz dwa własne warunki i zdania
        // logiczne.
       
    }
}
