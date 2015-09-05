package com.mindscripts.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBoxTest extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void makeCheckboxes(){
		JPanel jPanel = new JPanel();
		JLabel label = new JLabel("What do you prefer?");
		jPanel.add(label);
		final JCheckBox fruits = new JCheckBox("Fruits");
		fruits.setVisible(true);
		jPanel.add(fruits);
		final JCheckBox veg = new JCheckBox("Vegetables");
		veg.setVisible(true);
		jPanel.add(veg);
		jPanel.setVisible(true);
		add(jPanel, BorderLayout.NORTH);
		
		final JTextArea jTextArea = new JTextArea(8, 20);
		JScrollPane scrollPane = new JScrollPane(jTextArea);
		scrollPane.setVisible(true);
		add(scrollPane, BorderLayout.CENTER);

		
		setSize(100,100);
		pack();
		setVisible(true);
		
		
        
		
		fruits.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				if(fruits.isSelected()){
				System.out.println("Fruits is checked");
				}
				else if(!fruits.isSelected()){
					System.out.println("Fruits is un-checked");
				}
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new CheckBoxTest().makeCheckboxes();
				
			}
		});
	}

}
