package literals;

public class Elements {

    public static void main(String[] args) {
        // Liczby
        System.out.print("1 + 1 to? ");
        System.out.println(1 + 1);

        System.out.print("1 + 2 to? ");
        System.out.println(1 + 2);

        System.out.print("1 + 1 + 1 to? ");
        System.out.println(1 + 1 + 1);

        System.out.print("Przykład długiej liczby to? ");
        System.out.println(123_456_789_098_765_432_1L);

        System.out.print("Liczba z przecinkami to? ");
        System.out.println(0.01);

        System.out.print("Bardzo duża liczba z przecinkami to? ");
        System.out.println(123_456_789_890.098_765);

        System.out.print("Jeszcze jedna duża liczba to? ");
        System.out.println(1_000_000_000_000L);

        System.out.print("Prawie jak liczba... ");
        System.out.println(123);

        // Znaki i napisy
        System.out.print("Litera a: ");
        System.out.println('a');

        System.out.print("Litera B: ");
        System.out.println('B');

        System.out.print("Znaki abc: ");
        System.out.println("abc");

        System.out.print("Twoje ulubione imię? ");
        System.out.println("Alf");

        System.out.print("Kolejna litera po x? ");
        System.out.println('y');

        // Wartości true/false
        System.out.print("Czy 7 jest mniejsze od 8? ");
        System.out.println(false);

        System.out.print("Czy 15 jest podzielne przez 5? ");
        System.out.println(15 % 5 == 0);

        System.out.print("Czy 4 / 4 jest równe 1?");
        System.out.println(4 / 4 == 1);
    }
}