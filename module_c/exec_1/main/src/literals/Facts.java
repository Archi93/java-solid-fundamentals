package literals;

public class Facts {

    public static void main(String[] args) {

        // Sekcja 1 - literały liczb całkowitych
        System.out.print("Ile masz lat? ");
        System.out.println();       // Odpowiedzi umieszczaj w wyrażeniu System.out.println pod pytaniem

        System.out.print("Ile metrów to 1 kilometr? ");
        System.out.println(1000);

        System.out.print("Liczba dwa razy mniejsza od -256 to? ");
        System.out.println(-512);

        System.out.print("W którym roku wyszła pierwsza wersja języka Java? ");
        System.out.println(1995);

        System.out.print("Ile komórek jest w Twoim ciele? ");
        System.out.println(2000000000);

        System.out.print("Ile centymetrów jest od Ziemi do Księżyca? ");
        System.out.println(4_000_000_000_000L);

        // Sekcja 2 - literały liczb zmiennoprzecinkowych
        System.out.print("Jak wygląda liczba PI z 2 cyframi po przecinku? ");
        System.out.println(3.14);

        System.out.print("Jak wygląda liczba PI z 20 cyframi po przecinku (mając 64 pozycje w pamięci)? ");
        System.out.println(3.14452144521445214452d);

        System.out.print("Jak wygląda liczba PI z 20 cyframi po przecinku (mając 32 pozycje w pamięci)? ");
        System.out.println(3.14452144521445214452f);

        System.out.print("Ile garnków zajmie 10 krasnoludków, jeżeli w jednym garnku mieszczą się 3 krasnoludki? ");
        System.out.println(10/3.0);

        System.out.print("Jedna bułka kosztuje 1.10. Janek kupił 5 bułek. Ile wydał Janek? ");
        System.out.println(1.10 * 5);

        // Sekcja 3 - literały znakowe
        System.out.print("Jaka jest pierwsza litera Twojego imienia? ");
        System.out.println('a');

        System.out.print("Jaka jest pierwsza litera Twojego nazwiska? ");
        System.out.println('b');

        System.out.print("Jak wygląda symbol dolara? ");
        System.out.println('$');

        System.out.print("Jaki symbol rozpoczyna definicję metody w Javie? ");
        System.out.println('s');

        System.out.print("Jak wygląda symbol 'Copyright'? ");
        System.out.println();

        // Sekcja 4 - literały tekstowe (napisy)
        System.out.print("Jak masz na imię? ");
        System.out.println("Artur");

        System.out.print("Jaki jest Twój ulubiony kolor? ");
        System.out.println("niebieski");

        System.out.print("Jak brzmi pierwszy werset Pana Tadeusza? ");
        System.out.println("nie wiem");

        System.out.print("Twoje trzy ulubione liczby? ");
        System.out.println("1,2,3");

        System.out.print("Współrzędne geograficzne Twojego miasta, to? ");
        System.out.println("52,12 N    32.23W");

        // Sekcja 5 - literały wartości logicznych
        System.out.print("Czym jest prawda? ");
        System.out.println(true);

        System.out.print("Czym jest fałsz? ");
        System.out.println(false);

        System.out.print("Czy liczba 2 jest większa od liczby 3? ");
        System.out.println(false);

        System.out.print("Czy słowo `eukaliptus` ma więcej niż 8 znaków? ");
        System.out.println(true);

        System.out.print("Czy liczba 341 jest podzielna przez 7? ");
        System.out.println(341%7 == 0);
    }
}