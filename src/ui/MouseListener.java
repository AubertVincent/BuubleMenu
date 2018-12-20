package ui;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.event.MouseInputListener;


public class MouseListener extends MouseAdapter implements MouseInputListener {

	DrawCircle circle;
	JComponent component;
	JPanel panel;
	private int x;
	private int y;

	int width, height;
	private Point last;
	
	
	public MouseListener (DrawCircle circle, JComponent component) {
		this.circle = circle;
		this.component = component;
//		this.panel = panel;
	}

	public MouseListener(DrawCircle circle) {
		// TODO Auto-generated constructor stub
		this.circle = circle;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		if(e.getComponent() instanceof JMenu) {
		if (component instanceof JMenu) {

			((JMenu)component).doClick();
		}
			
		last = e.getPoint();
		x = last.x;
		y = last.y;
		width = y;
		height = y;
		circle.setX(x);
		circle.setY(y);
		circle.setWidth(width);
		circle.setHeight(height);
		circle.repaint();
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
		if(e.getComponent() instanceof JMenu) {
//			if (component instanceof JMenu) {
				((JMenu)component).doClick();
			}
		last = e.getPoint();
		x = last.x;
		y = last.y;

		int dx = e.getX() - last.x;
		int dy = e.getY() - last.y;


		x += dx;
		y += dy;
		width = y;
		height = y;

		circle.setX(x);
		circle.setY(y);
		circle.setWidth(width);
		circle.setHeight(height);
		
		last = e.getPoint();
		circle.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
