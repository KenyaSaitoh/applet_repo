package org.study.se.gui.applet;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GroupLayoutApplet1 extends JApplet {

    @Override
    public void init() {
        // JPanelの作成
        JPanel jPanel = new JPanel();

        // JLabelの作成
        JLabel jLabel = new JLabel("<html><h1>GroupLayout </h1></html>");
        jPanel.add(jLabel);

        // JTextFieldの作成
        JTextField jField = new JTextField("How's Good?");
        jField.setPreferredSize(new Dimension(100, 40));
        jPanel.add(jField);

        // JButtonの作成
        JButton button = new JButton("<html><h2>OK</h2></html>");
        jPanel.add(button);

        // GroupLayoutオブジェクトを生成
        GroupLayout layout = new GroupLayout(jPanel);
        jPanel.setLayout(layout);

        // 自動的にコンポーネント間の隙間をあける
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // 水平方向グループの設定
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addComponent(jLabel).addComponent(jField).addComponent(button);
        layout.setHorizontalGroup(hGroup);

        // 垂直方向グループの設定
        GroupLayout.ParallelGroup vGroup = 
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        vGroup.addComponent(jLabel).addComponent(jField).addComponent(button);
        layout.setVerticalGroup(vGroup);

        // アプレットにパネルを追加
        add(jPanel);
    }
}