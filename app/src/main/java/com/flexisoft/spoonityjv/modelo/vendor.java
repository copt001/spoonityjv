package com.flexisoft.spoonityjv.modelo;

public class vendor {
    String object;
    int id;
    point_of_sale point_of_sale;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.flexisoft.spoonityjv.modelo.point_of_sale getPoint_of_sale() {
        return point_of_sale;
    }

    public void setPoint_of_sale(com.flexisoft.spoonityjv.modelo.point_of_sale point_of_sale) {
        this.point_of_sale = point_of_sale;
    }
}
