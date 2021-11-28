package view;

import javax.swing.*;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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

    }
}
