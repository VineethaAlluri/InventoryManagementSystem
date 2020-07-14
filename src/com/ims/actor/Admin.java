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
        System.out.println("Please press: ");
        System.out.println("4 for logout");
        System.out.println("7 adding a inventory Manager");
        System.out.println("8 checking inventory managers");
        System.out.println("9 adding a supplier");
        System.out.println("10 for checking supplier");
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
