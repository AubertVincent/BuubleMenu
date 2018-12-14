
package ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;



public class Menu extends JFrame implements MouseMotionListener{

	public Menu() {
		
        initUI();
    }
	
//	JFrame frame = new JFrame("DrawingApp");
    
    
    private void initUI() {

//    		frame.setSize(600,800);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//        
        createMenuBar();
      
        setTitle("Bubble Menu");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        

    }

    private void createMenuBar() {

    		
        JMenuBar menubar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenu impMenu = new JMenu("Import");
        JMenu expMenu = new JMenu("Export");

        JMenuItem newsMenuItem = new JMenuItem("Import newsfeed list...");
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

        exitMenuItem.addActionListener((event) -> System.exit(0));

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

//        frame.setJMenuBar(menubar);
        setJMenuBar(menubar);

        
        this.addMouseMotionListener(this);
        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Menu ex = new Menu();
            ex.setVisible(true);
        });
    }

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

		Graphics g = getGraphics();
		g.drawOval(e.getX(), e.getY(), 60, 60);
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(), e.getY(), 60, 60);

	}
	
}