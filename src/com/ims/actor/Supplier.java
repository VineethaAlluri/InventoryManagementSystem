package com.ims.actor;

public class Supplier {
    private int id;
    private String name;
    private Address address;

    public Supplier() {
        System.out.println("Inventory Manager Constructed !!");
    }
    public Supplier(String name, Address address){
        this();
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
