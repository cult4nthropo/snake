package snake;

import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Application extends JFrame{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame snake = new Snake();
				snake.setVisible(true);
			}
			
		});
		
	}

}

