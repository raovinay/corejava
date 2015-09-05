package com.mindscripts.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ComboBoxTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5117104610835699317L;

	public void makeComboBox() {
		JPanel jPanel = new JPanel();
		JLabel label = new JLabel("List of Tennis Players");
		jPanel.add(label);
		final JComboBox comboBox = new JComboBox();
		comboBox.addItem("Roger Federer");
		comboBox.addItem("Rafael Nadal");
		comboBox.addItem("Novak Djokovic");
		comboBox.addItem("Andy Murray");
		comboBox.addItem("Stanislas Wawrinka");
		comboBox.addItem("Richard Gasquet");
		comboBox.addItem("Tomas Berdych");
		comboBox.addItem("David Ferrer");
		comboBox.insertItemAt("Gael Monfils", 5);
		comboBox.removeItemAt(7);		

		comboBox.setEditable(true);
		jPanel.add(comboBox);
		add(jPanel, BorderLayout.NORTH);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);

		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(comboBox.getSelectedItem());
				System.out.println(comboBox.getItemAt(comboBox
						.getSelectedIndex()));

			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ComboBoxTest().makeComboBox();

			}
		});
	}
}
