package pl.honestit.demo.utils;

import java.net.*;
import java.net.http.*;

public class QuoteTranslator {
    
    public static String translate(String quote) {
      
            try{
            String content = RequestHelper.getContent("https://www.tlumaczangielskopolski.pl/wp-content/themes/translatica/inc/translate/translator.php?from=en&to=pl&text=" + URLEncoder.encode(quote, "UTF-8"));
            return getTranslation(content);
            } catch (Exception e) {
                return "";
            }
    }
    
    private static String getTranslation (String content) {
        int indexOfBracketStart = content.indexOf("[");
        int indexOfBracketStop = content.lastIndexOf("]");
        return content.substring(indexOfBracketStart + 2, indexOfBracketStop - 1);       
    }

} 