package encoding;

import java.nio.charset.*;

public class PolishCharactersWindows {

    public static void main(String[] args) {

        String polishCharactersTest = "Za¿ó³æ gêœl¹ jaŸñ";

        System.out.println(polishCharactersTest);
        System.out.println(Charset.defaultCharset());
        System.out.println(System.getProperty("file.encoding"));
    }
}