package ui;

import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

public class MouseListener implements MouseInputListener {

	private int x;
	private int y;
	private JPanel p;
	private Point last;
	private JComponent itemCourant;

	int width, height;
	private Circle circle;

	public MouseListener(Circle circle) {
		this.circle = circle;
	}

	public MouseListener(Circle circle, JComponent itemCourant) {
		this.circle = circle;
		this.itemCourant = itemCourant;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

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
		last = e.getPoint();
		x = last.x;
		y = last.y;

		int dx = e.getX() - last.x;
		int dy = e.getY() - last.y;

		x += dx;
		y += dy;
		width = y + 70;
		height = y + 70;

		circle.setX(x);
		circle.setY(y);
		circle.setWidth(width);
		circle.setHeight(height);
		last = e.getPoint();

		circle.setBounds(x, y, 50, 50);

		// circle.setBounds(x, y, 50, 50);

		// && favItems.contains(component.getComponentAt(last))
		System.out.println("mouse " + last);
		System.out.println("\n");

		last = SwingUtilities.convertPoint(itemCourant, circle.getX(), circle.getY(), p);

		circle.setX(last.x);
		circle.setY(last.y);
		// if(component.getComponentAt(circle.getLocation()) instanceof JMenu) {
		// System.out.println("here");
		// }

		circle.repaint();

	}
}
