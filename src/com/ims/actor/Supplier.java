package com.ims.actor;

public class Supplier {
    int id;
    String name;
    Address address;

    Supplier(){
        System.out.println("Inventory Manager Constructed !!");
    }

    Supplier(String name, Address address){
        this();
        this.name = name;
        this.address = address;
        System.out.println("Assignments Done");
    }
}
