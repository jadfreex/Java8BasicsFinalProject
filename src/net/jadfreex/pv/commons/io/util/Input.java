package net.jadfreex.pv.commons.io.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import net.jadfreex.pv.commons.util.ParseUtil;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Input {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static Integer getInt() {
        try {
           String str = reader.readLine();
           Integer n = ParseUtil.toInt(str);
           return n;
        } catch (Exception e) {
            System.out.println(String.format("ERROR DE LECTURA: %s", e.getMessage()));
        }
        return null;
    }

    public static String getStr() {
        try {
           String str = reader.readLine();
           str = ParseUtil.toCleanStr(str);
           return str;
        } catch (Exception e) {
            System.out.println(String.format("ERROR DE LECTURA: %s", e.getMessage()));
        }
        return null;
    }

}
