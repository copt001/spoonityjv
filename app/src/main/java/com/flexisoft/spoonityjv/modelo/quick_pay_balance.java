package com.flexisoft.spoonityjv.modelo;

public class quick_pay_balance {
    String amount;
    currency currency;
    expiring expiring;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public com.flexisoft.spoonityjv.modelo.currency getCurrency() {
        return currency;
    }

    public void setCurrency(com.flexisoft.spoonityjv.modelo.currency currency) {
        this.currency = currency;
    }

    public com.flexisoft.spoonityjv.modelo.expiring getExpiring() {
        return expiring;
    }

    public void setExpiring(com.flexisoft.spoonityjv.modelo.expiring expiring) {
        this.expiring = expiring;
    }
}
