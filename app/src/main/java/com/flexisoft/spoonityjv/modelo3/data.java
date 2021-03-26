package com.flexisoft.spoonityjv.modelo3;

import com.flexisoft.spoonityjv.modelo.currency;
import com.flexisoft.spoonityjv.modelo2.catalog;

public class data {
    template template;
    int id;
    com.flexisoft.spoonityjv.modelo.currency currency;
    String name;
    String description;
    String summary;
    String cost;
    String start_date;
    String end_date;
    String available;
    String progress;
    String group;
    catalog catalog;

    public com.flexisoft.spoonityjv.modelo3.template getTemplate() {
        return template;
    }

    public void setTemplate(com.flexisoft.spoonityjv.modelo3.template template) {
        this.template = template;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.flexisoft.spoonityjv.modelo.currency getCurrency() {
        return currency;
    }

    public void setCurrency(com.flexisoft.spoonityjv.modelo.currency currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public com.flexisoft.spoonityjv.modelo2.catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(com.flexisoft.spoonityjv.modelo2.catalog catalog) {
        this.catalog = catalog;
    }
}
