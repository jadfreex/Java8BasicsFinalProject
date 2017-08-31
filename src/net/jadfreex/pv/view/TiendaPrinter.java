package net.jadfreex.pv.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.jadfreex.pv.commons.io.util.Input;
import net.jadfreex.pv.commons.util.RandomUtil;
import net.jadfreex.pv.commons.view.util.Menu;
import net.jadfreex.pv.commons.view.util.MenuExecutor;
import net.jadfreex.pv.model.Articulo;
import net.jadfreex.pv.model.Carrito;
import net.jadfreex.pv.model.Tienda;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class TiendaPrinter extends Menu<Carrito> {

    private Tienda tienda;

    public TiendaPrinter() {
        this.tienda = new Tienda();
        //
        Map<Integer, Articulo> articulos = new HashMap<>();
        Articulo aux = null;
        for (int i = 0; i < 10; i++) {
            aux = new Articulo();
            aux.setId((long)i);
            aux.setName(RandomUtil.getString(4));
            aux.setDesc(RandomUtil.getString(16));
            aux.setPrice(RandomUtil.getDouble());
            aux.setQuantity(RandomUtil.getInt());
            aux.setHasDiscount(RandomUtil.getBoolean());
            if(aux.getHasDiscount()) {
                aux.setDiscount(RandomUtil.getDoubleMin());
            }
            articulos.put(i, aux);
        }
        //
        this.tienda.setArticulos(articulos);
    }

    @Override
    public Carrito print() {
        //
        int[] cantidad = new int[this.tienda.getArticulos().size()];
        int oper;
        Integer id;
        int num;
        while (true) {
            //
            System.out.println("INTRODUCE LA OPERACION");
            System.out.println("1: Agregar al carrito");
            System.out.println("2: Quitar del carrito");
            System.out.println("-1: Finalizar");
            oper = Input.getInt();
            //
            if(-1 == oper) {
                break;
            }
            //
            switch (oper) {
                case 1:
                    System.out.println(this.tienda);
                    System.out.println("SELECCIONA EL PRODUCTO");
                    id = Input.getInt();
                    System.out.println("INTRODUCE CANTIDAD");
                    num = Input.getInt();
                    cantidad[id] += num;
                    break;
                case 2:
                    for (int i = 0; i < cantidad.length; i++) {
                        System.out.println(String.format("%s\t|\t%s", i, cantidad));
                    }
                    System.out.println("SELECCIONA EL PRODUCTO");
                    id = Input.getInt();
                    System.out.println("INTRODUCE CANTIDAD");
                    num = Input.getInt();
                    cantidad[id] -= num;
                    break;
                case -1:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");;
            }
        }
        //
        Map<Integer, Articulo> articulos = new HashMap<>();
        for (int i = 0; i < cantidad.length; i++) {
            if(cantidad[i]>0) {
                articulos.put(i, this.tienda.getArticulos().get(i));
            }
        }
        //
        Carrito carrito = new Carrito();
        carrito.setArticulos(articulos);
        //
        System.out.println(carrito);
        return carrito;
    }

}
