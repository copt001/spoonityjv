package com.flexisoft.spoonityjv.modelo;

import java.util.List;

public class loyalty_balance {
    List<data> data;
    String page_size;
    String count;
    String page;

    public List<com.flexisoft.spoonityjv.modelo.data> getData() {
        return data;
    }

    public void setData(List<com.flexisoft.spoonityjv.modelo.data> data) {
        this.data = data;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
