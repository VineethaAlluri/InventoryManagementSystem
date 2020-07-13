package com.ims.actor;

public class InventoryManager {
    private int id;
    private String name;
    private Address address;

    InventoryManager(){
        System.out.println("Inventory Manager Constructed !!");
    }

    InventoryManager(String name, Address address){
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
    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }
}
