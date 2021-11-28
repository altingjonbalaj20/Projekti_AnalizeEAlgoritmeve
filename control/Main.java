package control;

import model.Point;
import model.Section;
import view.MainFrame;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        Section s = new Section("Asllanqeshme", p);
        MainFrame frame = new MainFrame();
        
    }
    
}
