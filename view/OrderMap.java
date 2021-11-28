package view;

import java.awt.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollBar;
import javax.swing.Timer;

import model.Order;
import model.Point;
import model.Section;

public class OrderMap extends ScrollPane implements AdjustmentListener{
    private int zoom;
    private LinkedHashSet<Point> points;

    JScrollBar horizontalScroll;
    JScrollBar verticalScroll;

    private LinkedList<Order> orders;

    public OrderMap(){
        testConfig();
    }

    public void setScrollBars(JScrollBar horizontalScrollBar, JScrollBar verticalScrollBar){
        horizontalScroll = horizontalScrollBar;
        horizontalScroll.addAdjustmentListener(this);
        verticalScroll = verticalScrollBar;
        verticalScroll.addAdjustmentListener(this);
    }

    private void testConfig(){
        orders = new LinkedList<>();
        zoom = 1;
        Point p = new Point(20,20);
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
        setSize(100, 100);
        for (Order order : orders) {
            points.add(order.getSection().location());
        }

    }



    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if(e.getValueIsAdjusting())
            return;
        else
            repaint();
    }


    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(4, 4);
        for(Point point: points){
            g2.fillOval(point.xPosition(), point.yPosition(), 3, 3);
        }
    }

}
