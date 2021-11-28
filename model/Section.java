package model;

import java.util.HashMap;

public class Section {
    private String sectionName;
    private Point location;
    private HashMap<Section, Integer> paths;

    public Section(String sectionName, Point point){
        this.sectionName = sectionName;
        paths = new HashMap<>();
        location = point;
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

    public Point location(){
        return location;
    }
    
}
