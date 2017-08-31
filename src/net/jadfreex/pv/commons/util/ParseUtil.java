package net.jadfreex.pv.commons.util;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class ParseUtil {

    synchronized public static Integer toInt(String str) {
        if(null != str) {
            try {
                str = str.trim();
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println(String.format("CADENA NO VALIDA [%s]: %s", str, e.getMessage()));
            }
        }
        return 0;
    }

    synchronized public static Long toLong(String str) {
        if(null != str) {
            try {
                str = str.trim();
                return Long.parseLong(str);
            } catch (Exception e) {
                System.out.println(String.format("CADENA NO VALIDA [%s]: %s", str, e.getMessage()));
            }
        }
        return 0L;
    }

    synchronized public static String toCleanStr(String str) {
        if(null != str) {
            return str.trim();
        }
        return null;
    }

}
