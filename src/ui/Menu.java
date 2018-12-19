package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Menu extends JFrame {

	public Menu() {

		initUI();
	}

	private void initUI() {

		// setTitle("Bubble Menu");
		// setSize(360, 250);
		// setLocationRelativeTo(null);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			new Menu();
		});
	}
}