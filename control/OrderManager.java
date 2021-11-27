package control;
import java.util.LinkedList;

import model.*;

public class OrderManager {
    private LinkedList<Order> orders;
    private LinkedList<Order> premiumOrders;
    private LinkedList<Order> regularOrders;

    public OrderManager(){
        orders = new LinkedList<>();
        premiumOrders = new LinkedList<>();
        regularOrders = new LinkedList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
        if(order.isPremium())
            premiumOrders.add(order);
        else
            regularOrders.add(order);
    }

    public LinkedList<Order> getOrders(){
        return orders;
    }

    public LinkedList<Order> getPremiumOrders(){
        return premiumOrders;
    }

    public LinkedList<Order> getRegularOrders(){
        return regularOrders;
    }

}
