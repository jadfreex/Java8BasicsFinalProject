package net.jadfreex.pv.model;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Cliente extends Persona {

    private String RFC;
    private Carrito carrito;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

}
