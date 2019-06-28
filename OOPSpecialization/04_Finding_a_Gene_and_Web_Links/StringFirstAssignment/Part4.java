/**
 *
 * @author RK
 * @version 1.0
 */

import edu.duke.*;

public class Part4 {

    public static void main(String[] args) {
        String url = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
        URLResource ur = new URLResource(url);

        for (String word : ur.words()) {
            if (word.indexOf("youtube.com") != -1) {
                int indexFirstQuote = word.indexOf("\"");
                int indexLastQuote = word.lastIndexOf("\"");
                //+1 to escape the first quotation mark
                System.out.println(word.substring(indexFirstQuote+1, indexLastQuote));
            }
        }
    }
}
