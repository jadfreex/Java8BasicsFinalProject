package net.jadfreex.pv.logic;

import java.util.Map;
import net.jadfreex.pv.dao.ArticuloDAO;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Contenedor;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class TiendaLogic extends ContenedorLogic {

    private ArticuloDAO articuloDAO;

    public TiendaLogic() {
        super();
        articuloDAO = new ArticuloDAO();
    }

    @Override
    public Contenedor newInstance() {
        Contenedor container = super.newInstance();
        Map<Integer, Articulo> articles = articuloDAO.select();
        container.setArticulos(articles);
        return container;
    }

}
