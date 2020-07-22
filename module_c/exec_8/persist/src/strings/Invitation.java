package strings;

public class Invitation {

    public static void main(String[] args) {

        String sourceText = "[Its] language is as bare as a monk's cell, and as uninviting";
        String computedText = computeThoughts(sourceText);
        System.out.println(computedText);
    }

    /**
     * Metoda computeThoughts wykonuje przekształcenie przekazanej myśli do nowej, lepszej postaci.
     *
     * UWAGA: Szczegóły implementacyjne metody
     *
     * Krok 1:  Znajduje w przekazanym tekście źródłowym pierwsze słowo zaczynające się na literę 'i'.
     *
     * Krok 2.  Wycina znalezione słowo z tekstu źródłowego do późniejszego użycia.
     *
     * Krok 3.  Oblicza długość znalezionego słowa, zwiększa ją czterokrotnie i dodaje do niej 1. Wyliczona wartość
     *          zostaje zapamiętana do późniejszych obliczeń.
     *
     * Krok 4.  Znajduje w tekście źródłowym pierwsze wystąpienie znaku `l` (litera el) i wycina z tekstu źródłowego
     *          fragment od tego znaku (włącznie) i kolejne X znaków (niewłącznie), gdzie X jest równe wartości wyliczonej w Kroku 3.
     *          Wartość zostaje zapamiętana do późniejszego użycia.
     *
     * Krok 5.  Oblicza długość tekstu źródłowego, dzieli ją przez 1.17 i zwiększa o 1. Wyliczona wartość zostaje
     *          zapamiętana do późniejszych obliczeń.
     *
     * Krok 6.  Wycina z tekstu źródłowego fragment zaczynający się od indeksu o wartości Y (gdzie Y to wartość obliczona
     *          w Kroku 5.) oraz kolejnych 2 do potęgi 3-ej znaków. Wartość zostaje zapamiętana do późniejszego użycia
     *
     * Krok 7.  Zwraca połączenie tekstu "Java ", tekstu z Kroku 4., tekstu z Kroku 2., tekstu " ", tekstu z Kroku 6.
                oraz tekstu " \u003B\u0029".
     */
    public static String computeThoughts(String source) {
        int beginOfIWord = source.indexOf("i");
        int endOfIWord = source.indexOf(" ", beginOfIWord);
        
        String firstSubstring = source.substring(beginOfIWord, endOfIWord);
        
        int expandedLengthOfFirstSubstring = (firstSubstring.length() * 4) + 1;
        
        int startOfSecondSubstring = source.indexOf("l");
        String secondSubstring = source.substring(startOfSecondSubstring, startOfSecondSubstring + expandedLengthOfFirstSubstring);
        
        int expandedLegthOfSource = (int)((source.length() / 1.17) + 1);
        
        //System.out.println("expandedLengthOfSource = " + expandedLegthOfSource);
        
        //int beginOfThirdSubstring = source.indexOf(expandedLegthOfSource);
        //int endOfThirdSubstring = source.indexOf(beginOfThirdSubstring, beginOfThirdSubstring + (2 * 2 * 2));
        String thirdSubstring = source.substring(expandedLegthOfSource, expandedLegthOfSource + (2 * 2 * 2) );
        
        String finalString = "Java " + secondSubstring + firstSubstring.concat(" ") + thirdSubstring + " \u003B\u0029";

        return finalString;
    }
}
