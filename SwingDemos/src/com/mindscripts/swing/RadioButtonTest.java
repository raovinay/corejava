package com.mindscripts.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void makeRadios(){
		JPanel jPanel = new JPanel();
		JLabel label = new JLabel("What do you prefer?");
		jPanel.add(label);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		final JRadioButton jRadioButton = new JRadioButton("Coffee", false);
		buttonGroup.add(jRadioButton);
		jPanel.add(jRadioButton);
		
		final JRadioButton jRadioButton2 = new JRadioButton("Tea", true);
		buttonGroup.add(jRadioButton2);
		jPanel.add(jRadioButton2);
		add(jPanel, BorderLayout.NORTH);
		
		setSize(100,100);
		pack();
		setVisible(true);
		
		
        
		
		jRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				if(jRadioButton.isSelected()){
				System.out.println("Coffee is checked");
				}
			
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new RadioButtonTest().makeRadios();
				
			}
		});
	}

}
