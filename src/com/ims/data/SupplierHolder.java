package com.ims.data;

import com.ims.actor.Supplier;

public class SupplierHolder {
    Supplier suppliers[] = new Supplier[10000];
    private int currentIndex =0;

    public int saveSupplier(Supplier supplier) {
        suppliers[currentIndex] = supplier;
        currentIndex++;
        return currentIndex;
    }

    public Supplier fetchSupplierById(int id) {
        return suppliers[id];
    }
}
