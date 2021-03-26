package com.flexisoft.spoonityjv.modelo;

import java.util.List;

public class expiring {

    List<data> data;
    String page_size;
    String count;
    String page;

    public class data {
        String amount;
        String date;
    }

    public List<expiring.data> getData() {
        return data;
    }

    public void setData(List<expiring.data> data) {
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
