package ui;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public Main() {

	}

	private static void createMenuBar() {

		Vector<JComponent> favItems = new Vector<JComponent>();

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

		JMenuItem exitMenuItem = new JMenuItem("Exit");
		JMenuItem exitMenuItem2 = new JMenuItem("Exit");

		JMenuItem savemenu = new JMenuItem("Save");
		JMenuItem savemenu2 = new JMenuItem("Save");
		JMenuItem openmenu = new JMenuItem("Open");
		JMenuItem openmenu2 = new JMenuItem("Open");

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

		favItems.add(savemenu);
		savemenu.setOpaque(true);
		savemenu.setBackground(Color.CYAN);
		favItems.add(exitMenuItem);
		exitMenuItem.setOpaque(true);
		exitMenuItem.setBackground(Color.CYAN);
		favItems.add(closemenu);
		closemenu.setOpaque(true);
		closemenu.setBackground(Color.CYAN);

		newsMenuItem.addMouseMotionListener(new MouseListener(c, newsMenuItem, favItems));
		bookmarksMenuItem.addMouseMotionListener(new MouseListener(c, bookmarksMenuItem, favItems));
		importMailMenuItem.addMouseMotionListener(new MouseListener(c, importMailMenuItem, favItems));

		exportpdfMenuItem.addMouseMotionListener(new MouseListener(c, exportpdfMenuItem, favItems));
		exportwordMenuItem.addMouseMotionListener(new MouseListener(c, exportwordMenuItem, favItems));

		impMenu.add(newsMenuItem);
		impMenu.add(bookmarksMenuItem);
		impMenu.add(importMailMenuItem);
		impMenu.addMouseMotionListener(new MouseListener(c, impMenu, favItems));

		expMenu.add(exportpdfMenuItem);
		expMenu.add(exportwordMenuItem);
		expMenu.addMouseMotionListener(new MouseListener(c, expMenu, favItems));

		exitMenuItem.setToolTipText("Exit application");
		exitMenuItem.addActionListener((event) -> System.exit(0));
		exitMenuItem.addMouseMotionListener(new MouseListener(c, exitMenuItem, favItems));

		exitMenuItem2.setToolTipText("Exit application");
		exitMenuItem2.addActionListener((event) -> System.exit(0));
		exitMenuItem2.addMouseMotionListener(new MouseListener(c, exitMenuItem2, favItems));

		savemenu.addMouseMotionListener(new MouseListener(c, savemenu, favItems));
		savemenu2.addMouseMotionListener(new MouseListener(c, savemenu2, favItems));
		openmenu.addMouseMotionListener(new MouseListener(c, openmenu, favItems));
		openmenu2.addMouseMotionListener(new MouseListener(c, openmenu2, favItems));

		printmenu.addMouseMotionListener(new MouseListener(c, printmenu, favItems));
		printmenu2.addMouseMotionListener(new MouseListener(c, printmenu2, favItems));
		copymenu.addMouseMotionListener(new MouseListener(c, copymenu, favItems));
		copymenu2.addMouseMotionListener(new MouseListener(c, copymenu2, favItems));
		pastemenu.addMouseMotionListener(new MouseListener(c, pastemenu, favItems));
		pastemenu2.addMouseMotionListener(new MouseListener(c, pastemenu2, favItems));
		deletemenu.addMouseMotionListener(new MouseListener(c, deletemenu, favItems));
		deletemenu2.addMouseMotionListener(new MouseListener(c, deletemenu2, favItems));
		closemenu.addMouseMotionListener(new MouseListener(c, closemenu, favItems));
		closemenu2.addMouseMotionListener(new MouseListener(c, closemenu2, favItems));
		selectmenu.addMouseMotionListener(new MouseListener(c, selectmenu, favItems));
		selectmenu2.addMouseMotionListener(new MouseListener(c, selectmenu2, favItems));

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

		fileMenu.addMouseMotionListener(new MouseListener(c, fileMenu, favItems));

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

		otherMenu.addMouseMotionListener(new MouseListener(c, otherMenu, favItems));

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
