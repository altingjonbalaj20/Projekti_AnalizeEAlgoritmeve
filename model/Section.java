package model;

import java.util.HashMap;
import java.util.LinkedList;

public class Section {
    private String sectionName;
    private Point location;
    private HashMap<Section, Integer> paths;//Section, SectionCost path

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

    public LinkedList<Section> getNeighbors(){
        return new LinkedList<>(paths.keySet());
    }

    public Point location(){
        return location;
    }
    
}
