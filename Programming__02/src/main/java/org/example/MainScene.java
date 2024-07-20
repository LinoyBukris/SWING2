package org.example;

import javax.swing.*;
import java.awt.*;

public class MainScene extends JPanel {
    private Car car1;
    private Car car2;

    public MainScene(){
        this.setBounds(Window.WINDOW_WIDTH/3, 0, Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        this.setBackground(Color.CYAN);
        this.car1 = new Car(50,50,200);
        this.car2 = new Car(150,300,80);

        this.setFocusable(true); //לא עבד בלי 2 שורות אלו, שי לא הסביר מעבר
        this.requestFocus();

        this.addKeyListener(new MovementListener2(this)); //הוספנו את ה key listener שיצרנו


    }
                                                  //מתודה האחראית לצייר את מה שבתוכה,
    protected void paintComponent(Graphics g) {// לכן נרצה לדרוס אותה
        super.paintComponent(g);            //אלא  לא נמחק שורה זאת בשביל לא למחוק את מה שיש בה כבר אלא להוסיף מתחת
        car1.paint(g);
        car2.paint(g);

    }
    public Car getCar1(){
        return this.car1;
    }

}
