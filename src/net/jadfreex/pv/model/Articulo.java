package net.jadfreex.pv.model;

import java.io.Serializable;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Articulo implements Serializable {

    private Long id;
    private String name;
    private String desc;
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
