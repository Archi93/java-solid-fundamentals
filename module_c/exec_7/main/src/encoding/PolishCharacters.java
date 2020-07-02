package encoding;

import java.nio.charset.*;

public class PolishCharacters {

    public static void main(String[] args) {

        String polishCharactersTest = "Zażółć gęślą jaźń";

        System.out.println(polishCharactersTest);
        System.out.println(Charset.defaultCharset());
        System.out.println(System.getProperty("file.encoding"));
    }
}
