package net.jadfreex.pv.dao;

import java.util.HashMap;
import java.util.Map;
import net.jadfreex.pv.commons.util.RandomUtil;
import net.jadfreex.pv.model.Cliente;
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
        Map<String, Cliente> clientes = new HashMap<>();
        //
        Cliente customer = new Cliente();
        customer.setNombre(RandomUtil.getString(10));
        customer.setApellidoPaterno(RandomUtil.getString(10));
        customer.setApellidoMaterno(RandomUtil.getString(10));
        customer.setRFC("ABC123");
        clientes.put(customer.getRFC(), customer);
        //
        return store;
    }

}
