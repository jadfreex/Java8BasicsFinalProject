package net.jadfreex.pv.logic;

import java.util.Map;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Contenedor;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class CarritoLogic extends ContenedorLogic {

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
    public Contenedor removeArticle(Contenedor container, Integer index) {
        return super.removeArticle(container, index);
    }

}
