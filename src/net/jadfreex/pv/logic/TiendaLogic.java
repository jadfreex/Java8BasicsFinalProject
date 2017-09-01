package net.jadfreex.pv.logic;

import java.util.Map;
import net.jadfreex.pv.dao.ArticuloDAO;
import net.jadfreex.pv.dao.TiendaDAO;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Cliente;
import net.jadfreex.pv.model.Contenedor;
import net.jadfreex.pv.model.Ticket;
import net.jadfreex.pv.model.Tienda;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class TiendaLogic extends ContenedorLogic<Tienda> {

    private TiendaDAO tiendaDAO;
    private ArticuloDAO articuloDAO;

    public TiendaLogic() {
        super();
        this.articuloDAO = new ArticuloDAO();
        this.tiendaDAO = new TiendaDAO();
    }

    public Tienda newInstance() {
        Tienda tienda = super.newInstance(Tienda.class);
        tienda = this.tiendaDAO.select(tienda);
        Map<Integer, Articulo> articles = articuloDAO.select();
        tienda.setArticulos(articles);
        return tienda;
    }

    @Override
    public Contenedor addArticle(Contenedor container, Integer index, Articulo article) {
        if (null != container && null != article && null != container.getArticulos()) {
            Map<Integer, Articulo> articles = container.getArticulos();
            Articulo aux = articles.get(index);
            if (null != aux) {
                aux.setQuantity(aux.getQuantity() + article.getQuantity());
                return container;
            }
            return super.addArticle(container, index, article);
        }
        return null;
    }

    @Override
    public Contenedor removeArticle(Contenedor container, Integer index, Articulo article) {
        if (null != container && null != article && null != container.getArticulos()) {
            Map<Integer, Articulo> articles = container.getArticulos();
            Articulo aux = articles.get(index);
            if (null != aux && article.getQuantity() < aux.getQuantity()) {
                aux.setQuantity(aux.getQuantity() - article.getQuantity());
                return container;
            }
            return super.removeArticle(container, index, article);
        }
        return null;
    }

    public Ticket sell(Tienda store, Cliente customer) {
        Ticket ticket = null;
        if (null != store && null != customer && null != customer.getCarrito()
                && null != customer.getCarrito().getArticulos()
                && !customer.getCarrito().getArticulos().isEmpty()) {
            
            ticket = new Ticket(store, customer);
        }
        return ticket;
    }

}
