package snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("unused")
public class SnakeListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		int keyID = e.getKeyCode();
		
		if((keyID == KeyEvent.VK_LEFT && !(Game.getDirection()  == 6)) || (keyID == 4)) {
			Game.setDirection(4);;
		}
		if((keyID == KeyEvent.VK_RIGHT && !(Game.getDirection()  == 4)) || (keyID == 6)) {
			Game.setDirection(6);;
		}
		if((keyID == KeyEvent.VK_UP && !(Game.getDirection()  == 2)) || (keyID == 8)) {
			Game.setDirection(8);;
		}
		if((keyID == KeyEvent.VK_DOWN && !(Game.getDirection()  == 8)) || (keyID == 2)) {
			Game.setDirection(2);;
		}

	}

	

}
