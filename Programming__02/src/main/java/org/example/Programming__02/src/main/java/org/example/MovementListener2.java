package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener2 implements KeyListener {

    private MainScene mainScene;
    public MovementListener2(MainScene mainScene){
        this.mainScene = mainScene;
    }



    public void keyTyped(KeyEvent e) {
        System.out.println("key typed");
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed");
        if (e.getKeyCode()== KeyEvent.VK_RIGHT){
            this.mainScene.getCar1().moveRight();
        } else if (e.getKeyCode()== KeyEvent.VK_LEFT) {
            this.mainScene.getCar1().moveLeft();
        }
        this.mainScene.repaint(); //בכל פעם שיש שינוי אנו נצתרך להוסיף זאת בכדי לראות את השינוי
                                 //המתודה אומרת לצייר מחדש עם הערכים החדשים שכתבנו
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("key released");
    }
}
