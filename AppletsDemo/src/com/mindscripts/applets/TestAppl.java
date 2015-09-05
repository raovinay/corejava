package com.mindscripts.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestAppl extends Applet implements MouseMotionListener, MouseListener{
	String message="Hello, World!";
	String status="Status message here...";

	@Override
	public void init() {
		System.out.println("Initializing Applet");
		super.init();
		setBackground(Color.black);
		setForeground(Color.yellow);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString(message, 10, 20);
		showStatus(status);
		System.out.println("Painting");
	}
	@Override
	public void stop() {
		super.stop();
		System.out.println("Stopping");
	}
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroying");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		message="mouse has been clicked!";
		System.out.println(message);
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		message="mouse has Entered!";
		repaint();
		System.out.println(message);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		message="mouse has Exited!";
		repaint();
		System.out.println(message);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		message="mouse has been pressed!";
		repaint();
		System.out.println(message);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		message="mouse has been released!";
		repaint();
		System.out.println(message);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		message="mouse has been dragged!";
		repaint();
		System.out.println(message);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		message="mouse has been moved!";
		repaint();
		System.out.println(message);
	}
	
}
