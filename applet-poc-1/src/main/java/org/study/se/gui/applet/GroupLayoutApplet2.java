package org.study.se.gui.applet;

import javax.swing.GroupLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GroupLayoutApplet2 extends JApplet {

    @Override
    public void init() {
        JPanel jPanel = new JPanel();

        // GroupLayoutオブジェクトを生成し、パネルにセット
        GroupLayout layout = new GroupLayout(jPanel);
        jPanel.setLayout(layout);

        // 隙間の自動作成
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // ラベルとテキストフィールドの作成
        JLabel lastNameLabel = new JLabel("Last Name");
        JLabel firstNameLabel = new JLabel("First Name");
        JTextField lastNameField = new JTextField(10);
        JTextField firstNameField = new JTextField(10);

        // コンポーネントをパネルに追加
        jPanel.add(lastNameLabel);
        jPanel.add(firstNameLabel);
        jPanel.add(lastNameField);
        jPanel.add(firstNameField);

        // 水平方向のグループ作成
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

        GroupLayout.ParallelGroup pGroup1 = layout.createParallelGroup();
        pGroup1.addComponent(lastNameLabel).addComponent(firstNameLabel);

        GroupLayout.ParallelGroup pGroup2 = layout.createParallelGroup();
        pGroup2.addComponent(lastNameField).addComponent(firstNameField);

        hGroup.addGroup(pGroup1).addGroup(pGroup2);
        layout.setHorizontalGroup(hGroup);

        // 垂直方向のグループ作成
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        GroupLayout.ParallelGroup pGroup3 = layout
                .createParallelGroup(GroupLayout.Alignment.BASELINE);
        pGroup3.addComponent(lastNameLabel).addComponent(lastNameField);

        GroupLayout.ParallelGroup pGroup4 = layout
                .createParallelGroup(GroupLayout.Alignment.BASELINE);
        pGroup4.addComponent(firstNameLabel).addComponent(firstNameField);

        vGroup.addGroup(pGroup3).addGroup(pGroup4);
        layout.setVerticalGroup(vGroup);

        // アプレットにパネルを追加
        add(jPanel);
    }
}
