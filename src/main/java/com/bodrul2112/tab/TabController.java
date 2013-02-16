package com.bodrul2112.tab;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import com.bodrul2112.ui.MainUIFrame;

public class TabController {
	
	public static final int TABBED_PANE_HEIGHT = 400;
	private final JTabbedPane jTabbedPane;
	
	public TabController() 
	{
		jTabbedPane = createTabbedPane();
	}
	
	public JTabbedPane createTabbedPane() 
	{
		JTabbedPane tabbedPane = new JTabbedPane();
		
		LoadedProjectTabContentPanel loadedProject = new LoadedProjectTabContentPanel();
		ConfigurationTabContentPanel configuration = new ConfigurationTabContentPanel();
		ScaffoldingOptionsTabContentPanel scaffoldingOptions = new ScaffoldingOptionsTabContentPanel(MainUIFrame.FRAME_WIDTH-70, TABBED_PANE_HEIGHT-10);
		
		tabbedPane.add("Loaded Project", loadedProject);
		tabbedPane.add("Configuration", configuration);
		tabbedPane.add("Scaffolding Settings", scaffoldingOptions.getScrollPane());
		tabbedPane.setPreferredSize(new Dimension(MainUIFrame.FRAME_WIDTH-50, TABBED_PANE_HEIGHT));
		
		return tabbedPane;
	}

	public JTabbedPane getTabbedPane() {
		return jTabbedPane;
	}

}
