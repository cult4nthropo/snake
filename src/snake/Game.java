package snake;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Game extends JPanel implements ActionListener {
	
	private int width = 300;
	private int height = 300;
	
	private Image apple;
	private Image head;
	private Image tail;
	
	private int tailAmount = 3;
	private int snakeWidth = 10;
	private int snakeX[] = new int[width * height / (snakeWidth * snakeWidth)];
	private int snakeY[] = new int[width * height / (snakeWidth * snakeWidth)];
	
	private int appleX;
	private int appleY;
	private boolean running;
	
	public Game() {
		addKeyListener(new SnakeListener());
		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		setBackground(Color.DARK_GRAY);
		
		this.apple = new ImageIcon("icons\\apple.png").getImage();
		this.head = new ImageIcon("icons\\head.png").getImage();
		this.tail = new ImageIcon("icons\\tail.png").getImage();
		
		for (int i = 0; i < tailAmount; i++) {
			snakeX[i] = 100 - i * 10;
			snakeY[i] = 50;
		}
		
		running = true;
		
		spawnApple();
	}

	private void spawnApple() {
		
		int random = (int) (Math.random() * 29);
		appleX = random * snakeWidth;
		appleY = random * snakeWidth;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			checkApple();
			checkDeath();
			moveSnake();
		}
		updateSnake();
	}

	private void checkDeath() {
		// TODO Auto-generated method stub
		
	}

	private void checkApple() {
		if (snakeX[0] == appleX && snakeY[0] == appleY) {
			tailAmount++;
		}
		
	}

	private void moveSnake() {
		// TODO Auto-generated method stub
		
	}

	private void updateSnake() {
		// TODO Auto-generated method stub
		
	}
}
