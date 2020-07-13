package com.ims.actor;

public class Admin {
    private int id;
    private String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;
    Supplier suppliers[] = new Supplier[1000];
    Supplier supplier;

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
        supplier.id=id;
        mapSupplier(supplier);
    }

    private int storeSupplier(Supplier supplier) {
        return -1;
    }

    private void mapSupplier(Supplier supplier) {

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
