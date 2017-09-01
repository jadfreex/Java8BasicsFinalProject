package net.jadfreex.pv.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.jadfreex.pv.commons.io.util.Input;
import net.jadfreex.pv.commons.util.RandomUtil;
import net.jadfreex.pv.commons.view.util.View;
import net.jadfreex.pv.commons.view.util.ViewExecutor;
import net.jadfreex.pv.logic.CarritoLogic;
import net.jadfreex.pv.logic.TiendaLogic;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Carrito;
import net.jadfreex.pv.model.Contenedor;
import net.jadfreex.pv.model.Tienda;
import net.jadfreex.pv.util.Constantes;
import net.jadfreex.pv.util.Messages;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class TiendaView extends View<Carrito> {

    private TiendaLogic tiendaLogic;
    private Contenedor tienda;
    private CarritoLogic carritoLogic;
    private Contenedor carrito;

    public TiendaView() {
        tiendaLogic = new TiendaLogic();
        tienda = tiendaLogic.newInstance();
        carritoLogic = new CarritoLogic();
        carrito = carritoLogic.newInstance();
    }

    @Override
    public Carrito print() {
        //
        Articulo article;
        int oper;
        Integer id;
        int num;
        while (true) {
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++");
            //
            System.out.println(Messages.INTRODUCE_OP);
            System.out.println(String.format(Messages.ADD_CAR, Constantes.OP_ADD));
            System.out.println(String.format(Messages.REMOVE_CAR, Constantes.OP_REMOVE));
            System.out.println(String.format(Messages.VIEW_CAR, Constantes.OP_VIEW));
            System.out.println(String.format(Messages.END_CAR, Constantes.OP_EXIT));
            oper = Input.getInt();
            //
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n");
            //
            if(Constantes.OP_EXIT == oper) {
                break;
            }
            //
            switch (oper) {
                case Constantes.OP_ADD:
                    System.out.println(this.tienda);
                    System.out.println(Messages.SELECT_PRODUCT);
                    id = Input.getInt();
                    System.out.println(Messages.INPUT_QUANTITY);
                    num = Input.getInt();
                    article  = new Articulo(this.tiendaLogic.getArticle(this.tienda, id));
                    article.setQuantity(num);
                    this.carritoLogic.addArticle(this.carrito, id, article);
                    break;
                case Constantes.OP_REMOVE:
                    System.out.println(this.carrito);
                    System.out.println(Messages.SELECT_PRODUCT);
                    id = Input.getInt();
                    System.out.println(Messages.INPUT_QUANTITY);
                    num = Input.getInt();
                    break;
                case Constantes.OP_VIEW:
                    System.out.println(this.carrito);
                case Constantes.OP_EXIT:
                    break;
                default:
                    System.out.println(Messages.INVALID_OP);
            }
        }
        //
//        Map<Integer, Articulo> articulos = new HashMap<>();
//        for (int i = 0; i < cantidad.length; i++) {
//            if(cantidad[i] > 0) {
//                this.carritoLogic.addArticle(carrito, i, this.tienda.getArticulos().get(i));
//            }
//        }
        //
//        this.carrito.setArticulos(articulos);
        //
        Carrito shop = (Carrito)carrito;
        System.out.println(shop);
        return shop;
    }

}
