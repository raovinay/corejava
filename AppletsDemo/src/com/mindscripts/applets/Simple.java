package com.mindscripts.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//No need to extend JApplet, since we don't add any components;
//we just paint.

/*
 * <applet code="com/mindscripts/applets/Simple.class" width=200 height=60>

 </applet>
 */
// from cmd prompt, just say appletviewer Simple.html
public class Simple extends Applet {

	StringBuffer buffer;

	public void init() {
		
		buffer = new StringBuffer();
		addItem("initializing... ");
	}

	public void start() {
		addItem("starting... ");
	}

	public void stop() {
		addItem("stopping... ");
	}

	public void destroy() {
		addItem("preparing for unloading...");
	}

	private void addItem(String newWord) {
		System.out.println(newWord);
		buffer.append(newWord);
		repaint();
	}

	public void paint(Graphics graphics) {
		System.out.println("inside paint");
		setBackground(Color.CYAN);

		graphics.drawString("Hello World Applet", 20, 20);

	}

}