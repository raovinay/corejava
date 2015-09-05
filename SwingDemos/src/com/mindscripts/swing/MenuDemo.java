package com.mindscripts.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MenuDemo extends JFrame {

	private void makeMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);

		setJMenuBar(menuBar);
		JMenu editMenu = new JMenu("Edit");
		JMenuItem menuItem = new JMenuItem("Copy");
		editMenu.add(menuItem);
		editMenu.addSeparator();
		JMenuItem menuItem2 = new JMenuItem("Paste");
		editMenu.add(menuItem2);
		editMenu.addSeparator();
		menuBar.add(editMenu);
		JMenu helpMenu = new JMenu("Help");
		JMenuItem menuItem3 = new JMenuItem("About?");
		helpMenu.add(menuItem3);
		helpMenu.addSeparator();
		menuBar.add(helpMenu);
		menuBar.setVisible(true);
		JPanel panel = new JPanel();
		final JTextField textField = new JTextField(20);
		panel.add(textField);
		panel.setVisible(true);
		add(panel, BorderLayout.SOUTH);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();

		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Text Copied!");

			}
		});
		menuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Text Pasted!");

			}
		});

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MenuDemo().makeMenuBar();

			}
		});
	}

}
