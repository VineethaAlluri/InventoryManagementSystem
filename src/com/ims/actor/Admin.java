package com.ims.actor;

import com.ims.data.SupplierHolder;

public class Admin extends SystemUser{

    Supplier suppliers[] = new Supplier[1000];
    private static int supCount =0;

    public Admin(){
        super();
        System.out.println("Admin Constructed !!");
    }

    public Admin(String name, Address address){
        super();
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }

    public Admin(Address address, String name) {
        setName(name);
        setAddress(address);
    }

    public void checkProfileDashboard() {
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

    @Override
    public boolean login(String userName,String password) {
        if(("admin").equalsIgnoreCase(userName) && ("admin").equalsIgnoreCase(password)) {
            loggedIn = true;
            return true;
        }
        loggedIn = false;
        return false;
    }
}
