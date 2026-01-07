package org.mbari.vars.oni.etc;

import java.util.Random;

public class Strings {

    private static final String chars  = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random random = new Random();

    /**
     * Generate a random string of the given length using alphanumeric characters.
     * @param length The length of the random string
     * @return A random string of the given length
     */
    public static String random(int length)  {
        var idx = random.nextInt(chars.length());
        var sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            idx = random.nextInt(chars.length());
            sb.append(chars.charAt(idx));
        }
        return sb.toString();
    }

    /**
     * Generate a random string of the given length using alphanumeric characters.
     * @param origin The minimum length of the random string
     * @param bound The maximum length of the random string
     * @return A random string of the given length
     */
    public static String random(int origin, int bound) {
        var i = random.nextInt(origin, bound);
        return random(i);
    }

}
