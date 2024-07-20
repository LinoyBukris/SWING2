package org.example;

import javax.swing.*;

public class Window extends JFrame {

    public static final int WINDOW_WIDTH =600;
    public static final int WINDOW_HEIGHT =600;

    public Window(){
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        MainScene mainScene = new MainScene();
        this.add(mainScene);

        MenuPanel menuPanel = new MenuPanel();
        this.add(menuPanel);
    }




}
