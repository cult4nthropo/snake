package snake;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application {

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
