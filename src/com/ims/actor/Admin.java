package com.ims.actor;

import com.ims.data.SupplierHolder;

public class Admin {
    private int id;
    private String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;
    Supplier suppliers[] = new Supplier[1000];
    Supplier supplier;
    private static int supCount =0;

    Admin(){
        System.out.println("Admin Constructed !!");
    }

    Admin(String n, String bn, String sn, String c, int pc){
        setName(n);
        buildingNumber = bn;
        streetName = sn;
        city = c;
        pincode = pc;
    }

    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }

    public void addSupplier() {
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
    public String getName(){
        return name;
    }

    public void setName(String name) {
        if(name == null || name == "") {

        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
