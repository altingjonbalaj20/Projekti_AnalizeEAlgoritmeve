package model;

public class Road {
    private Section firstPoint;
    private Section secondPoint;
    private double cost;

    public Road(Section firstPoint, Section secondPoint, double cost){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }

    
}
