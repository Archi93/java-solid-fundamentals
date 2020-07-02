package strings;

public class Operations {

    public static void main(String[] args) {

        // ---
        // SEKCJA 1: TWORZENIE I DEKLAROWANIE NAPISÓW
        // ---

        System.out.println("-- Twoje dane identyfikacyjne --\n");
        System.out.print("\tTwoje imię: ");
        System.out.println();   // Uzupełnij swoim imieniem

        System.out.println();   // Uzupełnij swoim imieniem, ale wykorzystaj zmienną

        System.out.print("\tTwoje nazwisko: ");
        System.out.println();   // Uzupełnij swoim nazwiskiem

        System.out.println();   // Uzupełnij swoim nazwiskiem, ale wykorzystaj zmienną

        System.out.print("\tTwoje pełne dane: ");
        System.out.println();   // Uzupełnij swoim imieniem i nazwiskiem, stosując operator +
        System.out.println();   // Uzupełnij swoim imieniem i nazwiskiem, stosując metodę concat

        String fullName = "";
        System.out.println(fullName);   // Uzupełnij swoim imieniem i nazwiskiem, stosując zmienną fullName

        // ---
        // SEKCJA 2: PORÓWNYWANIE NAPISÓW
        // ---

        System.out.println("\n-- Pytania kontrolne --\n");

        // Wykorzystaj zmienne typu boolean do zapisania wyników pytań kontrolnych, jak poniżej
        boolean firstNameSameAsLastName = false;
        System.out.println("\tCzy Twoje imię jest takie samo jak nazwisko? " + firstNameSameAsLastName);

        System.out.println("\tCzy Twoje imię, to \"Aleksandra\"? ");

        System.out.println("\tCzy Twoje imię, to połączenie słow \"Aleks\" i \"andra\"? ");

        System.out.println("\tCzy Twoje imię, to nie \"Kleofiks\"? ");

        System.out.println("\tCzy Twoje imię jest w słowniku przed \"Krzysztof\"? ");

        System.out.println("\tCzy Twoje nazwisko jest w słowniku przed Twoim imieniem? ");

        System.out.println("\tCzy Twoje imię jest w słowniku bliżej słowa \"Plemie\" niż Twoje nazwisko? ");

        System.out.println("\tCzy Twoje imię jest dłuższe od Twojego nazwiska? ");

        System.out.println("\tCzy Twoje imię kończy się na literę 'a'? ");

        System.out.println("\tCzy Twoje imię pisane od tyłu i przodu jest takie same? ");

        System.out.println("\tCzy imię \"Otto\" pisane od tyłu i przodu jest takie same? ");

        // ---
        // SEKCJA 3: WYSZUKIWANIE W NAPISACH
        // ---

        System.out.println("\n-- Praca z tekstem --\n");

        String sourceText = "Kilka imion dzieci, które były popularne w Polsce w roku 2018: " +
                "Antoni, Julia, Jakub, Zuzanna, Jan, Zofia, Szymon, Lena, Franciszek, Maja, " +
                "Filip, Hanna, Aleksander, Alicja, Mikołaj, Maria, Wojciech, Aleksandra.\n" +
                "\tTymczasem Archimedes wykrzynął \"Eureka!\" kiedy wymyślił podstawowe prawo hydrostatyki. " +
                "Czy \"Eureka\" nadawałoby się na imię dla dziecka?\n";
        System.out.println("\tTekst źródłowy: \n\n\t" + sourceText);

        // W kolejnych liniach nie deklaruj i nie korzystaj z nowych zmiennych.
        // W wywołaniach System.out.println(...) użyj wyniku odpowiednich metod klasy String.

        System.out.println("\tCzy Twoje imię znajduje się w tekście? ");

        System.out.println("\tCzy Twoje nazwisko znajduje się w tekście? ");

        System.out.println("\tPod jakim indeksem pierwszy raz występuje Twoje imię? ");

        System.out.println("\tPod jakim indeksem występuje ostatni raz słowo \"Eureka\"? ");

        System.out.println("\tCzy w tekście znajduje się słowo \"Staw\" (bez uwzględnienia wielkości znaków)? ");

        // ---
        // SEKCJA 4: MODYFIKOWANIE NAPISÓW
        // ---

        // W kolejnych liniach odnosisz się dalej do tekstu w zmiennej sourceText
        // W kolejnych liniach nie deklaruj i nie korzystaj z nowych zmiennych.
        // W wywołaniach System.out.println(...) użyj wyniku odpowiednich metod klasy String.

        System.out.println("\tIle znaczących znaków (bez białych znaków z przodu i tyłu) ma tekst źródłowy? ");

        System.out.println("\tPierwsza połowa tekstu źródłowego: ");

        System.out.println("\tDruga połowa tekstu źródłowego: ");

        System.out.println("\tFragment tekstu zaczynający się od pierwszej litery Twojego imienia: ");

        System.out.println("\tFragment tekstu kończący się na drugą literę Twojego nazwiska: ");

        System.out.println("\tFragment tekstu zaczynający się na pierwszą literę Twojego imienia i kończący na drugą literę Twojego nazwiska: ");

        System.out.println("\tPierwsze słowo zaczynające się na ostatnią litere Twojego imienia: ");

        System.out.println("\tPierwsze słowo zaczynające się na pierwszą literę Twojego nazwiska: ");

        System.out.println("\tTrzecie słowo w tekście: ");

    }
}
