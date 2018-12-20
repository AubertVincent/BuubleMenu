package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<JMenuItem> favItems = new ArrayList<JMenuItem>();
		
		JFrame jFrame = new JFrame();
		jFrame.setSize(500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu menu = new JMenu("menu");
		JMenu menu2 = new JMenu("menu2");
		JMenu menu3 = new JMenu("menu3");
	
		menubar.add(menu);
		
		DrawCircle circle = new DrawCircle();
		
		
		for (int i = 0; i<3; i++) {
			JMenuItem j = new JMenuItem("Sous-menu " + i);
			menu2.add(j);
			j.addMouseListener(new MouseListener(circle, j, favItems, panel));
		}	
		
		menu.addMouseListener(new MouseListener(circle, menu, favItems, panel));
		menu2.addMouseListener(new MouseListener(circle, menu2, favItems, panel));
		menu3.addMouseListener(new MouseListener(circle, menu3, favItems, panel));
		
		menu.add(menu2);
		
		for (int i = 0; i<10; i++) {
			JMenuItem j = new JMenuItem("item " + i);
			if ((i % 4) == 0 ) {
				favItems.add(j);
				j.setOpaque(true);
				j.setBackground(Color.CYAN);
			}
			j.addMouseListener(new MouseListener(circle, j, favItems, panel));
			menu.add(j);
		}
		
		for (int i = 0; i<5; i++) {
			JMenuItem j = new JMenuItem("Sous-menu " + i);
			menu3.add(j);
		}
		menu.add(menu3);
		
//		panel.setLayout(new BorderLayout());
		panel.add(menubar, BorderLayout.NORTH);
		
		jFrame.add(panel);
		
		MouseListener ml = new MouseListener(circle, menubar, favItems, panel);
		panel.addMouseListener(ml);
		panel.addMouseMotionListener(ml);
	
		
		jFrame.setGlassPane(circle);
		circle.setOpaque(false);
		circle.setVisible(true);
		
		jFrame.setVisible(true);
	}
}
