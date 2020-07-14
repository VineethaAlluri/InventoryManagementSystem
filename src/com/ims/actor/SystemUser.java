package com.ims.actor;

public abstract class SystemUser {
    private int id;
    private String name;
    private Address address;
    protected boolean loggedIn;
    public SystemUser() {

    }
    public boolean login(String userName,String password) {
        if(("systemUser").equalsIgnoreCase(userName) && ("systemUser").equalsIgnoreCase(password)) {
            loggedIn = true;
            return true;
        }
        loggedIn = false;
        return false;
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
    public abstract void checkProfileDashboard() ;
}
