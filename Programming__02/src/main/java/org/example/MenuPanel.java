package org.example;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel(){
        this.setBounds(0, 0, Window.WINDOW_WIDTH/3, Window.WINDOW_HEIGHT);
        this.setBackground(Color.PINK);
        GridLayout gridLayout = new GridLayout(4,2); //יצירת "תבנית" (layout)
        setLayout(gridLayout);
        addNButton(0);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(0,0, 50, 50);
    }

    public void addNButton(int n){ // פונקציה המוסיפה N כפתורים
        for (int i=0; i<n; i++){  // בניתי את הפונקציה לעזר להבנת ה Layout
            this.add(new JButton());
        }
    }

}
