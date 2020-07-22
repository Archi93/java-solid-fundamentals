package strings;

import java.util.*; 

public class Operations {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // ---
        // SEKCJA 1: TWORZENIE I DEKLAROWANIE NAPISÓW
        // ---

        System.out.println("-- Twoje dane identyfikacyjne --\n");
        System.out.print("\tTwoje imię: ");
        System.out.println("Artur");        // Uzupełnij swoim imieniem
        
        System.out.print("Wpisz swoje imię w konsoli: ");
        String name = scanner.nextLine().trim().toLowerCase();
        System.out.println(name);   // Uzupełnij swoim imieniem, ale wykorzystaj zmienną

        System.out.print("\tTwoje nazwisko: ");
        System.out.println("Błaszczyk");   // Uzupełnij swoim nazwiskiem
        
        System.out.print("Wpisz swoje imię w konsoli: ");
        String surname = scanner.nextLine().trim().toLowerCase();
        System.out.println(surname);   // Uzupełnij swoim nazwiskiem, ale wykorzystaj zmienną

        System.out.print("\tTwoje pełne dane: ");
        System.out.println(name + " " + surname);   // Uzupełnij swoim imieniem i nazwiskiem, stosując operator +
        System.out.println(name.concat(" ").concat(surname));   // Uzupełnij swoim imieniem i nazwiskiem, stosując metodę concat

        String fullName = name + " " + surname;
        System.out.println(fullName);   // Uzupełnij swoim imieniem i nazwiskiem, stosując zmienną fullName

        // ---
        // SEKCJA 2: PORÓWNYWANIE NAPISÓW
        // ---

        System.out.println("\n-- Pytania kontrolne --\n");

        // Wykorzystaj zmienne typu boolean do zapisania wyników pytań kontrolnych, jak poniżej
        boolean nameSameAsSurname = name.equals(surname);
        System.out.println("\tCzy Twoje imię jest takie samo jak nazwisko? " + nameSameAsSurname);

        boolean nameIsAleksandra = "Aleksandra".equals(name);
        System.out.println("\tCzy Twoje imię, to \"Aleksandra\"? " + nameIsAleksandra);
        
        boolean nameIsArtur = "Artur" == name;
        System.out.println("\tCzy Twoje imię, to \"Artur\"? " + nameIsArtur);

        boolean nameIsConcatOfAleksAndAndra = name.equals("Aleks".concat("andra"));
        System.out.println("\tCzy Twoje imię, to połączenie słow \"Aleks\" i \"andra\"? " + nameIsConcatOfAleksAndAndra);

        boolean nameIsNotKleofiks =! "Kleofiks".equals(name);
        System.out.println("\tCzy Twoje imię, to nie \"Kleofiks\"? " + nameIsNotKleofiks);

        boolean nameIsBeforeKrzysztof = name.compareTo("Krzysztof") < 0;
        System.out.println("\tCzy Twoje imię jest w słowniku przed \"Krzysztof\"? " + nameIsBeforeKrzysztof);

        boolean surnameBeforeName = surname.compareTo(name) < 0;
        System.out.println("\tCzy Twoje nazwisko jest w słowniku przed Twoim imieniem? " + surnameBeforeName);

        boolean nameCloserPlemieThanSurname = Math.abs(name.compareTo("Plemie")) < Math.abs(surname.compareTo("Plemie"));
        System.out.println("\tCzy Twoje imię jest w słowniku bliżej słowa \"Plemie\" niż Twoje nazwisko? " + nameCloserPlemieThanSurname);

        boolean nameLongerThanSurname = name.length() > surname.length();
        System.out.println("\tCzy Twoje imię jest dłuższe od Twojego nazwiska? " + nameLongerThanSurname);
        
        boolean nameEndsWithLetterA = name.substring(name.length() - 1).equals("a");
        System.out.println("\tCzy Twoje imię kończy się na literę 'a'? " + nameEndsWithLetterA);

        //System.out.println("\tCzy Twoje imię pisane od tyłu i przodu jest takie same? ");

        //System.out.println("\tCzy imię \"Otto\" pisane od tyłu i przodu jest takie same? ");

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

        System.out.println("\tCzy Twoje imię znajduje się w tekście? " + sourceText.contains("Artur"));

        System.out.println("\tCzy Twoje nazwisko znajduje się w tekście? " + sourceText.contains("Błaszczyk"));

        System.out.println("\tPod jakim indeksem pierwszy raz występuje Twoje imię? " + sourceText.indexOf("Artur"));

        System.out.println("\tPod jakim indeksem występuje ostatni raz słowo \"Eureka\"? " + sourceText.lastIndexOf("Eureka"));
        
        System.out.println("\tPod jakim indeksem występuje ostatni raz słowo \"asdfghjkl\"? " + sourceText.lastIndexOf("asdfghjkl"));
        
        System.out.println("\tPod jakim indeksem występuje pierwszy raz słowo \"asdfghjkl\"? " + sourceText.indexOf("asdfghjkl"));

        System.out.println("\tCzy w tekście znajduje się słowo \"Staw\" (bez uwzględnienia wielkości znaków)? " + sourceText.toLowerCase().contains("staw"));

        // ---
        // SEKCJA 4: MODYFIKOWANIE NAPISÓW
        // ---

        // W kolejnych liniach odnosisz się dalej do tekstu w zmiennej sourceText
        // W kolejnych liniach nie deklaruj i nie korzystaj z nowych zmiennych.
        // W wywołaniach System.out.println(...) użyj wyniku odpowiednich metod klasy String.

        System.out.println("\tIle znaczących znaków (bez białych znaków z przodu i tyłu) ma tekst źródłowy? " + sourceText.trim().length());

        System.out.println("\tPierwsza połowa tekstu źródłowego: " + sourceText.substring(0, (sourceText.length() / 2)));

        System.out.println("\tDruga połowa tekstu źródłowego: " + sourceText.substring(sourceText.length() / 2, sourceText.length()));
        
        //System.out.println("\tDruga połowa tekstu źródłowego: " + sourceText.substring(sourceText.length() / 2, sourceText.length() + 1 ));
        //
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 173, end 348, length 347
        //at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
        //at java.base/java.lang.String.substring(String.java:1874)
        //at strings.Operations.main(Operations.java:119)

        System.out.println("\tFragment tekstu zaczynający się od pierwszej litery Twojego imienia: " + sourceText.substring(sourceText.indexOf(name.charAt(0))));

        System.out.println("\tFragment tekstu kończący się na drugą literę Twojego nazwiska: " + sourceText.substring(0, sourceText.indexOf(surname.charAt(1))));
        //Problem z polskimi znakami diakrytycznymi - kwestia kodowania do rozwiązania.

        System.out.println("\tFragment tekstu zaczynający się na pierwszą literę Twojego imienia i kończący na drugą literę Twojego nazwiska: " + 
        sourceText.substring(sourceText.indexOf(name.charAt(0)), sourceText.lastIndexOf(surname.charAt(1))));

        System.out.println("\tPierwsze słowo zaczynające się na ostatnią litere Twojego imienia: " +
        sourceText.substring(sourceText.indexOf(" " + name.charAt(name.length() - 1)) + 1, 
                             sourceText.indexOf(" ", sourceText.indexOf(" " + name.charAt(name.length() - 1)) + 1 )));

        System.out.println("\tPierwsze słowo zaczynające się na pierwszą literę Twojego nazwiska: " +
        sourceText.substring(sourceText.indexOf(" " + surname.charAt(0)) + 1,
                             sourceText.indexOf(" ", sourceText.indexOf(" " + surname.charAt(0)) + 1)));
        
        
        int indexOfFirstSpace = sourceText.indexOf(" ");
        int indexOfSecondSpace = sourceText.indexOf(" ", indexOfFirstSpace + 1);
        int indexOfThirdSpace = sourceText.indexOf(" ", indexOfSecondSpace + 1);
        
        System.out.println("\tTrzecie słowo w tekście: " + sourceText.substring(indexOfSecondSpace, indexOfThirdSpace - 1));
        
    }
}
