package snake;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

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
		
		ImageIcon apple = new ImageIcon("apple.png");
		ImageIcon head = new ImageIcon("head.png");
		ImageIcon tail = new ImageIcon("tail.png");
		/*
		apple = apple.getImage();
		head = head.getImage();
		tail = tail.getImage();
		*/
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
