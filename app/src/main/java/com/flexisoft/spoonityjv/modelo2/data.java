package com.flexisoft.spoonityjv.modelo2;

import com.flexisoft.spoonityjv.modelo.currency;
import com.flexisoft.spoonityjv.modelo.status;

import java.util.List;

public class data {
    List<catalogs> catalogs;
    int id;
    com.flexisoft.spoonityjv.modelo.currency currency;
    perk_type perk_type;
    round_policy round_policy;
    String award_amount;
    String max_award_amount;
    String award_parent;
    String start_date;
    String end_date;
    com.flexisoft.spoonityjv.modelo.status status;
    catalog catalog;

    public List<com.flexisoft.spoonityjv.modelo2.catalogs> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<com.flexisoft.spoonityjv.modelo2.catalogs> catalogs) {
        this.catalogs = catalogs;
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

    public com.flexisoft.spoonityjv.modelo2.perk_type getPerk_type() {
        return perk_type;
    }

    public void setPerk_type(com.flexisoft.spoonityjv.modelo2.perk_type perk_type) {
        this.perk_type = perk_type;
    }

    public com.flexisoft.spoonityjv.modelo2.round_policy getRound_policy() {
        return round_policy;
    }

    public void setRound_policy(com.flexisoft.spoonityjv.modelo2.round_policy round_policy) {
        this.round_policy = round_policy;
    }

    public String getAward_amount() {
        return award_amount;
    }

    public void setAward_amount(String award_amount) {
        this.award_amount = award_amount;
    }

    public String getMax_award_amount() {
        return max_award_amount;
    }

    public void setMax_award_amount(String max_award_amount) {
        this.max_award_amount = max_award_amount;
    }

    public String getAward_parent() {
        return award_parent;
    }

    public void setAward_parent(String award_parent) {
        this.award_parent = award_parent;
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

    public com.flexisoft.spoonityjv.modelo.status getStatus() {
        return status;
    }

    public void setStatus(com.flexisoft.spoonityjv.modelo.status status) {
        this.status = status;
    }

    public com.flexisoft.spoonityjv.modelo2.catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(com.flexisoft.spoonityjv.modelo2.catalog catalog) {
        this.catalog = catalog;
    }
}
