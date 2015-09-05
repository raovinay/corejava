package com.mindscripts.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextComponents extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void makeATextBox() {

		JPanel jPanel = new JPanel();
		JLabel label = new JLabel("Enter your name:");
		final JTextField jTextField = new JTextField(20);
		JLabel pwdLabel = new JLabel("Enter your password:");
		JPasswordField jPasswordField = new JPasswordField(20);
		jPanel.add(label);
		jPanel.add(jTextField);
		jPanel.add(pwdLabel);
		jPanel.add(jPasswordField);
		
		jPanel.setVisible(true);
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.PAGE_AXIS));
		jPanel.setLayout(new FlowLayout());
		jPanel.setVisible(true);
		add(jPanel, BorderLayout.NORTH);

		final JTextArea jTextArea = new JTextArea(3, 3);
		JScrollPane scrollPane = new JScrollPane(jTextArea);
		scrollPane.setVisible(true);
		add(scrollPane, BorderLayout.CENTER);

		JPanel anotherPanel = new JPanel();
		JButton jButton = new JButton("Submit");
		anotherPanel.add(jButton);
		anotherPanel.setVisible(true);
		add(anotherPanel, BorderLayout.SOUTH);

		

		pack();
		setVisible(true);
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jTextArea.append("This is "+jTextField.getText()+" signing in here!! Hello!!");

			}
		});

	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TextComponents().makeATextBox();
			}
		});
	}

}
