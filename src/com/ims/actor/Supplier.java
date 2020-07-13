package com.ims.actor;

public class Supplier {
    int id;
    String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    Supplier(){
        System.out.println("Inventory Manager Constructed !!");
    }

    Supplier(String name, String buildingNumber, String streetName, String city, int pincode){
        this();
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
        System.out.println("Assignments Done");
    }
}
