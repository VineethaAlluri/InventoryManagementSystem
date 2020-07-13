package com.ims.data;

import com.ims.actor.Supplier;

public class SupplierHolder {
    static Supplier suppliers[] = new Supplier[10000];
    private static int currentIndex =0;

    public static int saveSupplier(Supplier supplier) {
        suppliers[currentIndex] = supplier;
        currentIndex++;
        return currentIndex-1;
    }

    public Supplier fetchSupplierById(int id) {
        return suppliers[id];
    }
}
