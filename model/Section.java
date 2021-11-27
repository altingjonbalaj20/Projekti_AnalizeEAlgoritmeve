package model;

import java.util.LinkedList;

public class Section {
    private String sectionName;
    private int xPosition;
    private int yPosition;
    public Section(String sectionName, int xPosition, int yPosition){
        this.sectionName = sectionName;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getXPosition(){
        return xPosition;
    }

    public int getYPosition(){
        return yPosition;
    }
    


}
