package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

class DragCircle extends JPanel implements MouseInputListener {
	private Point last;
	private int x;
	private int y;

	int width, height;

	private MouseDrag mouseDrag;

	public DragCircle() {

		setBackground(Color.WHITE);
		// mouseDrag = new MouseDrag();
		// addMouseListener(mouseDrag);
		// addMouseMotionListener(mouseDrag);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(0, 0, 0, 100));
		g.fillOval(x, y, width, height);
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

		last = e.getPoint();
		x = last.x;
		y = last.y;
		int dx = e.getX() - last.x;
		int dy = e.getY() - last.y;

		x += dx;
		y += dy;

		last = e.getPoint();
		repaint();
		// TODO Auto-generated method stub

	}
}
