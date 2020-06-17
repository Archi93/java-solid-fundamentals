package arithmetics;

public class Basics {

    public static void main(String[] args) {
        // Część 1.
        // Korzystając z zaproponowanych operatorów zapisz wyrażenie zwracające oczekiwany rezultat.
        // W operacjach nie używaj liczby 1 i 0 chyba, że zostało to inaczej wskazane
        System.out.print("Wykorzystaj 1 raz '+' aby uzyskać liczbę 3. Twój wynik: ");
        System.out.println(-1 + 4);

        System.out.print("Wykorzystaj 1 raz '-' aby uzyskać liczbę 13. Twój wynik: ");
        System.out.println(15 - 2);

        System.out.print("Wykorzystaj 1 raz '*' aby uzyskać liczbę 27. Twój wynik: ");
        System.out.println(3 * 9);

        System.out.print("Wykorzystaj 1 raz '/' aby uzyskać liczbę 6,5. Twój wynik: ");
        System.out.println(13.0 / 2);

        System.out.print("Wykorzystaj 1 raz '/' aby uzyskać liczbę 2,5. Twój wynik: ");
        System.out.println(5.0 / 2);

        System.out.print("Wykorzystaj 1 raz '%` aby usykać liczbę 5. Twój wynik: ");
        System.out.println(35 % 6);

        System.out.print("Wykorzystaj 2 razy '+' aby uzyskać liczbę 5. Twój wynik: ");
        System.out.println(2 + 2 + 1);

        System.out.print("Wykorzystaj 3 razy '-' aby uzyskać liczbę 13. Twój wynik: ");
        System.out.println(20 - 2 - 5);

        System.out.print("Wykorzystaj 2 razy '*' aby uzyskać liczbę 30,6. Twój wynik: ");
        System.out.println(15.3 * 2 * 1);

        System.out.print("Wykorzystaj 3 razy '/' aby uzyskać liczbę 4. Twój wynik: ");
        System.out.println(256 / 4 / 4 / 4);

        System.out.print("Wykorzystaj 2 razy '%' aby uzyskać liczbę 7. Twój wynik: ");
        System.out.println(31 % 16 % 8);

        // Część 2.
        // W oparciu o zapisane działanie podaj ich wynik
        System.out.print("-5 + 4 = ");
        System.out.println(-1);
        System.out.println(-5 + 4);

        System.out.print("7 - 17 = ");
        System.out.println(-10);
        System.out.println(7 - 17);

        System.out.print("3 * 14 = ");
        System.out.println(42);
        System.out.println(3 * 14);

        System.out.print("8 / 1f = ");
        System.out.println(8.0);
        System.out.println(8 / 1f);

        System.out.print("7 / 17 = ");
        System.out.println(0);
        System.out.println(7 / 17);

        System.out.print("7 % 17 = ");
        System.out.println(7);
        System.out.println(7 % 17);

        System.out.print("5 + 10 + 3 = ");
        System.out.println(18);
        System.out.println(5 + 10 + 3);

        System.out.print("13 - 12 - 18 = ");
        System.out.println(-17);
        System.out.println(13 - 12 - 18);

        System.out.print("4 * 8 * -5 = ");
        System.out.println(-160);
        System.out.println(4 * 8 * -5);

        System.out.print("9 / 4 / 0.5 = ");
        System.out.println(4.0);
        System.out.println(9 / 4 / 0.5);

        System.out.print("9 % 2 % 3 = ");
        System.out.println(1);
        System.out.println(9 % 2 % 3);
        
        System.out.println(2_000_000_000L + 500_000_000d);
        

        // Część 3.
        // Po uzupełnieniu wartości dopisz do każdego działania linię System.out.println,
        // w której użyjesz wyrażenia z działania aby zweryfikować poprawność Twojego wyniku
        System.out.print("-5 + 4 = ");
        System.out.println(-1);
        System.out.println(-5 + 4);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);
    }

}