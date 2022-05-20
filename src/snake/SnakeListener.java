package snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		int keyID = e.getKeyCode();
		
		if((keyID == KeyEvent.VK_LEFT && !(Game.direction  == 6)) || (keyID == 4)) {
			Game.direction = 4;
		}
		if((keyID == KeyEvent.VK_RIGHT && !(Game.direction  == 4)) || (keyID == 6)) {
			Game.direction = 6;
		}
		if((keyID == KeyEvent.VK_UP && !(Game.direction  == 2)) || (keyID == 8)) {
			Game.direction = 8;
		}
		if((keyID == KeyEvent.VK_DOWN && !(Game.direction  == 8)) || (keyID == 2)) {
			Game.direction = 2;
		}

	}

	

}
