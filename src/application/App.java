package application;

import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		// Java has 2 main GUI APIs - Swing, and JavaFX
		// swing is built into Java
		//JFrame is a class that represents a window on the screen
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(600, 400);
		//tells program to quit when the window is closed.
		//closes the event loop for the window
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

		
	}

}
