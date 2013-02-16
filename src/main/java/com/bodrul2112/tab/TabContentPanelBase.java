package com.bodrul2112.tab;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.bodrul2112.ui.MainUIFrame;

public class TabContentPanelBase extends JPanel
{
	private static final long serialVersionUID = 1L;

	public TabContentPanelBase() 
	{
		this.setSize(new Dimension(MainUIFrame.FRAME_WIDTH, MainUIFrame.FRAME_WIDTH));
		this.setBackground(Color.WHITE);
	}
}
