package encoding;

public class ExtraChars {

    public static void main(String[] args) {

        System.out.println("Symbole do budowania labiryntu:");
        System.out.println("\u2550");   // Pozioma ściana labiryntu
        System.out.println("\u2551");   // Pionowa ściana labiryntu
        System.out.println("\u2554");   // Lewy górny narożnik labiryntu
        // Kolejne symbole reprezentujące ściany labirytnu występują z przesunięciem o 3
        // Wszystkich takich symboli jest jeszcze 8


        System.out.println("Symbole do gry w szachy:");
        System.out.println("\u2654");   // Figura białego króla do szachów
        // Wyświetl pozostałe figury - są to kolejne liczby zapisane w notacji Unicode


        System.out.println("Symbole reprezentujące emotikony:");
        System.out.println(Character.toChars(0x1F600));  // Uśmiechnięty emotikon
        // Wyświetl kolejne 10 znaków
        
        System.out.print((char) 7);
        System.out.print('\u0007');
        System.out.print("\u0007");
        System.out.println(Character.toChars(0x1F56D));
    }
}
