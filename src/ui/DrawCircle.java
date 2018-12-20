
package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class DrawCircle extends JComponent {

	private int x;
	private int y;
	private int width;
	private int height;
//	int width = 100, height = 100;


	public DrawCircle () {
		//setBackground(Color.WHITE);
		//MouseListener ml = new MouseListener(this);
		//addMouseListener(ml);
		//addMouseMotionListener(ml);

		// mouseDrag = new Listener(null);
		// addMouseListener(mouseDrag);
		// addMouseMotionListener(mouseDrag);
	}

	public void setxy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		getBounds();
		g.setColor(new Color(0, 0, 0, 100));
		g.fillOval(x, y, this.width, this.height);
		
	}

	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.width = width;
	}
	
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.height = height;
	}
	
}