package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class Main extends MouseAdapter{

	public static void main(String[] args) {
		
		ArrayList<JComponent> items = new ArrayList<JComponent>();
		
						
		JFrame jFrame = new JFrame();
		jFrame.setSize(300, 300);
		jFrame.setTitle("Bubble Menu");
		
		JPanel panel = new JPanel();
		
		DrawCircle circle = new DrawCircle();
		
		jFrame.setGlassPane(circle);
		circle.setOpaque(false);
		circle.setVisible(true);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JMenuBar menubar = new JMenuBar();
		
		
		JMenu fileMenu = new JMenu("File");
		JMenu impMenu = new JMenu("Import");
		JMenu expMenu = new JMenu("Export");
		

		JMenuItem  newsMenuItem = new JMenuItem("Import newsfeed list...");
		JMenuItem  bookmarksMenuItem = new JMenuItem("Import bookmarks...");
		JMenuItem  importMailMenuItem = new JMenuItem("Import mail...");

		JMenuItem  exportpdfMenuItem = new JMenuItem("Export to pdf");
		JMenuItem  exportwordMenuItem = new JMenuItem("Export to word");

		impMenu.add(newsMenuItem);
		impMenu.add(bookmarksMenuItem);
		impMenu.add(importMailMenuItem);

		expMenu.add(exportpdfMenuItem);
		expMenu.add(exportwordMenuItem);

		JMenuItem  newMenuItem = new JMenuItem("New");
		JMenuItem  openMenuItem = new JMenuItem("Open");
		JMenuItem  saveMenuItem = new JMenuItem("Save");

		JMenuItem  exitMenuItem = new JMenuItem("Exit");
		JMenuItem  printMenuItem = new JMenuItem("Print");

		JMenuItem  proportiesMenuItem = new JMenuItem("Properties");
		JMenuItem  copyMenuItem = new JMenuItem("Copy");
		JMenuItem  pasteMenuItem = new JMenuItem("Paste");
		JMenuItem  deleteMenuItem = new JMenuItem("Delete");
		JMenuItem  closeMenuItem = new JMenuItem("Close");
		JMenuItem  selectMenuItem = new JMenuItem("Select");
		JMenuItem  fontMenuItem = new JMenuItem("Font");
		JMenuItem  documentMenuItem = new JMenuItem("Font");

		exitMenuItem.setToolTipText("Exit application");

		//exitMenuItem.addActionListener((event) -> System.exit(0));

		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(copyMenuItem);
		fileMenu.add(pasteMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(impMenu);
		fileMenu.add(expMenu);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		fileMenu.add(printMenuItem);
		fileMenu.add(deleteMenuItem);
		fileMenu.add(proportiesMenuItem);
		fileMenu.add(selectMenuItem);
		fileMenu.add(fontMenuItem);
		fileMenu.add(documentMenuItem);
		fileMenu.add(closeMenuItem);

		menubar.add(fileMenu);
		
//		panel.add(menubar);
		JPanel p = new JPanel();
		p.add(menubar, new BorderLayout());

		jFrame.add(p);
		
//		jFrame.add(panel);
		
//		DrawCircle circle = new DrawCircle();

		MouseListener ml = new MouseListener(circle, fileMenu);
		p.addMouseListener(ml);
		p.addMouseMotionListener(ml);
		

		

//		int menucount = menubar.getMenuCount();
//		JMenu jmenu;
//		for (int i=0; i<menucount; i++) {
//			jmenu = menubar.getMenu(i);
//			System.out.println(jmenu.getName());
//			
//			MouseListener ml3 = new MouseListener(circle, jmenu);
//			menubar.addMouseListener(ml3);
//			menubar.addMouseMotionListener(ml3);
//
//			int jmenucount = jmenu.getMenuComponentCount();
//
//			for (int j=0; j<jmenucount; j++) {
//				MouseListener ml2 = new MouseListener(circle, ((JComponent) jmenu.getMenuComponent(j)));
//				jmenu.addMouseListener(ml2);
//				jmenu.addMouseMotionListener(ml2);
//			}
//		}
		
//		jFrame.addMouseListener(new MouseListener(circle, menubar));
		
		
		jFrame.setVisible(true);
	}
}
