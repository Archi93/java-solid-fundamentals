package encoding;

public class ExtraChars2 {

    public static void main(String[] args) {

        System.out.println("Odliczanie od 1 do 10 na biało:");
        System.out.println("\u2460");   // 1 w białym okręgu
        // Kolejne symbole reprezentujące liczby do 10 włącznie są kolejnymi wartościami w sekwencji.


        System.out.println("Litery alfabetu do A do K w okręgach:");
        System.out.println("\u24B6");   // Litera A w okręgu
        // Kolejne symbole reprezentujące litery do K włącznie są kolejnymi wartościami w sekwencji


        System.out.println("Egipskie hieroglify:");
        System.out.println(Character.toChars(0x130D2));  // Bawół
        // Dowolne 5 hieroglifów z zakresu od 0x130D2 do 0x130FC
    }
}
