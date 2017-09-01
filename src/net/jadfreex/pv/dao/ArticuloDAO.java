package net.jadfreex.pv.dao;

import java.util.HashMap;
import java.util.Map;
import net.jadfreex.pv.commons.util.RandomUtil;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Tienda;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class ArticuloDAO {

    public Map<Integer, Articulo> select() {
        Map<Integer, Articulo> articulos = new HashMap<>();
        Articulo aux = null;
        for (int i = 0; i < 10; i++) {
            aux = new Articulo();
            aux.setId((long) i);
            aux.setName(RandomUtil.getString(4));
            aux.setDesc(RandomUtil.getString(16));
            aux.setPrice(RandomUtil.getDouble());
            aux.setQuantity(RandomUtil.getInt());
            aux.setHasDiscount(RandomUtil.getBoolean());
            if (aux.getHasDiscount()) {
                aux.setDiscount(RandomUtil.getDoubleMin());
            }
            articulos.put(i, aux);
        }
        //
        return articulos;
    }

}