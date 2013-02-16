package com.bodrul2112.tab.group;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GroupContentPanel extends JPanel
{
	private static final int LABEL_HEIGHT = 80;
	private static final int LABEL_WIDTH = 300;
	private static final int LABEL_UNDERLINE_WIDTH = (LABEL_WIDTH/4)*3;
	private static final int LABEL_UNDERLINE_HEIGHT = 4;

	private static final long serialVersionUID = 1L;
	
	private String groupName;
	private JPanel labelPanel;
	private JLabel label;

	public GroupContentPanel(String groupName) 
	{
		this.setGroupName(groupName);
		labelPanel = new JPanel();
		label = new JLabel();
		configureLabel();
	}
	
	private void configureLabel() 
	{
		this.setLayout(new BorderLayout());
		label.setText(this.groupName);
		labelPanel.setLayout(new BorderLayout());
		labelPanel.add(label, BorderLayout.NORTH);
		labelPanel.setSize(new Dimension(LABEL_WIDTH, LABEL_HEIGHT));
		JPanel line = new JPanel();
		line.setBackground(new Color(107,173,246));
		line.setSize(new Dimension(LABEL_UNDERLINE_WIDTH, LABEL_UNDERLINE_HEIGHT));
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}
