package org.mbari.vars.oni.etc;

/*-
 * #%L
 * org.mbari.vars:oni-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

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
