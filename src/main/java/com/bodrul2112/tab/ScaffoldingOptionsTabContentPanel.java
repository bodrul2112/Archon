package com.bodrul2112.tab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.bodrul2112.ui.MainUIFrame;

public class ScaffoldingOptionsTabContentPanel
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private final Set<String> selectedLibraries = new TreeSet<String>();
	private final Map<String,JComboBox> comboBoxes = new HashMap<String, JComboBox>();
	private final Map<String, JTextArea> textAreas = new HashMap<String, JTextArea>();
	
	public ScaffoldingOptionsTabContentPanel(int width, int height) 
	{
		configure(width, height);
	}

	private void configure(int width, int height) 
	{
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.BLUE);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setSize(new Dimension(width, 50));
		buttonPanel.add(new JButton("Create Scaffold"));
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		JPanel scrollContentPane = new JPanel();
		scrollContentPane.setPreferredSize(new Dimension(300,200));
		scrollContentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		scrollContentPane.setBackground(Color.WHITE);
		JScrollPane scrollPane = new JScrollPane(scrollContentPane);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		scrollPane.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(107,173,246)));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ItemListener scaffoldingListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
			}
		};
		JPanel scaffoldingComboBoxHolder = createComboBoxWithOptionsAndLabel("Html Scaffolding: ", "scaffolding", new String[]{"Bare Bones", "BoilerPlate (coming soon)"}, scaffoldingListener);
		scrollContentPane.add(scaffoldingComboBoxHolder);
		
		//TODO: add categories
		ItemListener librariesListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
			}
		};
		JPanel librariesComboBoxHolder = createComboBoxWithOptionsAndLabel("Add Popular Libraries: ",  "libraries", new String[]{"jQuery","knockout","angular","domReady"}, librariesListener);
		JButton addLibrary = new JButton("Add");
		addLibrary.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = comboBoxes.get("libraries");
				selectedLibraries.add(comboBox.getSelectedItem().toString());
				setLibrariesTextAreaContent();
			}
		});
		JButton removeLibrary = new JButton("Remove");
		removeLibrary.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = comboBoxes.get("libraries");
				selectedLibraries.remove(comboBox.getSelectedItem().toString());
				setLibrariesTextAreaContent();
			}
		});
		librariesComboBoxHolder.add(addLibrary);
		librariesComboBoxHolder.add(removeLibrary);
		scrollContentPane.add(librariesComboBoxHolder);
		
		JPanel librariesTextArea = createTextArea("libraries",width, 100);
		scrollContentPane.add(librariesTextArea);
		
	}
	
	private JPanel createComboBoxWithOptionsAndLabel(String labelText, String identifier, String[] options, ItemListener itemListener)
	{
		JPanel comboBoxHolder = new JPanel();
		JLabel label = new JLabel(labelText);
		JComboBox optionsComboBox = new JComboBox(options);
		comboBoxes.put(identifier, optionsComboBox);
		optionsComboBox.addItemListener(itemListener);
		comboBoxHolder.setLayout(new FlowLayout());
		comboBoxHolder.add(label);
		comboBoxHolder.add(optionsComboBox);
		return comboBoxHolder;
	}
	
	private JPanel createTextArea(String identifier, int preferredWidth, int preferredHeight) 
	{
		JPanel panel = new JPanel();
		JTextArea area = new JTextArea();
		textAreas.put(identifier, area);
		area.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
		panel.setLayout(new GridLayout(1,1));
		area.setPreferredSize(new Dimension(preferredWidth, preferredHeight));
		panel.setPreferredSize(new Dimension(preferredWidth, preferredHeight));
		panel.add(area);
		return panel;
	}
	
	private void setLibrariesTextAreaContent() 
	{
		String str = "";
		for(String lib : selectedLibraries){
			str += lib+",";
		}
		if(str.length()>1){
			str = str.substring(0, str.length()-1);
		}
		textAreas.get("libraries").setText(str);
	}
	
	public JPanel getScrollPane() 
	{
		return contentPane;
	}
	
}
