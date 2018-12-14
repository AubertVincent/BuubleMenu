package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DragCircle extends JPanel {

    private final class MouseDrag extends MouseAdapter {

        private Point last;

        @Override
        public void mousePressed(MouseEvent m) {
			width = 60;
			height = 60;
			last = m.getPoint();
			x = last.x;
			y = last.y;
			repaint();
        }

        @Override
        public void mouseReleased(MouseEvent m) {
        		width = 0;
			height = 0;
            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent m) {
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
    }

    private int x;
    private int y;

    int width, height;

    private MouseDrag mouseDrag;

    public DragCircle() {
    	
        setBackground(Color.WHITE);
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
