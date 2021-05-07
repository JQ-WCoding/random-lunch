package com.frappe.randomlunch.domain.common;

/**
 * gradle profile
 */
public enum MyProfile {
    local,
    dev,
    prod;

    public String toString() {
        return this.name();
    }
}
