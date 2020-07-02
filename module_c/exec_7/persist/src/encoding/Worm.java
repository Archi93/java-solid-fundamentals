package encoding;

public class Worm {

    public static void main(String[] args) throws InterruptedException {

        String HEAD = "   \u2554o o\u2557";

        String BODY = "\u2554\u2550(\u2588\u2588\u2588)\u2550\u2557";

        int counter = 0;

        String[] offsets = { " ", "  ", "   ", "    ", "   ", "  ", " " };

        while (true) {

            System.out.print("\n" + offsets[counter % offsets.length] + HEAD);

            Thread.sleep(100);

            System.out.print("\r" + offsets[counter % offsets.length] + BODY);

            counter++;

        }

    }

}