package com.ims.data;

import com.ims.actor.Supplier;

public class SupplierHolder {
    Supplier suppliers[] = new Supplier[10000];
    int currentIndex =0;

    int saveSupplier(Supplier supplier) {
        suppliers[currentIndex] = supplier;
        currentIndex++;
        return currentIndex;
    }
}
