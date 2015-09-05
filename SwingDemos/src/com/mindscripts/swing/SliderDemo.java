package com.mindscripts.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private void makeSliders() {
		JPanel jPanel = new JPanel();
		JSlider slider = new JSlider(0,100,25);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setSnapToTicks(true);
		final JTextField textField = new JTextField(20);
		jPanel.add(textField);
		jPanel.add(slider);
		add(jPanel, BorderLayout.NORTH);
		setSize(100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				JSlider source = (JSlider)arg0.getSource();
				textField.setText(""+source.getValue());
				
			}
		});
	
	}
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SliderDemo().makeSliders();
			}
		});
	}

}
	
