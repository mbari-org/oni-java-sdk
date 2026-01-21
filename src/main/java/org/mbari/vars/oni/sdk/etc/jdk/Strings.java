package org.mbari.vars.oni.sdk.etc.jdk;

import java.util.Random;
import java.util.stream.IntStream;

public class Strings {

    private static final String chars           = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random randomGenerator = new Random();

    public static String random(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(randomGenerator.nextInt(chars.length())));
        }
        return sb.toString();
    }


    public static String random(int origin, int bound) {
        var n = randomGenerator.nextInt(origin, bound);
        return random(n);
    }

    /**
     * Change case of a string to init Cap. That is the first letter is capitalized and the rest are lower case.
     * @param s
     *   the string to convert
     * @return
     *   the init cap version of the string
     */
    public static String initCap(String s) {
        var a = s.toLowerCase();
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }
}
