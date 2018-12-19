package ui;

import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class MouseListener implements MouseInputListener {

	private int x;
	private int y;
	private JPanel p;
	private Point last;

	int width, height;
	private Menu menu;

	public MouseListener(Menu menu) {
		this.menu = menu;
		// addMouseListener();
		// addMouseMotionListener();
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
		width = 60;
		height = 60;
		last = e.getPoint();
		x = last.x;
		y = last.y;
		int dx = e.getX() - last.x;
		int dy = e.getY() - last.y;

		// x += dx;
		// y += dy;

		last = e.getPoint();
		System.out.println(x);
		System.out.println(y);

		menu.setX(x);
		menu.setY(y);
		menu.repaint();

	}
}
