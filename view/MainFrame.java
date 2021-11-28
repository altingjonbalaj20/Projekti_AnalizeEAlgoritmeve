package view;

import javax.swing.*;
import javax.swing.ScrollPaneConstants;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    JPanel mainPanel;

    OrderMap leftPanel;

    JPanel rightPanel;

    public static void main(String[] args) {
        new MainFrame();
    }


    public MainFrame(){
        init();
        setSize(400, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init(){
        mainPanel = new JPanel();
        GridBagLayout gbMainPanel = new GridBagLayout();
        GridBagConstraints gbcMainPanel = new GridBagConstraints();
        mainPanel.setLayout( gbMainPanel );
        
        leftPanel = new OrderMap();
        JScrollPane spLeftPanel = new JScrollPane(leftPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        leftPanel.setScrollBars(spLeftPanel.getHorizontalScrollBar(), spLeftPanel.getHorizontalScrollBar());

        rightPanel = new JPanel();
        GridBagLayout gbRightPanel = new GridBagLayout();
        GridBagConstraints gbcRightPanel = new GridBagConstraints();
        JButton sample = new JButton("Sample button");
        gbRightPanel.setConstraints(sample, gbcRightPanel);
        rightPanel.add(sample, gbRightPanel);

        rightPanel.setLayout( gbRightPanel );

        gbcMainPanel.gridx = 0;
        gbcMainPanel.gridy = 0;
        gbcMainPanel.gridwidth = 4;
        gbcMainPanel.gridheight = 1;
        gbcMainPanel.fill = GridBagConstraints.BOTH;
        gbcMainPanel.weightx = 1;
        gbcMainPanel.weighty = 1;
        gbcMainPanel.anchor = GridBagConstraints.CENTER;
        gbMainPanel.setConstraints( leftPanel, gbcMainPanel );
        mainPanel.add( leftPanel );

        gbcMainPanel.gridwidth = 1;
        gbcMainPanel.gridx = 5;
        gbMainPanel.setConstraints(rightPanel, gbcMainPanel);
        mainPanel.add(rightPanel);

        setContentPane(mainPanel);

        Timer t = new Timer(300, new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
    }
}
