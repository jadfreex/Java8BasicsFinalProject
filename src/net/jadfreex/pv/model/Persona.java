package net.jadfreex.pv.model;

import java.io.Serializable;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Persona implements Serializable {

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public String toString() {
        return nombres + " " + apellidoPaterno + " " + apellidoMaterno;
    }

}
