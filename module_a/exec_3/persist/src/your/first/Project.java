package your.first;

import your.second.*;
import org.apache.commons.lang3.StringUtils;

public class Project {

    public static void main(String[] args) {

        String[] words = StringUtils.split(Text.example);
        Printer.print(words);
    }
}