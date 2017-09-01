package net.jadfreex.pv.logic;

import java.util.HashMap;
import java.util.Map;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Contenedor;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class ContenedorLogic {

    public Contenedor newInstance() {
        Contenedor container = new Contenedor();
        container.setSize(0);
        container.setArticulos(new HashMap<Integer, Articulo>());
        return container;
    }

    public Contenedor addArticle(Contenedor container, Integer index, Articulo article) {
        if(null != container && null != article && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            container.setSize(container.getSize() + article.getQuantity());
            articles.put(index, article);
        }
        return container;
    }

    public Contenedor removeArticle(Contenedor container, Integer index) {
        if(null != container && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            Articulo article = articles.get(index);
            container.setSize(container.getSize() - article.getQuantity());
            articles.remove(index);
        }
        return container;
    }

    public Contenedor removeArticles(Contenedor container, Integer index) {
        if(null != container && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            container.setSize(0);
            articles.clear();
        }
        return container;
    }

    public Articulo getArticle(Contenedor container, Integer index) {
        if(null != container && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            Articulo article = articles.get(index);
            return article;
        }
        return null;
    }

    public Map<Integer, Articulo> getArticles(Contenedor container) {
        if(null != container && null != container.getArticulos())  {
            Map<Integer, Articulo> articles = container.getArticulos();
            return articles;
        }
        return null;
    }

}
