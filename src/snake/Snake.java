package snake;

import javax.swing.JFrame;

public class Snake extends JFrame{
	public Snake() {
		add(new Game());
		
		setResizable(false);
		pack();
		setTitle("Snake");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		}
 }
