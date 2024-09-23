package org.study.se.gui.applet;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JButton;

public class BorderLayoutApplet extends JApplet {

    @Override
    public void init() {
        // コンテナを取得
        Container container = getContentPane();
        
        // BorderLayoutを設定
        BorderLayout border = new BorderLayout(10, 10);
        container.setLayout(border);
        
        // ボタンを配置
        container.add(new JButton("北"), BorderLayout.NORTH);
        container.add(new JButton("東"), BorderLayout.EAST);
        container.add(new JButton("中央"), BorderLayout.CENTER);
        container.add(new JButton("西"), BorderLayout.WEST);
        container.add(new JButton("南"), BorderLayout.SOUTH);
    }
}