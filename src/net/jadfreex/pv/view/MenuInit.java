package net.jadfreex.pv.view;

import net.jadfreex.pv.commons.view.util.Menu;
import net.jadfreex.pv.commons.view.util.MenuExecutor;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class MenuInit extends Menu<Object> {

    @Override
    public Object print() {
        System.out.println("WELCOME TO MY WORLD!");
        MenuExecutor.show(TiendaPrinter.class);
        System.out.println("BYE! BYE!");
        return null;
    }

}
