/**
 *
 * @author RK
 * @version 1.0
 */

import edu.duke.*;
public class Part3 {

    //This method returns true if stringa appears at least twice in stringb, otherwise it returns false.
    public boolean twoOccurrences(String stringa, String stringb) {
        int indexStart = stringb.indexOf(stringa);
        System.out.println(stringb.substring(indexStart, indexStart + stringa.length()));
        //checking first occurence
        String stringbMatch = stringb.substring(indexStart, indexStart + stringa.length());
        if (stringa.equals(stringbMatch)) {
            //checking second orrurence
            stringb = stringb.substring(indexStart);
            indexStart = stringb.indexOf(stringa);
            stringbMatch = stringb.substring(indexStart, indexStart + stringa.length());
            if (stringa.equals(stringbMatch)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public void test() {
        System.out.println(twoOccurrences("by","A story by Abby Long"));

    }
}
