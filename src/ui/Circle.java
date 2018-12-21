package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Circle extends JComponent {

	private int x;
	private int y;

	int width = 100, height = 100;

	private MouseListener mouseDrag;

	public Circle(int x, int y) {
		this.x = x;
		this.y = y;

		// mouseDrag = new Listener(null);
		// addMouseListener(mouseDrag);
		// addMouseMotionListener(mouseDrag);
	}

	public void setxy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void paintComponent(Graphics g) {
		// super.paintComponent(g);
		// g.setColor(new Color(0, 0, 0, 100));
		// this.setHeight(height);
		// this.setWidth(width);
		// g.drawOval(x, y, width, height);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(0, 0, 0, 85));
		Rectangle bound = this.getBounds();
		if (this.getWidth() != 1000 && this.getHeight() != 600) {
			g2.fillOval(0, 0, this.getWidth(), this.getHeight());
		}
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
