//imports

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class GamePanel extends JFrame implements ActionListener{
      //variables
    static final int SCREEN_WIDTH = 1000;
    static final int SCREEN_HEIGHT = 1000;
    static final int UNIT_SIZE = 25;

    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;

    static final int DELAY = 100;

    //we will use a array for this game just like snake
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    char direction = 'R';
    //make sure you add bounds but it cant not leave.

    boolean running = false;
    Timer time;
    Random random;

    //want three types of rocks.



    GamePanel(){
      random = new Random();
      this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

      this.setBackground(Color.black);

      this.setFocusable(true);
      this.addKeyListener(new MyKeyAdapter());

      startGame();
    }

    public void startGame(){


    }
    pubilc void paintComponent(Graphics g){

    }
    public void draw(Graphics g) {

    }

    public void newBricks() {//might make a class for this as well

    }

    public void runner(){//might make a class for this

    }

    public void checkCollison(){

    }

    Score() {//score and highscore might have it own class


    }
    public void move(){//we have to move the snake and rocks

    }

    public void checkHighScore() {// will be called in gameover

    }

    public void gameOver() {

    }
    public void checkRocks(){

    }

    //have to make a acrtion listener
    //
    @Override
    public void actionPerformed(ActionEvent e) {

      if(running) {

        move();
        checkRocks();
        checkCollisons();
      }
      repaint();

    }
    public class MyKeyAdapter extends KeyAdapter {
      @Override
      public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
        	                           //VK_LEFT means the left arrow key on
        case KeyEvent.VK_LEFT:			//keyboard making sure we can not crash back
          direction = 'L';
          break;

        case KeyEvent.VK_RIGHT:
          direction = 'R';
          break;

        case KeyEvent.VK_ENTER:
          if(!running){
            new GameFrame();
          }
        }
      }
    }
}
