package literals;

public class Elements2 {

    public static void main(String[] args) {
        // Liczby
        System.out.print("1 - 1 to? ");
        System.out.println(1 - 1);

        System.out.print("1 - 2 to? ");
        System.out.println(1 - 2);

        System.out.print("1 * 1 / 1 to? ");
        System.out.println(1 * 1 / 1);

        System.out.print("Przykład długiej liczby to? ");
        System.out.println(1000100010001000L);

        System.out.print("Liczba z przecinkami to? ");
        System.out.println(987654321.123456789);

        System.out.print("Bardzo duża liczba z przecinkami to? ");
        System.out.println(909090808080707070606060505050404040303030202020101010.987654321);

        System.out.print("Jeszcze jedna duża liczba to? ");
        System.out.println(-1L);

        System.out.print("Prawie jak liczba... ");
        System.out.println(123);

        // Znaki i napisy
        System.out.print("Litera A: ");
        System.out.println((char)65);

        System.out.print("Litera a: ");
        System.out.println('a');

        System.out.print("Znaki xyz: ");
        System.out.println("xyz");

        System.out.print("Twoje ulubione zwierzę? ");
        System.out.println("Komar");

        System.out.print("Litera przed x? ");
        System.out.println('w');

        // Wartości true/false
        System.out.print("Czy 5 jest parzyste? ");
        System.out.println(5 % 2 == 0);

        System.out.print("Czy 5 zmieści się 5 razy w 25? ");
        System.out.println(true);

        System.out.print("Czy 4 * 4 jest równe 8?");
        System.out.print(4 * 4 == 8);
    }
}