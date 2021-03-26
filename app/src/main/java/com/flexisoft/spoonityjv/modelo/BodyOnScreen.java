package com.flexisoft.spoonityjv.modelo;

public class BodyOnScreen {
    String card_number;

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    @Override
    public String toString(){
        return "BodyOnScreen{"+
                "card_number="+card_number+
                '}';
    }
}
