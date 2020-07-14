package com.ims.actor;

import com.ims.data.SupplierHolder;

public class Admin extends SystemUser{

    Supplier suppliers[] = new Supplier[1000];
    private static int supCount =0;

    public Admin(){
        System.out.println("Admin Constructed !!");
    }

    public Admin(String name, Address address){
        this();
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }

    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }

    public void addSupplier(Supplier supplier) {
        int id =storeSupplier(supplier);
        supplier.setId(id);
        mapSupplier(supplier);
    }

    private int storeSupplier(Supplier supplier) {
        int index = SupplierHolder.saveSupplier(supplier);
        return index;
    }

    private void mapSupplier(Supplier supplier) {
        suppliers[supCount] = supplier;
        supCount = supCount +1;
    }
}
