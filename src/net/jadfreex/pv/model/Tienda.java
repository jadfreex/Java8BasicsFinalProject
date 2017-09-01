package net.jadfreex.pv.model;

import java.util.Map;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Tienda extends Contenedor {

    private String razonSocial;
    private String RFC;
    private String direccion;
    private Map<String, Cliente> clientes;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getData() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.razonSocial).append("\n")
                .append("RFC: ").append(this.RFC).append("\n")
                .append("Direccion: ").append(this.direccion).append("\n");
        return sb.toString();
    }
    
}
