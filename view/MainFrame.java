package view;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.Color;
public class MainFrame {
    JPanel mainPanel;
    JSplitPane mainSplitPane;

    JPanel leftPanel;

    JPanel rightPanel;


    public MainFrame(){
        init();
    }

    private void init(){
        mainPanel = new JPanel();
        GridBagLayout gbMainPanel = new GridBagLayout();
        GridBagConstraints gbcMainPanel = new GridBagConstraints();
        mainPanel.setLayout( gbMainPanel );

        mainSplitPane = new JSplitPane( );
        mainSplitPane.setDividerLocation( 24 );
        mainSplitPane.setForeground( new Color( 0,0,0 ) );
        mainSplitPane.setLastDividerLocation( -1 );

        leftPanel = new JPanel();
        GridBagLayout gbLeftPanel = new GridBagLayout();
        GridBagConstraints gbcLeftPanel = new GridBagConstraints();
        leftPanel.setLayout( gbLeftPanel );
        mainSplitPane.setLeftComponent(leftPanel);

        rightPanel = new JPanel();
        GridBagLayout gbRightPanel = new GridBagLayout();
        GridBagConstraints gbcRightPanel = new GridBagConstraints();
        rightPanel.setLayout( gbRightPanel );
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
    }
}
