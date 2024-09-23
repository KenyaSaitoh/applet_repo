package org.study.se.gui.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayoutMain");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();

        // パネルを作る
        JPanel jPanel = new JPanel();

        // パネルはグリッドレイアウト
        GridLayout grid = new GridLayout(3, 3);
        jPanel.setLayout(grid);

        // パネルにラベルとボタンを載せる
        jPanel.add(new JLabel(""));
        jPanel.add(new JButton("↑"));
        jPanel.add(new JLabel(""));
        jPanel.add(new JButton("←"));
        jPanel.add(new JLabel(""));
        jPanel.add(new JButton("→"));
        jPanel.add(new JLabel(""));
        jPanel.add(new JButton("↓"));
        jPanel.add(new JLabel(""));

        // フレームのコンテンツ区画（北）にボタンを載せる
        container.add(new JButton("CANCEL"), BorderLayout.NORTH);

        // フレームのコンテンツ区画（中央）にパネルを載せる
        container.add(jPanel, BorderLayout.CENTER);

        // フレームのコンテンツ区画（南）にボタンを載せる
        container.add(new JButton("O K"), BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
