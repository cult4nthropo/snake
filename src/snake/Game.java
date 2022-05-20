package snake;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Game extends JPanel {
	
	private int width = 300;
	private int height = 300;
	
	private Image apple;
	private Image head;
	private Image tail;
	
	private int tail_amount = 3;
	private int snake_width = 10;
	private int snakeX[] = new int[width * height / (snake_width * snake_width)];
	private int snakeY[] = new int[width * height / (snake_width * snake_width)];
	
	public Game() {
		addKeyListener(new SnakeListener());
		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		setBackground(Color.DARK_GRAY);
		
		Image apple = new ImageIcon("icons\\apple.png").getImage();
		Image head = new ImageIcon("icons\\head.png").getImage();
		Image tail = new ImageIcon("icons\\tail.png").getImage();
		
		for (int i = 0; i < tail_amount; i++) {
			snakeX[i] = 100 - i * 10;
			snakeY[i] = 50;
		}
		
		gameStart();
	}

	private void gameStart() {
		// TODO Auto-generated method stub
		
	}
}
