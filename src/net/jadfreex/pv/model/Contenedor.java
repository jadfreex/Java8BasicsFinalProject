package net.jadfreex.pv.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Contenedor implements Serializable {

    protected List<Articulo> articulos;

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

}
