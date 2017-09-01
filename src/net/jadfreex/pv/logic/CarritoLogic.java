package net.jadfreex.pv.logic;

import java.util.Map;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Carrito;
import net.jadfreex.pv.model.Contenedor;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class CarritoLogic extends ContenedorLogic<Carrito> {

    @Override
    public Carrito newInstance() {
        Carrito shoppingCard = this.newInstance(Carrito.class);
        return shoppingCard;
    }

    @Override
    public Contenedor addArticle(Contenedor container, Integer index, Articulo article) {
        if(null != container && null != article && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            Articulo aux = articles.get(index);
            if(null != aux) {
                aux.setQuantity(aux.getQuantity() + article.getQuantity());
                return container;
            }
            return super.addArticle(container, index, article);
        }
        return null;
    }

    @Override
    public Contenedor removeArticle(Contenedor container, Integer index, Articulo article) {
        if(null != container && null != article && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            Articulo aux = articles.get(index);
            if(null != aux && article.getQuantity() < aux.getQuantity()) {
                aux.setQuantity(aux.getQuantity() - article.getQuantity());
                return container;
            }
            return super.removeArticle(container, index, article);
        }
        return null;
    }

}
