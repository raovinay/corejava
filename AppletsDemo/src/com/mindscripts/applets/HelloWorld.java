package com.mindscripts.applets;

import javax.swing.JApplet;
import javax.swing.JLabel;

/*
 * <applet code="com/mindscripts/applets/HelloWorld.class" width=200 height=60>

 </applet>
 */
public class HelloWorld extends JApplet {
	// Called when this applet is loaded into the browser.
	public void init() {

		JLabel lbl = new JLabel("Hello World");
		add(lbl);

	}
}