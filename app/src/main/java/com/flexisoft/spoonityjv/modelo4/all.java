package com.flexisoft.spoonityjv.modelo4;

import java.util.List;

public class all {
    String vendor_tier_changed;
    String tier_immunity_days;
    String days_remaining;
    List<data> data;

    public String getVendor_tier_changed() {
        return vendor_tier_changed;
    }

    public void setVendor_tier_changed(String vendor_tier_changed) {
        this.vendor_tier_changed = vendor_tier_changed;
    }

    public String getTier_immunity_days() {
        return tier_immunity_days;
    }

    public void setTier_immunity_days(String tier_immunity_days) {
        this.tier_immunity_days = tier_immunity_days;
    }

    public String getDays_remaining() {
        return days_remaining;
    }

    public void setDays_remaining(String days_remaining) {
        this.days_remaining = days_remaining;
    }

    public List<com.flexisoft.spoonityjv.modelo4.data> getData() {
        return data;
    }

    public void setData(List<com.flexisoft.spoonityjv.modelo4.data> data) {
        this.data = data;
    }
}
