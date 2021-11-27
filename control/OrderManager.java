package control;
import java.util.LinkedList;

import model.*;

public class OrderManager {
    private LinkedList<Order> orders;
    private LinkedList<Order> premiumOrders;
    private LinkedList<Order> regularOrders;
    private LinkedList<Order> deliveredOrders;
    private LinkedList<Order> postponedOrders;

    public OrderManager(){
        orders = new LinkedList<>();
        premiumOrders = new LinkedList<>();
        regularOrders = new LinkedList<>();
        deliveredOrders = new LinkedList<>();
        postponedOrders = new LinkedList<>();
    }

    public void addOrder(Order order){
        if(!orders.contains(order))
            orders.add(order);
        if(order.isPremium())
            premiumOrders.add(order);
        else
            regularOrders.add(order);
    }

    public void postponeOrder(Order order, boolean postpone){
        order.setPostponed(postpone);
        if(postpone){
            postponedOrders.add(order);
            addOrder(order);
        }
        else{
            postponedOrders.remove(order);
            addOrder(order);
        }
            
    }

    public void orderDelivered(Order order){
        order.setDelivered(true);
        deliveredOrders.add(order);
        if(order.isPremium())
            premiumOrders.remove(order);
        else
            regularOrders.remove(order);
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

    public LinkedList<Order> getDeliveredOrders(){
        return deliveredOrders;
    }

    public LinkedList<Order> getPostponedOrders(){
        return postponedOrders;
    }

    public void clearList(){
        orders.removeAll(orders);
    }

}
