package ui;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

public class MouseListener implements MouseInputListener {

	private int x;
	private int y;
	private JPanel p;
	private Point last;
	private JComponent itemCourant;
	private Vector<JComponent> favoris;
	private JComponent plusProche; // Le favoris le plus proche de la souris
									// idée de Julien
	int width, height;
	private Circle circle;

	public MouseListener(Circle circle) {
		this.circle = circle;
	}

	public MouseListener(Circle circle, JComponent itemCourant, Vector<JComponent> favoris) {
		this.circle = circle;
		this.itemCourant = itemCourant;
		this.favoris = favoris;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Enregistre quel bouton de la souris est enfoncé.
		int buttonDown = e.getButton();

		if (buttonDown == MouseEvent.BUTTON1) {
			// Bouton GAUCHE enfoncé
		} else if (buttonDown == MouseEvent.BUTTON2) {
			// Bouton du MILIEU enfoncé
		} else if (buttonDown == MouseEvent.BUTTON3) {
			// Bouton DROIT enfoncé
			if (this.plusProche instanceof JMenu) {
				((JMenu) this.plusProche).doClick();
			} else if (this.plusProche instanceof JMenuItem) {
				((JMenuItem) this.plusProche).doClick();
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		plusProche = null;
		double distanceminimale = -1;
		for (JComponent c : favoris) {
			if (c.isShowing()) {
				double dist = c.getLocation().distance(e.getX() - c.getWidth() / 2, e.getY() - c.getHeight() / 2);

				if (distanceminimale == -1) {
					distanceminimale = dist;
					plusProche = c;
				} else if (dist < distanceminimale) {
					distanceminimale = dist;
					plusProche = c;
				}
			}
			circle.setBounds(e.getX() - (int) distanceminimale, e.getY() - (int) distanceminimale,
					(int) (distanceminimale * 2), (int) (distanceminimale * 2));
		}
		circle.repaint();

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {

		plusProche = null;
		last = e.getPoint();
		x = last.x;
		y = last.y;

		int dx = e.getX() - last.x;
		int dy = e.getY() - last.y;

		x += dx;
		y += dy;
		width = y + 70;
		height = y + 70;

		circle.setX(x);
		circle.setY(y);
		circle.setWidth(width);
		circle.setHeight(height);
		last = e.getPoint();

		circle.setBounds(x, y, 50, 50);


		// && favItems.contains(component.getComponentAt(last))
		System.out.println("mouse " + last);
		System.out.println("\n");

		last = SwingUtilities.convertPoint(itemCourant, circle.getX(), circle.getY(), p);

		circle.setX(last.x);
		circle.setY(last.y);
		if (itemCourant.getComponentAt(last) instanceof JMenuItem) {
			System.out.println("location " + itemCourant.getComponentAt(last).getLocation());
			System.out.println("here");
		}
		// if(component.getComponentAt(circle.getLocation()) instanceof JMenu) {
		// System.out.println("here");
		// }

		double distanceminimale = -1;

		for (JComponent c : favoris) {

			if (c.isShowing()) {
				double dist;

				Point comp = c.getLocationOnScreen();
				comp.x += c.getWidth() / 2;
				comp.y += c.getHeight() / 2;
				SwingUtilities.convertPointFromScreen(comp, p);
				dist = comp.distance(e.getPoint());
				if (distanceminimale == -1) {
					distanceminimale = dist;
					plusProche = c;
				} else if (dist < distanceminimale) {
					distanceminimale = dist;
					plusProche = c;
				}
			}
		}
		circle.setBounds(e.getX() - (int) distanceminimale, e.getY() - (int) distanceminimale,
				(int) (distanceminimale * 2), (int) (distanceminimale * 2));

		circle.repaint();

	}
}
