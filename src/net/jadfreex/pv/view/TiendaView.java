package net.jadfreex.pv.view;

import net.jadfreex.pv.commons.io.util.Input;
import net.jadfreex.pv.commons.view.util.View;
import net.jadfreex.pv.logic.CarritoLogic;
import net.jadfreex.pv.logic.ContenedorLogic;
import net.jadfreex.pv.logic.TiendaLogic;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Carrito;
import net.jadfreex.pv.model.Cliente;
import net.jadfreex.pv.model.Contenedor;
import net.jadfreex.pv.model.Ticket;
import net.jadfreex.pv.model.Tienda;
import net.jadfreex.pv.util.Constantes;
import net.jadfreex.pv.util.Messages;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class TiendaView extends View<Carrito> {

    private TiendaLogic tiendaLogic;
    private Tienda tienda;
    private CarritoLogic carritoLogic;
    private Carrito carrito;

    public TiendaView() {
        //
        tiendaLogic = new TiendaLogic();
        tienda = tiendaLogic.newInstance();
        //
        carritoLogic = new CarritoLogic();
        carrito = carritoLogic.newInstance();
    }

    @Override
    public Carrito print() {
        //SHOPPING CAR
        int oper;
        while (true) {
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++");
            //
            System.out.println(Messages.INTRODUCE_OP);
            System.out.println(String.format(Messages.ADD_CAR, Constantes.OP_ADD));
            if(this.carrito.getSize() > 0) {
                System.out.println(String.format(Messages.REMOVE_CAR, Constantes.OP_REMOVE));
                System.out.println(String.format(Messages.VIEW_CAR, Constantes.OP_VIEW));
            }
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
                    this.transfer(this.tienda, this.tiendaLogic, this.carrito, this.carritoLogic);
                    break;
                case Constantes.OP_REMOVE:
                    this.transfer(this.carrito, this.carritoLogic, this.tienda, this.tiendaLogic);
                    break;
                case Constantes.OP_VIEW:
                    System.out.println(this.carrito);
                case Constantes.OP_EXIT:
                    break;
                default:
                    System.out.println(Messages.INVALID_OP);
            }
        }
        if(this.carrito.getSize() > 0) {
            //CTE
            Cliente cte = new Cliente();
            cte.setCarrito(this.carrito);
            //TICKET
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++");
            Ticket ticket = this.tiendaLogic.sell(this.tienda, cte);
            System.out.println(ticket);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n");
            //FACTURA
            System.out.println(Messages.PRINT_BILL);
            System.out.println(Messages.PRINT_BILL_YES);
        }
        return carrito;
    }

    private void transfer(Contenedor origen, ContenedorLogic logicOrigen,
            Contenedor destino, ContenedorLogic logicDestino) {

        System.out.println(origen);
        //
        System.out.println(Messages.SELECT_PRODUCT);
        Integer id = Input.getInt();
        System.out.println(Messages.INPUT_QUANTITY);
        Integer num = Input.getInt();
        //
        Articulo article  = new Articulo(logicOrigen.getArticle(origen, id));
        article.setQuantity(num);
        //
        logicDestino.addArticle(destino, id, article);
        logicOrigen.removeArticle(origen, id, article);
    }

}
