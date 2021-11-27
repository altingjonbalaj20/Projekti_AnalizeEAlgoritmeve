package model;

public class Section {
    private String sectionName;
    private int xPosition;
    private int yPosition;
    public Section(String sectionName, int xPosition, int yPosition){
        this.sectionName = sectionName;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getSectionName(){
        return sectionName;
    }

    public int getXPosition(){
        return xPosition;
    }

    public int getYPosition(){
        return yPosition;
    }
    
}
