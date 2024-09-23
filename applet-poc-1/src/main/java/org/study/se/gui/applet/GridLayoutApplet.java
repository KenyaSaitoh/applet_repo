package org.study.se.gui.applet;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutApplet extends JApplet {

    @Override
    public void init() {
        // コンテナを取得
        Container container = getContentPane();

        // パネルを作成
        JPanel jPanel = new JPanel();

        // パネルはグリッドレイアウト
        GridLayout grid = new GridLayout(3, 3);
        jPanel.setLayout(grid);

        // パネルにラベルとボタンを配置
        jPanel.add(new JLabel(""));       // 空白のラベル
        jPanel.add(new JButton("↑"));     // 上ボタン
        jPanel.add(new JLabel(""));       // 空白のラベル
        jPanel.add(new JButton("←"));     // 左ボタン
        jPanel.add(new JLabel(""));       // 中央のラベル
        jPanel.add(new JButton("→"));     // 右ボタン
        jPanel.add(new JLabel(""));       // 空白のラベル
        jPanel.add(new JButton("↓"));     // 下ボタン
        jPanel.add(new JLabel(""));       // 空白のラベル

        // アプレットのコンテンツ区画（北）にCANCELボタンを配置
        container.add(new JButton("CANCEL"), BorderLayout.NORTH);

        // アプレットのコンテンツ区画（中央）にグリッドパネルを配置
        container.add(jPanel, BorderLayout.CENTER);
    }
}
