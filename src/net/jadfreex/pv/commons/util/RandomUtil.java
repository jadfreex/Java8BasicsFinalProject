package net.jadfreex.pv.commons.util;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class RandomUtil {
    
    private static final String ABC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz";
    private static final Integer L = ABC.length();

    private static SecureRandom random = new SecureRandom();

    synchronized public static Character getChar() {
        return ABC.charAt(random.nextInt(L));
    }

    synchronized public static String getString(int l) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            sb.append(getChar());
        }
        return sb.toString();
    }

    synchronized public static Integer getInt() {
        return random.nextInt(10);
    }

    synchronized public static Long getLong() {
        return random.nextLong();
    }

    synchronized public static Double getDouble() {
        return Math.floor((random.nextDouble() * 1000.0) * 100.0)/100.0;
    }

    synchronized public static Double getDoubleMin() {
        return Math.floor((0.01 + random.nextDouble()) * 100.0)/100.0;
    }

    synchronized public static Boolean getBoolean() {
        return random.nextBoolean();
    }

}
