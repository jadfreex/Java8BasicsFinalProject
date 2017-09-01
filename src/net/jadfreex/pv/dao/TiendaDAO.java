package net.jadfreex.pv.dao;

import net.jadfreex.pv.commons.util.RandomUtil;
import net.jadfreex.pv.model.Tienda;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class TiendaDAO {

    public Tienda select(Tienda store) {
        store.setRazonSocial(RandomUtil.getString(20));
        store.setRFC(RandomUtil.getString(10));
        store.setDireccion(RandomUtil.getString(35));
        return store;
    }

}
