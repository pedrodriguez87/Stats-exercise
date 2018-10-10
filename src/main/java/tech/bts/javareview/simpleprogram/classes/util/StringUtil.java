package tech.bts.javareview.simpleprogram.classes.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    /** Returns a string made of "s" repeated "n" times.*/
    public static String repeat(String s, int n) {

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += s;
        }
        return result;
    }

    public static String padLeft (String s, int n) {

        return repeat(" ", n - s.length()) + s;
    }


    /** Returns a string cotaining "s" and spaces to the right until the resulting
     * string has length "n" */

    public static String padRight (String s, int n) {

        return s + repeat(" ", n - s.length());
    }

}