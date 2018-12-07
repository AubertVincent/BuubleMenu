
package ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.EventQueue;


public class Menu extends JFrame{

	public Menu() {

        initUI();
    }
	
    private void initUI() {

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

        setJMenuBar(menubar);

        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Menu ex = new Menu();
            ex.setVisible(true);
        });
    }
}