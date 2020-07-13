package com.ims.actor;

public class IMS {
    public static void main(String[] args){

        Admin admin2 = new Admin();

        admin2.name = "Sahil";
        admin2.buildingNumber = "1171";
        admin2.streetName = "GT Road";
        admin2.city = "Delhi";
        admin2.pincode = 110007;
        Admin admin = new Admin("Sahil", "1171", "GT Road", "Delhi", 110007);

        System.out.println(admin.name);
        System.out.println(admin.buildingNumber);
        System.out.println(admin.streetName);
        System.out.println(admin.pincode);

        Admin admin3 = new Admin();
    }
}
