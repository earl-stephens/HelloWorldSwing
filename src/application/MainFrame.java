package application;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	public MainFrame(String name) {
		super(name);
		//border layout controls placement of things in the window
		setLayout(new BorderLayout());
		add(new Toolbar(), BorderLayout.NORTH);
		
		//JPanel panel = new JPanel();
		//Panel panel = new Panel();
		//panel.setBackground(Color.green);
		add(new Panel(), BorderLayout.CENTER);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
