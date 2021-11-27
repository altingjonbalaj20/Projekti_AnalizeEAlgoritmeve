package model;

public class Order {
    private String owner;
    private String address;
    private String tel;
    private String description;
    private boolean returnable;
    private boolean premium;

    public Order(String owner, String address, String tel, String description, boolean returnable, boolean premium){
        this.owner = owner;
        this.address = address;
        this.tel = tel;
        this.description = description;
        this.returnable = returnable;
        this.premium = premium;
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
    
    public boolean isReturnable(){
        return returnable;
    }

    public boolean isPremium(){
        return premium;
    }
}
