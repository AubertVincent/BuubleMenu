package ui;


import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MouseInputListener;

import com.sun.javafx.geom.Rectangle;


public class MouseListener implements MouseInputListener, MouseMotionListener {

	DrawCircle circle;
	JComponent component;
	JPanel panel;
	private int x;
	private int y;

	int width, height;
	private Point last, menuPosition;
	
	ArrayList<JMenuItem> favItems = new ArrayList<JMenuItem>();
	
	JMenuItem item;
	
	public MouseListener (DrawCircle circle, JComponent component, ArrayList<JMenuItem> favItems, JPanel panel) {
		this.circle = circle;
		this.component = component;
		this.panel = panel;
		this.favItems = favItems;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		circle.setBounds(x,y, 50,50);
		last = SwingUtilities.convertPoint(component, e.getX(), e.getY(), panel);
		
		if (component instanceof JMenu) {
			favItems.get(0).doClick();
//			menuPosition = last;	
			System.out.println("position " + last);
		}

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		width = 0;
		height = 0;

		circle.setWidth(width);
		circle.setHeight(height);
		circle.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		last = e.getPoint();
		x = last.x;
		y = last.y;

		int dx = e.getX() - last.x;
		int dy = e.getY() - last.y;


		x += dx;
		y += dy;
		width = y+70;
		height = y+70;


		circle.setX(x);
		circle.setY(y);
		circle.setWidth(width);
		circle.setHeight(height);
		last = e.getPoint();

		circle.setBounds(x,y, 50,50);


//		 && favItems.contains(component.getComponentAt(last))
		System.out.println("mouse " + last);
		System.out.println("\n");
		
		last = SwingUtilities.convertPoint(component, circle.getX(), circle.getY(), panel);

		if(component.getComponentAt(circle.getLocation()) instanceof JMenu) {
			System.out.println("here");
		}
		
		circle.repaint();
		
	}
	


	
}
