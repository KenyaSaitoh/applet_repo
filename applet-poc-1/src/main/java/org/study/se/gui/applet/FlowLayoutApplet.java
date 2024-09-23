package org.study.se.gui.applet;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowLayoutApplet extends JApplet {

    JPanel jPanel;
    JButton jButton1, jButton2, jButton3;

    @Override
    public void init() {
        // コンテナを取得
        Container container = getContentPane();
        
        // JPanelとボタンの作成
        jPanel = new JPanel();
        jButton1 = new JButton("Yes");
        jButton2 = new JButton("No");
        jButton3 = new JButton("Cancel");
        
        // JPanelにボタンを追加
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        
        // FlowLayoutを設定してパネルを追加
        container.setLayout(new FlowLayout());
        container.add(jPanel);
    }
}