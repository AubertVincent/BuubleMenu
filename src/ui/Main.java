package ui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public Main() {

	}

	private static void createMenuBar() {

		ArrayList<JMenuItem> favItems = new ArrayList<JMenuItem>();

		JFrame jFrame = new JFrame();
		jFrame.setSize(1000, 600);
		jFrame.setTitle("Bubble Menu");
		// setLocationRelativeTo(null);

		Circle c = new Circle(100, 100);
		jFrame.setGlassPane(c);
		c.setOpaque(false);
		c.setVisible(true);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu otherMenu = new JMenu("Autres");
		JMenu impMenu = new JMenu("Import");
		JMenu expMenu = new JMenu("Export");

		JMenuItem newsMenuItem = new JMenuItem("Import newsfeed list...");
		JMenuItem bookmarksMenuItem = new JMenuItem("Import bookmarks...");
		JMenuItem importMailMenuItem = new JMenuItem("Import mail...");

		JMenuItem exportpdfMenuItem = new JMenuItem("Export to pdf");
		JMenuItem exportwordMenuItem = new JMenuItem("Export to word");

		impMenu.add(newsMenuItem);
		impMenu.add(bookmarksMenuItem);
		impMenu.add(importMailMenuItem);

		expMenu.add(exportpdfMenuItem);
		expMenu.add(exportwordMenuItem);

		JMenuItem exitMenuItem = new JMenuItem("Exit");
		JMenuItem exitMenuItem2 = new JMenuItem("Exit");

		exitMenuItem.setToolTipText("Exit application");
		exitMenuItem.addActionListener((event) -> System.exit(0));
		exitMenuItem.addMouseMotionListener(new MouseListener(c, exitMenuItem));

		exitMenuItem2.setToolTipText("Exit application");
		exitMenuItem2.addActionListener((event) -> System.exit(0));
		exitMenuItem2.addMouseMotionListener(new MouseListener(c, exitMenuItem2));

		JMenuItem savemenu = new JMenuItem("Save");
		JMenuItem savemenu2 = new JMenuItem("Save");
		JMenuItem openmenu = new JMenuItem("Open");
		JMenuItem openmenu2 = new JMenuItem("Open");
		savemenu.addMouseMotionListener(new MouseListener(c, savemenu));
		savemenu2.addMouseMotionListener(new MouseListener(c, savemenu2));

		JMenuItem printmenu = new JMenuItem("Print");
		JMenuItem printmenu2 = new JMenuItem("Print");
		JMenuItem copymenu = new JMenuItem("Copy");
		JMenuItem copymenu2 = new JMenuItem("Copy");
		JMenuItem pastemenu = new JMenuItem("Paste");
		JMenuItem pastemenu2 = new JMenuItem("Paste");
		JMenuItem deletemenu = new JMenuItem("Delete");
		JMenuItem deletemenu2 = new JMenuItem("Delete");
		JMenuItem closemenu = new JMenuItem("Close");
		JMenuItem closemenu2 = new JMenuItem("Close");
		JMenuItem selectmenu = new JMenuItem("Select");
		JMenuItem selectmenu2 = new JMenuItem("Select");
		printmenu.addMouseMotionListener(new MouseListener(c, printmenu));
		printmenu2.addMouseMotionListener(new MouseListener(c, printmenu2));
		copymenu.addMouseMotionListener(new MouseListener(c, copymenu));
		copymenu2.addMouseMotionListener(new MouseListener(c, copymenu2));
		pastemenu.addMouseMotionListener(new MouseListener(c, pastemenu));
		pastemenu2.addMouseMotionListener(new MouseListener(c, pastemenu2));
		deletemenu.addMouseMotionListener(new MouseListener(c, deletemenu));
		deletemenu2.addMouseMotionListener(new MouseListener(c, deletemenu2));
		closemenu.addMouseMotionListener(new MouseListener(c, closemenu));
		closemenu2.addMouseMotionListener(new MouseListener(c, closemenu2));
		selectmenu.addMouseMotionListener(new MouseListener(c, selectmenu));
		selectmenu2.addMouseMotionListener(new MouseListener(c, selectmenu2));

		favItems.add(savemenu);
		savemenu.setOpaque(true);
		savemenu.setBackground(Color.CYAN);
		favItems.add(exitMenuItem);
		exitMenuItem.setOpaque(true);
		exitMenuItem.setBackground(Color.CYAN);
		favItems.add(closemenu);
		closemenu.setOpaque(true);
		closemenu.setBackground(Color.CYAN);

		fileMenu.add(savemenu);
		fileMenu.add(openmenu);
		fileMenu.add(expMenu);
		fileMenu.add(exitMenuItem);
		fileMenu.add(printmenu);
		fileMenu.addSeparator();
		fileMenu.add(impMenu);
		fileMenu.add(copymenu);
		fileMenu.addSeparator();
		fileMenu.add(pastemenu);
		fileMenu.add(deletemenu);
		fileMenu.add(closemenu);
		fileMenu.add(selectmenu);

		fileMenu.addMouseMotionListener(new MouseListener(c, fileMenu));

		otherMenu.add(savemenu2);
		otherMenu.add(exitMenuItem2);
		otherMenu.add(printmenu2);
		otherMenu.addSeparator();
		otherMenu.add(copymenu2);
		otherMenu.addSeparator();
		otherMenu.add(pastemenu2);
		otherMenu.add(deletemenu2);
		otherMenu.add(closemenu2);
		otherMenu.add(selectmenu2);

		otherMenu.addMouseMotionListener(new MouseListener(c, otherMenu));

		menubar.add(fileMenu);
		menubar.add(otherMenu);
		jFrame.setJMenuBar(menubar);
		jFrame.setVisible(true);

		jFrame.addMouseMotionListener(new MouseListener(c));

		for (int i = 0; i < 3; i++) {

		}

	}

	public static void main(String[] args) {
		createMenuBar();
	}

}
