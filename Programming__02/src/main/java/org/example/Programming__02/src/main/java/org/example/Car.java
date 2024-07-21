package org.example;

import java.awt.*;
import java.util.PropertyResourceBundle;

public class Car {

    private int x;
    private int y;
    private int size;
    private int bodyWidth;
    private int bodyHeight;

    public Car(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.bodyWidth = size;
        this.bodyHeight = this.bodyWidth/2;
    }

    public void paint(Graphics g){
        //body
        g.setColor(Color.darkGray);
        g.fillRect(this.x,this.y,this.bodyWidth,this.bodyHeight);

        //front
        g.setColor(Color.red);
        g.fillRect(this.x+this.bodyWidth,
                this.y +this.bodyHeight/2,
                this.bodyWidth/3,
                this.bodyHeight/2);

        //wheel
        g.setColor(Color.black);
        g.fillOval(this.x+this.bodyWidth-this.size/16,
                this.y+this.bodyHeight-this.size/20,
                this.size/6,
                this.size/6);
        g.fillOval(this.x+this.size/16,
                this.y+this.bodyHeight-this.size/20,
                this.size/6,
                this.size/6);
    }

    public void moveRight(){
        this.x+=5;

    }
    public void moveLeft(){
        this.x-=5;
    }

}
