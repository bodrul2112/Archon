package com.bodrul2112.tab;

import java.awt.Dimension;
import javax.swing.JTabbedPane;
import com.bodrul2112.ui.MainUIFrame;

public class TabController {
	
	private static final int TABBED_PANE_HEIGHT = 500;
	private final JTabbedPane jTabbedPane;
	
	public TabController() 
	{
		jTabbedPane = createTabbedPane();
	}
	
	public JTabbedPane createTabbedPane() 
	{
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("LoadedProject", new LoadedProjectTabContentPanel());
		tabbedPane.add("Confiuration", new ConfigurationTabContentPanel());
		tabbedPane.add("Scaffoling Settings", new ScaffoldingOptionsTabContentPanel());
		tabbedPane.setPreferredSize(new Dimension(MainUIFrame.FRAME_WIDTH, TABBED_PANE_HEIGHT));
		return tabbedPane;
	}

	public JTabbedPane getTabbedPane() {
		return jTabbedPane;
	}

}
