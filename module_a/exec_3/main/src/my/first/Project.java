package my.first;

import org.apache.commons.lang3.StringUtils;
import my.first.Text;
import my.second.Printer;

public class Project {

    public static void main(String[] args) {

        String[] words = StringUtils.split(Text.example);
        Printer.print(words);
    }

}