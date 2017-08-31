package net.jadfreex.pv.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Contenedor implements Serializable {

    protected Map<Integer, Articulo> articulos;

    public Map<Integer, Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<Integer, Articulo> articulos) {
        this.articulos = articulos;
    }

    public String toString() {
        if(null != this.articulos) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer, Articulo> entry : this.getArticulos().entrySet()) {
                if(null != entry.getValue().getQuantity() && entry.getValue().getQuantity() > 0) {
                    sb.append(entry.getValue())
                            .append("\n");
                }
            }
            return sb.toString();
        }
        return super.toString();
    }

}
