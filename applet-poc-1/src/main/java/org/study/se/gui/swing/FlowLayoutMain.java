package org.study.se.gui.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutMain extends JFrame {

    JPanel jPanel;
    JButton jButton1, jButton2, jButton3;

    public static void main(String[] args) {
        FlowLayoutMain mainClass = new FlowLayoutMain();
        mainClass.pack();
        mainClass.setVisible(true);
        mainClass.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public FlowLayoutMain() {
        super("FlowLayoutMain");
        Container container = getContentPane();
        jPanel = new JPanel();
        jButton1 = new JButton("Yes");
        jButton2 = new JButton("No");
        jButton3 = new JButton("Cancel");
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        container.setLayout(new FlowLayout());
        container.add(jPanel);
    }
}
