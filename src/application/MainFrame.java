package application;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame(String name) {
		super(name);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
