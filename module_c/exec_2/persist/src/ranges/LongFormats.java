package ranges;

public class LongFormats {

    public static void main(String[] args) {

        // SEKCJA 1.
        // Uzupełnij poniższe przykłady wyrażając wartość jako sumę wartości kolejnych pozycji:

        System.out.println("Liczba 6589080978 = ");

        System.out.println("Liczba -1890009075 = ");

        // SEKCJA 2.
        // Postępując podobnie jak dla systemu dzisiętnego wyraź poniższe wartości liczbowe:

        System.out.println("Liczba 101101110110111 = ");         // binarnie

        System.out.println("Liczba 4507056454 = ");              // ósemkowo

        System.out.println("Liczba 101101110110111 = ");         // ósemkowo

        System.out.println("Liczba ABECAD10_5FAD10 = ");         // szesnastkowo

        System.out.println("Liczba 101101110110111 = ");         // szesnastkowo

        // SEKCJA 3.
        // Zapisz maksymalną i minimalną wartość typu long.
        // Skorzystaj z metody pow2 i wiedzy o rozmiarze typu long w pamięci.
        System.out.println("MAX long = " + (pow2(64)) + " " + Long.MAX_VALUE);
        System.out.println("MIN long = -" + -pow2(64) + " " + Long.MIN_VALUE);
    }

    public static long pow16(long p) {
        return (long) Math.pow(16, p);
    }

    public static long pow10(long p) {
        return (long) Math.pow(10, p);
    }

    public static long pow8(long p) {
        return (long) Math.pow(8, p);
    }

    public static long pow2(long p) {
        return (long) Math.pow(2, p);
    }
}
