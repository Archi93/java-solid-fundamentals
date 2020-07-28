package conditionals;

import java.util.Random;

public class Decisions {

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------
        // Zapisz poniższe linie wewnątrz instrukcji warunkowych.
        // W pierwszej linii wykorzystaj wartość true, aby linia zawsze się wyświetlała
        // W drugiej linii wykorzystaj wartość false, aby linia nigdy się nie wyświetlała

        System.out.println("Prawda zawsze wyjdzie na jaw");
        System.out.println("Fałsz pozostanie ukryty");

        // -----------------------------------------------------------------------------------------
        // Wykorzystaj instrukcje warunkową, aby poniższy kod wyświetlał komunikat
        // o pełnoletności tylko, gdy wylosowano 18 lub więcej lat.

        Random r = new Random();
        int age = 10 + r.nextInt(20);
        System.out.println("Masz " + age + " lat");
        System.out.println("Jesteś pełnoletni");

        // ----------------------------------------------------------------------------------------
        // Wykorzystaj instrukcje warunkowe if, aby komunikaty pojawiały się przy spełnieniu
        // warunków, o których mowa
        int myMumAge = 50 + r.nextInt(20);
        int myDadAge = 50 + r.nextInt(20);

        System.out.println("Mama ma " + myMumAge + " lat");
        System.out.println("Tata ma " + myDadAge + " lat");
        System.out.println("Moi rodzice są już na emeryturze");
        System.out.println("Moja mama jest już na emeryturze");
        System.out.println("Mój tata jest już na emeryturze");
        System.out.println("Moi rodzice nie są jeszcze na emeryturze");

        // ----------------------------------------------------------------------------------------
        // Fragment poniżej jest podobny do poprzedniego. Wykorzystaj jednak teraz instrukcje if else

        myMumAge = 50 + r.nextInt(20);
        myDadAge = 50 + r.nextInt(20);

        System.out.println("Mama ma " + myMumAge + " lat");
        System.out.println("Tata ma " + myDadAge + " lat");
        System.out.println("Moi rodzice są już na emeryturze");
        System.out.println("Moja mama jest już na emeryturze");
        System.out.println("Mój tata jest już na emeryturze");
        System.out.println("Moi rodzice nie są jeszcze na emeryturze");
    }
}
