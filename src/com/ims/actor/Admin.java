package com.ims.actor;

public class Admin {
    int id;
    String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    Admin(){
        System.out.println("Admin Constructed !!");
    }

    Admin(String n, String bn, String sn, String c, int pc){
        name = n;
        buildingNumber = bn;
        streetName = sn;
        city = c;
        pincode = pc;
    }

    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }

    String getName(){
        return name;
    }
}
