package com.flexisoft.spoonityjv.modelo;

public class point_of_sale {
    String object;
    int id;
    String name;
    status status;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.flexisoft.spoonityjv.modelo.status getStatus() {
        return status;
    }

    public void setStatus(com.flexisoft.spoonityjv.modelo.status status) {
        this.status = status;
    }
}
