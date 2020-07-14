package com.ims.actor;
import java.util.Scanner;
public class IMS {
    public static void main(String[] args){
        System.out.println("Welcome to inventory management system");
        System.out.println("Please Press-");
        System.out.println("1 for Admin");
        System.out.println("2 for Supplier");
        System.out.println("3 for Inventory Manager");
    }
    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    private boolean checkValidUser(int option) {
        if( option != 1 || option !=2 || option!=3) {
            return false;
        }
        return true;
    }
}
