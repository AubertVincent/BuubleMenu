package ui;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

class DragCircle extends JPanel {

	private final class MouseDrag implements MouseInputListener {

		private Point last;

		@Override
		public void mouseMoved(MouseEvent m) {
			width = 60;
			height = 60;
			last = m.getPoint();
			x = last.x;
			y = last.y;
			int dx = m.getX() - last.x;
			int dy = m.getY() - last.y;

			x += dx;
			y += dy;

			last = m.getPoint();
			repaint();
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

	}

	private int x;
	private int y;

	int width, height;

	private MouseDrag mouseDrag;

	public DragCircle() {

		mouseDrag = new MouseDrag();
		addMouseListener(mouseDrag);
		addMouseMotionListener(mouseDrag);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x, y, width, height);
	}
}
