package com.bodrul2112.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.bodrul2112.menu.MenuController;
import com.bodrul2112.tab.TabController;


public class MainUIFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public static final int FRAME_WIDTH = 400;
	public static final int FRAME_HEIGHT = 800;
	MenuController menuController = new MenuController();
	TabController tabController = new TabController();
	private JPanel contentPanel;
	
	public MainUIFrame() {
		configure();
	}
	
	private void configure() {
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setJMenuBar( menuController.getMenuBar() );
		this.setVisible(true);
		
		
		int menuHeight = menuController.getMenuBar().getHeight();
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setSize(new Dimension(FRAME_WIDTH-5,FRAME_HEIGHT-50));
		contentPanel.setLocation(0, menuHeight);
		contentPanel.setLayout(new BorderLayout());
		
		this.getLayeredPane().add(contentPanel, new Integer(0));
		contentPanel.add( tabController.getTabbedPane(), BorderLayout.SOUTH );
		
		this.repaint();
	}
	
}
