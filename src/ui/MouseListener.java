package ui;


import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

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
	private Point last;
	
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

		last = e.getPoint();

		if (e.getComponent() instanceof JMenu) {
			favItems.get(0).doClick();
				
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


		
		
		if(component.getComponentAt(last) instanceof JMenuItem && favItems.contains(component.getComponentAt(last) )) {
			System.out.println("here");
		}
		
		circle.repaint();
		
	}
	
//	 public static Component findComponentUnderGlassPaneAt(Point p, Component top) {
//		    Component c = null;
//
//		    if (top.isShowing()) {
//		      if (top instanceof RootPaneContainer)
//		        c =
//		        ((RootPaneContainer) top).getLayeredPane().findComponentAt(
//		            SwingUtilities.convertPoint(top, p, ((RootPaneContainer) top).getLayeredPane()));
//		      else
//		        c = ((Container) top).findComponentAt(p);
//		    }
//
//		    return c;
//		  }

	
}
