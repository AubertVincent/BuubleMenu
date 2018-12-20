package ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public Main() {

	}

	private static void createMenuBar() {
		JFrame jFrame = new JFrame();
		jFrame.setSize(1000, 600);
		jFrame.setTitle("Bubble Menu");
		// setLocationRelativeTo(null);

		Menu m = new Menu(100, 100);
		jFrame.setGlassPane(m);
		m.setOpaque(false);
		m.setVisible(true);

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
		exitMenuItem.addMouseMotionListener(new MouseListener(m));

		exitMenuItem2.setToolTipText("Exit application");
		exitMenuItem2.addActionListener((event) -> System.exit(0));
		exitMenuItem2.addMouseMotionListener(new MouseListener(m));

		JMenuItem savemenu = new JMenuItem("Save");
		JMenuItem savemenu2 = new JMenuItem("Save");
		JMenuItem openmenu = new JMenuItem("Open");
		JMenuItem openmenu2 = new JMenuItem("Open");
		savemenu.addMouseMotionListener(new MouseListener(m));
		savemenu2.addMouseMotionListener(new MouseListener(m));

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
		printmenu.addMouseMotionListener(new MouseListener(m));
		printmenu2.addMouseMotionListener(new MouseListener(m));
		copymenu.addMouseMotionListener(new MouseListener(m));
		copymenu2.addMouseMotionListener(new MouseListener(m));
		pastemenu.addMouseMotionListener(new MouseListener(m));
		pastemenu2.addMouseMotionListener(new MouseListener(m));
		deletemenu.addMouseMotionListener(new MouseListener(m));
		deletemenu2.addMouseMotionListener(new MouseListener(m));
		closemenu.addMouseMotionListener(new MouseListener(m));
		closemenu2.addMouseMotionListener(new MouseListener(m));
		selectmenu.addMouseMotionListener(new MouseListener(m));
		selectmenu2.addMouseMotionListener(new MouseListener(m));

		fileMenu.add(savemenu);
		fileMenu.add(openmenu);
		fileMenu.add(expMenu);
		fileMenu.add(exitMenuItem2);
		fileMenu.add(printmenu);
		fileMenu.addSeparator();
		fileMenu.add(impMenu);
		fileMenu.add(copymenu);
		fileMenu.addSeparator();
		fileMenu.add(pastemenu);
		fileMenu.add(deletemenu);
		fileMenu.add(closemenu);
		fileMenu.add(selectmenu);

		fileMenu.addMouseMotionListener(new MouseListener(m));

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

		menubar.add(fileMenu);
		menubar.add(otherMenu);
		jFrame.setJMenuBar(menubar);
		jFrame.setVisible(true);

		jFrame.addMouseMotionListener(new MouseListener(m));

		for (int i = 0; i < 5; i++) {

		}

	}

	public static void main(String[] args) {
		createMenuBar();
	}

}
