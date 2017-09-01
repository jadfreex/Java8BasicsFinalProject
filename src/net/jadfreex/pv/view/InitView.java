package net.jadfreex.pv.view;

import net.jadfreex.pv.commons.view.util.View;
import net.jadfreex.pv.commons.view.util.ViewExecutor;
import net.jadfreex.pv.util.Messages;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class InitView extends View<Object> {

    @Override
    public Object print() {
        System.out.println(Messages.WELCOME_MSG);
        ViewExecutor.show(TiendaView.class);
        System.out.println(Messages.BYE_MSG);
        return null;
    }

}
