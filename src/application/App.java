package application;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// Java has 2 main GUI APIs - Swing, and JavaFX
		// swing is built into Java
		//JFrame is a class that represents a window on the screen
		
		//using invokeLater is the recommended way to run a swing program
		
		//uses a lambda to pass a function to a method
		//function is code not associated with a class/object
		SwingUtilities.invokeLater(() -> {
		
			/*JFrame() constructor takes a String, which becomes the
			 * title of the window
			 */
			//JFrame mainFrame = new JFrame("Test Swing app");
			//MainFrame mainFrame = new MainFrame("Test Swing app");
			//mainFrame.setSize(600, 400);
			//tells program to quit when the window is closed.
			//closes the event loop for the window
			//mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//mainFrame.setVisible(true);
			new MainFrame("Test Swing app");
		});
		
	}

}
