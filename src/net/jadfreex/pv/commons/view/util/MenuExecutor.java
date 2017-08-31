package net.jadfreex.pv.commons.view.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class MenuExecutor {
    
    synchronized public static void show(Class<? extends Menu> clazz) {
        Menu menu;
        try {
            menu = clazz.newInstance();
            menu.print();
        } catch (Exception e) {
            System.out.println(String.format("ERROR AL CREAR EL MENU: %s", e.getMessage()));
        }
    }
    
}
