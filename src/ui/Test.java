package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Test {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(500, 500);
		JPanel panel = new JPanel();
		JMenuBar b = new JMenuBar();
		JMenu menu = new JMenu("menu");
		b.add(menu);
		for (int i = 0; i<10; i++) {
			JMenuItem j = new JMenuItem("item " + i);
			menu.add(j);
		}
		
		panel.add(b, new BorderLayout());
		jFrame.add(panel);
		DrawCircle circle = new DrawCircle();
		MouseListener ml = new MouseListener(circle, b);
		panel.addMouseListener(ml);
		panel.addMouseMotionListener(ml);
		//circle.addMouseListener(ml);
		//circle.addMouseMotionListener(ml);
		
		jFrame.setGlassPane(circle);
		circle.setOpaque(false);
		circle.setVisible(true);
		
		jFrame.setVisible(true);
	}
}
