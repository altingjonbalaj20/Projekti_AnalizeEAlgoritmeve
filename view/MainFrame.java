package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.Color;
public class MainFrame extends JFrame {
    JPanel mainPanel;
    JSplitPane mainSplitPane;

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

        mainSplitPane = new JSplitPane(1);
        mainSplitPane.setDividerLocation( 200 );
        mainSplitPane.setForeground( new Color( 0,0,0 ) );
        mainSplitPane.setLastDividerLocation( 200 );

        leftPanel = new OrderMap();
        GridBagLayout gbLeftPanel = new GridBagLayout();
        GridBagConstraints gbcLeftPanel = new GridBagConstraints();
        leftPanel.setLayout( gbLeftPanel );
        mainSplitPane.setLeftComponent(new JScrollPane(leftPanel));

        rightPanel = new JPanel();
        GridBagLayout gbRightPanel = new GridBagLayout();
        GridBagConstraints gbcRightPanel = new GridBagConstraints();
        rightPanel.setLayout( gbRightPanel );
        JButton j = new JButton("Hello");
        gbLeftPanel.setConstraints(j, gbcLeftPanel);
        rightPanel.add(j, gbcLeftPanel);

        mainSplitPane.setRightComponent(rightPanel);

        gbcMainPanel.gridx = 0;
        gbcMainPanel.gridy = 0;
        gbcMainPanel.gridwidth = 1;
        gbcMainPanel.gridheight = 1;
        gbcMainPanel.fill = GridBagConstraints.BOTH;
        gbcMainPanel.weightx = 1;
        gbcMainPanel.weighty = 1;
        gbcMainPanel.anchor = GridBagConstraints.CENTER;
        gbMainPanel.setConstraints( mainSplitPane, gbcMainPanel );
        mainPanel.add( mainSplitPane );

        setContentPane(mainPanel);
    }
}
