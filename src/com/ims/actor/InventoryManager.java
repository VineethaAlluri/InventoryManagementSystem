package com.ims.actor;
import com.ims.data.OrderHolder;
import com.ims.entity.Order;
import com.ims.service.DashboardNotificationService;
import com.ims.service.INotificationService;

public class InventoryManager extends SystemUser {
    private INotificationService notificationService;

    public InventoryManager(){

        System.out.println("Inventory Manager Constructed !!");
        notificationService = new DashboardNotificationService();
    }

    public InventoryManager(String name, Address address) {
        this();
        setName(name);
        setAddress(address);
        notificationService = new DashboardNotificationService();
        System.out.println("Assignments Done");
    }

    public void checkProfileDashboard() {
        System.out.println("Please press: ");
        System.out.println("4 for logout");
        System.out.println("6 placing order");
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

    public Order placeOrder(Integer productId, Integer quantity, Supplier supplier) {
        Order order = new Order(productId,quantity,this,supplier);
        Order savedOrder = OrderHolder.save(order);
        notificationService.notify(this.getId(),supplier.getId(),"An order has been placed");
        System.out.println("Notification sent");
        System.out.println("Order placed with id:"+savedOrder.getId());
        return order;
    }

    public void setNotificationService(INotificationService notifService) {
        notificationService = notifService;
    }
}
