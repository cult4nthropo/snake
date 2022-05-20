package snake;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.FontMetrics;

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
	private String gameOver = "Game over!";
	private boolean running;

	// 4= left; 8 = up; 6=right; 2=down;
	private static int direction;

	public static int getDirection() {
		return direction;
	}

	public static void setDirection(int pressedKey) {
		pressedKey = direction;
	}

	public Game() {
		addKeyListener(new SnakeListener());
		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		setBackground(Color.LIGHT_GRAY);

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
		repaintSnake();
	}

	private void checkDeath() {
		for (int i = tailAmount; i > 3; i--) {
			if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
				running = false;
			}
			if ((snakeY[0] >= height) || (snakeX[0] >= width) || (snakeY[0] <= 0) || (snakeY[0] <= 0)) {
				running = false;
			}
		}

	}

	private void checkApple() {
		if (snakeX[0] == appleX && snakeY[0] == appleY) {
			tailAmount++;
			spawnApple();
		}

	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(running) {
			g.drawImage(apple, appleX, appleY, this);
			for(int i = 1; i < tailAmount; i++) {
				g.drawImage(tail, snakeX[i], snakeY[i], this);
			}
			g.drawImage(head, snakeX[0], snakeY[0], this);
			Toolkit.getDefaultToolkit().sync();
		} else {
			Font font = new Font("Calibri", Font.BOLD, 16);
			FontMetrics metrics = getFontMetrics(font);
			g.setColor(Color.ORANGE);
			g.setFont(font);
			g.drawString(gameOver, width - metrics.stringWidth(gameOver), height / 2);
		}
	}

	private void moveSnake() {
		for (int i = tailAmount; i > 0; i--) {
			snakeX[i] = snakeX[i - 1];
			snakeY[i] = snakeY[i - 1];
		}

		switch (direction) {
		case 4: // left
			snakeX[0] -= snakeWidth;
			break;
		case 6: // right
			snakeX[0] += snakeWidth;
			break;
		case 8: // up
			snakeY[0] -= snakeWidth;
			break;
		case 2: // down
			snakeY[0] += snakeWidth;
			break;
		default:
			break;
		}
	}

	private void repaintSnake() {
		

	}
}
