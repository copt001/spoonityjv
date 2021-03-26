package com.flexisoft.spoonityjv.modelo4;

import com.flexisoft.spoonityjv.modelo3.current;
import com.flexisoft.spoonityjv.modelo3.next;

public class tier {
    int count;
    com.flexisoft.spoonityjv.modelo3.current current;
    com.flexisoft.spoonityjv.modelo3.next next;
    all all;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public com.flexisoft.spoonityjv.modelo3.current getCurrent() {
        return current;
    }

    public void setCurrent(com.flexisoft.spoonityjv.modelo3.current current) {
        this.current = current;
    }

    public com.flexisoft.spoonityjv.modelo3.next getNext() {
        return next;
    }

    public void setNext(com.flexisoft.spoonityjv.modelo3.next next) {
        this.next = next;
    }

    public com.flexisoft.spoonityjv.modelo4.all getAll() {
        return all;
    }

    public void setAll(com.flexisoft.spoonityjv.modelo4.all all) {
        this.all = all;
    }
}
