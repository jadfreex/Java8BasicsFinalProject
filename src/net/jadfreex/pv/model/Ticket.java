package net.jadfreex.pv.model;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Ticket extends Comprobante {

    public Ticket() {
    }

    public Ticket(Tienda store, Cliente customer) {
        super(store, customer);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getStore().getData())
                .append(this.getCustomer().getCarrito().getArticulos());
        return sb.toString();
    }

}
