package model;

public class Order {
    private String owner;
    private String address;
    private String tel;
    private String description;
    private double price;
    private boolean returnable;
    private boolean premium;
    private boolean delivered;
    private boolean postponed;

    public Order(String owner, String address, String tel, String description, double price, boolean returnable, boolean premium){
        this.owner = owner;
        this.address = address;
        this.tel = tel;
        this.description = description;
        this.price = price;
        this.returnable = returnable;
        this.premium = premium;
        delivered = false;
        postponed = false;
    }

    public String getOwner(){
        return owner;
    }

    public String getAddress(){
        return address;
    }

    public String tel(){
        return tel;
    }

    public String description(){
        return description;
    }

    public double getPrice(){
        return price;
    }
    
    public boolean isReturnable(){
        return returnable;
    }

    public boolean isPremium(){
        return premium;
    }

    public boolean isDelivered(){
        return delivered;
    }

    public void setDelivered(boolean delivered){
        this.delivered = delivered;
    }

    public boolean isPostponed(){
        return postponed;
    }

    public void setPostponed(boolean postponed){
        this.postponed = postponed;
    }

}
