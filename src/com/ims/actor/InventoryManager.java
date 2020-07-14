package com.ims.actor;

public class InventoryManager extends SystemUser{

    InventoryManager(){
        System.out.println("Inventory Manager Constructed !!");
    }

    InventoryManager(String name, Address address) {
        this();
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }

    public void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }
    @Override
    public boolean login(String userName,String password) {
        if(("inventoryManager").equalsIgnoreCase(userName) && ("inventoryManager").equalsIgnoreCase(password)) {
            loggedIn = true;
            return true;
        }
        loggedIn = false;
        return false;
    }
}
