package view;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import model.Order;
import model.Point;

public class OrderMap extends JPanel{
    private int zoom;
    private Set<Point> points;

    private int xTranslation;
    private int yTranslation;

    private LinkedList<Order> orders;

    public OrderMap(){
        
    }

    public OrderMap(LinkedList<Order> orders){
        this.orders = orders;
        init();
        zoom = 1;
    }

    private void init(){
        for (Order order : orders) {
            points.add(order.getSection().location());
        }

        JScrollBar horizontalScroll = new JScrollBar(1);
        JScrollBar verticalScroll = new JScrollBar(2);

        
    }
    
    @Override
    public void paint(Graphics g) {
        revalidate();
        super.paint(g);
        g.drawLine(4,4, 40, 50);
    }
}
