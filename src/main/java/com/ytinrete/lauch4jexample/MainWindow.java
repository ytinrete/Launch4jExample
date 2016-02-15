package com.ytinrete.lauch4jexample;

import javax.swing.*;

/**
 * Created by lirui on 16/2/15.
 */
public class MainWindow extends JFrame {

  public static void main(String args[]){
    new MainWindow();
  }

  MainWindow(){

    this.add(new JLabel("  Hello world!"));

    this.setSize(200, 100);

    this.setVisible(true);

    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    this.setResizable(false);

  }

}
