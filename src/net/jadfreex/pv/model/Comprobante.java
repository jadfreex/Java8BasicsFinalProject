package net.jadfreex.pv.model;

import java.io.Serializable;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Comprobante implements Serializable {

    private Tienda store;
    private Cliente customer;

    public Comprobante() {
    }
    
    public Comprobante(Tienda store, Cliente customer) {
        this.store = store;
        this.customer = customer;
    }

    public Tienda getStore() {
        return store;
    }

    public void setStore(Tienda store) {
        this.store = store;
    }

    public Cliente getCustomer() {
        return customer;
    }

    public void setCustomer(Cliente customer) {
        this.customer = customer;
    }

}
