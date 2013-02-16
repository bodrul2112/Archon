package com.bodrul2112;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.bodrul2112.ui.MainUIFrame;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(
			     "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		MainUIFrame mainUIFrame = new MainUIFrame();
		
	}
}
