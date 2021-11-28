package view;

import java.awt.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import model.Order;
import model.Point;
import model.Section;

public class OrderMap extends JScrollPane{
    private int zoom;
    private LinkedHashSet<Point> points;

    private int xTranslation;
    private int yTranslation;

    JScrollBar horizontalScroll;
    JScrollBar verticalScroll;

    private LinkedList<Order> orders;

    public OrderMap(){
        testConfig();
    }

    private void testConfig(){
        orders = new LinkedList<>();
        zoom = 1;
        Point p = new Point(3,4);
        Section s = new Section("Asllanqeshme", p);
        orders.add(new Order("hh", "hh", s, "049-667-116", "hehw", 47, true, true));
        init();
    }

    public OrderMap(LinkedList<Order> orders){
        this.orders = orders;
        init();
        zoom = 1;
    }

    private void init(){
        points = new LinkedHashSet<>();
        for (Order order : orders) {
            points.add(order.getSection().location());
        }

    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(xTranslation, yTranslation);
        g2.scale(zoom, zoom);
        for(Point point: points){
            g2.fillOval(point.xPosition(), point.yPosition(), 3, 3);
        }
    }
}
