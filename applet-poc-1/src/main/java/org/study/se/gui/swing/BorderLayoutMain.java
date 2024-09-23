package org.study.se.gui.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutMain extends JFrame {

    public static void main(String[] args) {
        BorderLayoutMain mainClass = new BorderLayoutMain("BorderLayoutMain");
        mainClass.pack();
        mainClass.setVisible(true);
        mainClass.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public BorderLayoutMain(String title) {
        super(title);
        Container container = getContentPane();
        BorderLayout border = new BorderLayout(10, 10);
        container.setLayout(border);
        container.add(new JButton("北"), "North");
        container.add(new JButton("東"), "East");
        container.add(new JButton("中央"), "Center");
        container.add(new JButton("西"), "West");
        container.add(new JButton("南"), "South");
    }
}
