package com.bodrul2112.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuController {
	
	private final JMenuBar menuBar;
	
	public MenuController() {
		
		menuBar = createMenuBar();
	}
	
	private JMenuBar createMenuBar() 
	{
		JMenuBar menuBar = new JMenuBar();
		menuBar.add( createMenu("File", new String[]{"New","Exit"}) );
		menuBar.add( createMenu("Watch", new String[]{"Import","Validate","Export"}) );
		menuBar.add( createMenu("Help", new String[]{"About"}) );
		return menuBar;
	}
	
	public JMenu createMenu(String menuName, String[] menuItems) 
	{
		JMenu menu = new JMenu(menuName);
		
		for(String menuItemName : menuItems){
			menu.add(new JMenuItem(menuItemName));
		}
		
		return menu;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

}
