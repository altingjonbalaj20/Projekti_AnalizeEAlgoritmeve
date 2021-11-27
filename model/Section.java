package model;

import java.util.HashMap;

public class Section {
    private String sectionName;
    private int xPosition;
    private int yPosition;
    private HashMap<Section, Integer> paths;

    public Section(String sectionName, int xPosition, int yPosition){
        this.sectionName = sectionName;
        paths = new HashMap<>();
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void addPath(Section section, int pathCost){
        paths.put(section, pathCost);
    }

    public int getCost(Section section){
        return (int) (paths.get(section));
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
