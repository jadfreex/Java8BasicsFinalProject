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
    private Double price;
    private Integer quantity;
    private Boolean hasDiscount;
    private Double discount;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "id=" + id + "\t name=" + name + "\t desc=" + desc + "\t price=" + price + "\t quantity=" + quantity + "\t hasDiscount=" + hasDiscount + "\t discount=" + discount;
    }

}
