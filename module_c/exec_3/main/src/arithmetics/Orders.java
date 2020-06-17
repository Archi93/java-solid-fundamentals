package arithmetics;

public class Orders {

    public static void main(String[] args) {
        // Część 1.
        // Korzystając z zaproponowanych operatorów zapisz wyrażenie zwracające oczekiwany rezultat.
        // W operacjach nie używaj liczby 1 i 0 chyba, że zostało to inaczej wskazane
        System.out.print("Wykorzystaj 1 raz '+' i 1 raz '-' aby uzyskać liczbę 7.0. Twój wynik: ");
        System.out.println(-5 + 12.0);

        System.out.print("Wykorzystaj 1 raz '-' i 2 razy '+' aby uzyskać liczbę 72. Twój wynik: ");
        System.out.println(-80 + 80 + 72);

        System.out.print("Wykorzystaj 1 raz '*' i 1 raz '/' aby uzyskać liczbę 4. Twój wynik: ");
        System.out.println(4 * 4 / 4);

        System.out.print("Wykorzystaj 2 razy '/' i raz '*' aby uzyskać liczbę 6.25. Twój wynik: ");
        System.out.println(5.0 / 2 / 2 * 5);

        System.out.print("Wykorzystaj 1 raz '/' i 1 raz '+' aby uzyskać liczbę 11. Twój wynik: ");
        System.out.println(100 / 10 + 1);

        System.out.print("Wykorzystaj 1 raz '%` i raz '*' aby usykać liczbę 9.0. Twój wynik: ");
        System.out.println(12 % 10 * 4.5);

        System.out.print("Wykorzystaj 2 razy '+' i 2 razy '*' aby uzyskać liczbę 8.2. Twój wynik: ");
        System.out.println(1.1 + 1.1 + 1.5 * 2 * 2);

        System.out.print("Wykorzystaj 1 raz '-', 1 raz '+' i 1 raz '/' aby uzyskać liczbę 8. Twój wynik: ");
        System.out.println(- 5 + 26 / 2);
 
        System.out.print("Wykorzystaj 1 raz '+', 1 raz '*', 1 raz '+' i 1 raz '*' aby uzyskać liczbę 17. Twój wynik: ");
        System.out.println( 9 + 2 * 2 + 2 * 2 );

        System.out.print("Wykorzystaj 3 razy '/' i raz '-' aby uzyskać liczbę 5. Twój wynik: ");
        System.out.println(120 / 3 / 2 / 2 - 5);

        System.out.print("Wykorzystaj 2 razy '%', 1 raz '-' i 2 razy '+' aby uzyskać liczbę 4.5. Twój wynik: ");
        System.out.println(15 % 4 % 2 - 5 + 4 + 4.5);

        // Część 2.
        // W oparciu o zapisane działanie podaj ich wynik
        System.out.print("3 + 8 - 5 = ");
        System.out.println(6);

        System.out.print("-20 - 20 + 40 = ");
        System.out.println();

        System.out.print("4 * 2 + 2 = ");
        System.out.println();

        System.out.print("8 + 2 * 3.5 = ");
        System.out.println();

        System.out.print("18 * 0.5 - 6 / 4 = ");
        System.out.println();

        System.out.print("10 + 3. * 2 = ");
        System.out.println();

        System.out.print("5 * (5 - 5) - (5 * 5) = ");
        System.out.println();

        System.out.print("13 / (12 * 1.0) = ");
        System.out.println();

        System.out.print("9 * (8 % 3) / 9 * ---1 = ");
        System.out.println();

        // Część 3.
        // Po uzupełnieniu wartości dopisz do każdego działania linię System.out.println,
        // w której użyjesz wyrażenia z działania aby zweryfikować poprawność Twojego wyniku
        System.out.print("3 + 8 - 5 = ");
        System.out.println(6);
        System.out.println(3 + 8 - 5);

    }
}
