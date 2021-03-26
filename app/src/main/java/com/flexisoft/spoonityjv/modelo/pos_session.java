package com.flexisoft.spoonityjv.modelo;

import java.util.List;

public class pos_session {
    int id;
    String object;
    String hash;
    String date_created;
    String date_updated;
    status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    public com.flexisoft.spoonityjv.modelo.status getStatus() {
        return status;
    }

    public void setStatus(com.flexisoft.spoonityjv.modelo.status status) {
        this.status = status;
    }

}
