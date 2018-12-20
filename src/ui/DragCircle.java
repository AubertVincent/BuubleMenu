package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

class DragCircle extends JPanel {

	private final class MouseDrag extends MouseAdapter {

		private Point last;
//		private JMenuBar menubar;

//		public MouseDrag(JMenuBar menubar) {
//			this.menubar = menubar;
//		}

		public MouseDrag() {

		}
		@Override
		public void mousePressed(MouseEvent m) {
//			this.menubar.getMenu(0).doClick();
//			int menucount = menubar.getMenuCount();
//			JMenu jmenu;
//			for (int i=0; i<menucount; i++) {
//				jmenu = menubar.getMenu(i);
//				menubar.getMenu(i).addMouseListener(mouseDrag);
//				menubar.getMenu(i).addMouseMotionListener(mouseDrag);
//				int jmenucount = jmenu.getMenuComponentCount();
//				
//				for (int j=0; j<jmenucount; j++) {
//					jmenu.getMenuComponent(j).addMouseListener(mouseDrag);
//					jmenu.getMenuComponent(j).addMouseMotionListener(mouseDrag);
//				}
//			}
			
			last = m.getPoint();
			x = last.x;
			y = last.y;
			width = y;
			height = y;
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
			width = y;
			height = y;

			last = m.getPoint();
			repaint();
		}
	}

	private int x;
	private int y;

	int width, height;

	private MouseDrag mouseDrag;
	//	private JMenu fileMenu;

//	public DragCircle(JMenuBar menubar) {
//		setBackground(Color.WHITE);
//		mouseDrag = new MouseDrag(menubar);
//		addMouseListener(mouseDrag);
//		addMouseMotionListener(mouseDrag);
//	}
	
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
