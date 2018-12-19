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

		exitMenuItem2.setToolTipText("Exit application");
		exitMenuItem2.addActionListener((event) -> System.exit(0));

		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(expMenu);
		fileMenu.add(exitMenuItem2);
		fileMenu.add(new JMenuItem("Print"));
		fileMenu.addSeparator();
		fileMenu.add(impMenu);
		fileMenu.add(new JMenuItem("Copy"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Paste"));
		fileMenu.add(new JMenuItem("Delete"));
		fileMenu.add(new JMenuItem("Close"));
		fileMenu.add(new JMenuItem("Select"));

		otherMenu.add(new JMenuItem("Save"));
		otherMenu.add(new JMenuItem("Open"));
		otherMenu.add(new JMenuItem("Save"));
		otherMenu.add(exitMenuItem);
		otherMenu.add(new JMenuItem("Print"));
		otherMenu.addSeparator();
		otherMenu.add(new JMenuItem("Properties"));
		otherMenu.add(new JMenuItem("Copy"));
		otherMenu.addSeparator();
		otherMenu.add(new JMenuItem("Paste"));
		otherMenu.add(new JMenuItem("Delete"));
		otherMenu.add(new JMenuItem("Close"));
		otherMenu.add(new JMenuItem("Select"));

		menubar.add(fileMenu);
		menubar.add(otherMenu);
		jFrame.setJMenuBar(menubar);
		jFrame.setVisible(true);

		jFrame.addMouseMotionListener(new MouseListener(m));

	}

	public static void main(String[] args) {
		createMenuBar();
	}

}
