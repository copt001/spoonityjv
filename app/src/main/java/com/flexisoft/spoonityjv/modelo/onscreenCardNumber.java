package com.flexisoft.spoonityjv.modelo;

import com.flexisoft.spoonityjv.modelo2.pos_session;

import java.util.List;

public class onscreenCardNumber {

    com.flexisoft.spoonityjv.modelo2.pos_session   pos_session;
    user user;
    List<favourite_items> favourite_items;
    reload reload;
    String favorite;
    String last_visit;
    loyalty_balance loyalty_balance;
    rules rules;
    quick_pay_balance quick_pay_balance;

    public com.flexisoft.spoonityjv.modelo2.pos_session getPos_session() {
        return pos_session;
    }

    public void setPos_session(com.flexisoft.spoonityjv.modelo2.pos_session pos_session) {
        this.pos_session = pos_session;
    }

    public com.flexisoft.spoonityjv.modelo.user getUser() {
        return user;
    }

    public void setUser(com.flexisoft.spoonityjv.modelo.user user) {
        this.user = user;
    }

    public List<com.flexisoft.spoonityjv.modelo.favourite_items> getFavourite_items() {
        return favourite_items;
    }

    public void setFavourite_items(List<com.flexisoft.spoonityjv.modelo.favourite_items> favourite_items) {
        this.favourite_items = favourite_items;
    }

    public com.flexisoft.spoonityjv.modelo.reload getReload() {
        return reload;
    }

    public void setReload(com.flexisoft.spoonityjv.modelo.reload reload) {
        this.reload = reload;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getLast_visit() {
        return last_visit;
    }

    public void setLast_visit(String last_visit) {
        this.last_visit = last_visit;
    }

    public com.flexisoft.spoonityjv.modelo.loyalty_balance getLoyalty_balance() {
        return loyalty_balance;
    }

    public void setLoyalty_balance(com.flexisoft.spoonityjv.modelo.loyalty_balance loyalty_balance) {
        this.loyalty_balance = loyalty_balance;
    }

    public com.flexisoft.spoonityjv.modelo.rules getRules() {
        return rules;
    }

    public void setRules(com.flexisoft.spoonityjv.modelo.rules rules) {
        this.rules = rules;
    }

    public com.flexisoft.spoonityjv.modelo.quick_pay_balance getQuick_pay_balance() {
        return quick_pay_balance;
    }

    public void setQuick_pay_balance(com.flexisoft.spoonityjv.modelo.quick_pay_balance quick_pay_balance) {
        this.quick_pay_balance = quick_pay_balance;
    }
}