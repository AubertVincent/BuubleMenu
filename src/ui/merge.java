package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class merge extends JPanel {

    private final class MouseDrag extends MouseAdapter {

        private Point last;

        @Override
        public void mousePressed(MouseEvent m) {
			width = 60;
			height = 60;
			last = m.getPoint();
			x = last.x;
			y = last.y;
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


            last = m.getPoint();
            repaint();
        }
    }

    private int x;
    private int y;

    int width, height;

    private MouseDrag mouseDrag;

    public merge() {
 
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

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 300);
        jFrame.add(new DragCircle());
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
        
        jFrame.setJMenuBar(menubar);
        jFrame.setVisible(true);
    }
}