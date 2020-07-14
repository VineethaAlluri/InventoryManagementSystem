package com.ims.actor;

public class Supplier extends SystemUser{

    public Supplier() {
        System.out.println("Inventory Manager Constructed !!");
    }
    public Supplier(String name, Address address){
        this();
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }

    @Override
    public boolean login(String userName,String password) {
        if(("supplier").equalsIgnoreCase(userName) && ("supplier").equalsIgnoreCase(password)) {
            loggedIn = true;
            return true;
        }
        loggedIn = false;
        return false;
    }
}
