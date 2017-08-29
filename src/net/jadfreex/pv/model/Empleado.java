package net.jadfreex.pv.model;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Empleado extends Persona {

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public enum Type {
        ADMIN
    }

}
