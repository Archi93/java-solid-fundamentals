package ranges;

public class Formats {

    public static void main(String[] args) {

        // SEKCJA 1.
        // Wyrażanie wartości liczbowych przy użyciu sumy poszczególnych cyfr (system dziesiętny);

        System.out.println("Liczba 9 = " + (9*1 ));
        System.out.println("Liczba 9 = " + (9*Math.pow(10,0)));

        System.out.println("Liczba 107 = " + (1*100 + 0*10 + 7*1));
        System.out.println("Liczba 107 = " + (1*pow10(2) + 0 * pow10(1) + 7*pow10(0)));

        // Uzupełnij poniższe przykłady analogicznie jak dwa powyższe, korzystając z jednej z dwóch
        // wersji wyliczania wartości

        System.out.println("Liczba 65 = " + (6*10 + 5*1));

        System.out.println("Liczba 145 = " + (1*pow10(2) + 4 * pow10(1) + 5 * pow10(0)));

        System.out.println("Liczba 2590013 = ");

        System.out.println("Liczba -67 = " + (-6 * pow10(1) - 7 * pow10(0)));

        System.out.println("Liczba 101101 = ");

        // SEKCJA 2.
        // Postępując podobnie jak dla systemu dzisiętnego wyraź poniższe wartości liczbowe:

        System.out.println("Liczba 101101 = ");         // binarnie

        System.out.println("Liczba 111000111 = ");      // binarnie

        System.out.println("Liczba 4507 = ");           // ósemkowo

        System.out.println("Liczba 777333 = ");         // ósemkowo

        System.out.println("Liczba 101101 = ");         // ósemkowo

        System.out.println("Liczba 4F = ");             // szesnastkowo

        System.out.println("Liczba 101101 = ");         // szesnastkowo

        System.out.println("Liczba abCDef = ");         // szesnastkowo

        // SEKCJA 3.
        // Zapisz maksymalną i minimalną wartość typu int.
        // Skorzystaj z metody pow2 i wiedzy o rozmiarze typu int w pamięci.
        System.out.println("MAX int = " + (pow2(32) - 1) + " " + Integer.MAX_VALUE);
        System.out.println("MIN int = -" + pow2(32) + " " + Integer.MIN_VALUE);
        System.out.println("MAX double = " + Double.MAX_VALUE);
        System.out.println("MIN double = -" + Double.MIN_VALUE);
    }

    public static int pow16(int p) {
        return (int) Math.pow(16, p);
    }

    public static double pow10(int p) {
        return Math.pow(10, p);
    }

    public static int pow8(int p) {
        return (int) Math.pow(8, p);
    }

    public static int pow2(int p) {
        return (int) Math.pow(2, p);
    }
}
