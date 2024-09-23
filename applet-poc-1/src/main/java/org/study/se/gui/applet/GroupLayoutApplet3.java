package org.study.se.gui.applet;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GroupLayoutApplet3 extends JApplet {

    @Override
    public void init() {
        JPanel jPanel = new JPanel();

        // GroupLayoutオブジェクトを生成し、パネルに設定
        GroupLayout layout = new GroupLayout(jPanel);
        jPanel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // ラベルとテキストフィールド、コンボボックス、ラジオボタンの作成
        JLabel lastNameLabel = new JLabel("Last Name");
        JLabel firstNameLabel = new JLabel("First Name");
        JLabel ageLabel = new JLabel("年齢");
        JTextField lastNameField = new JTextField(10);
        JTextField firstNameField = new JTextField(10);
        JComboBox<String> ageComboBox = new JComboBox<>(new String[] { "10 - 19", "20 - 29", "30 - 39", "40 - 49", "50 - 59" });

        JLabel sexLabel = new JLabel("性別");
        JLabel maleLabel = new JLabel("男性");
        JLabel femaleLabel = new JLabel("女性");

        ButtonGroup group = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton();
        JRadioButton femaleButton = new JRadioButton();
        group.add(maleButton);
        group.add(femaleButton);

        // 水平方向のグループ作成
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

        hGroup.addGroup(layout.createParallelGroup()
                .addComponent(lastNameLabel).addComponent(firstNameLabel)
                .addComponent(ageLabel).addComponent(sexLabel));

        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lastNameField).addComponent(firstNameField)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(ageComboBox).addGap(10, 20, 40))
                .addGroup(layout.createSequentialGroup().addGap(5, 10, 20)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(maleLabel).addComponent(maleButton))
                        .addGap(5, 10, 20)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(femaleLabel).addComponent(femaleButton))
                        .addGap(5, 10, 20)));

        layout.setHorizontalGroup(hGroup);

        // 垂直方向のグループ作成
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lastNameLabel).addComponent(lastNameField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(firstNameLabel).addComponent(firstNameField));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(ageLabel).addComponent(ageComboBox));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(sexLabel).addComponent(maleLabel).addComponent(femaleLabel));
        vGroup.addGroup(layout.createParallelGroup()
                .addComponent(maleButton).addComponent(femaleButton));

        layout.setVerticalGroup(vGroup);

        // パネルをアプレットに追加
        add(jPanel);
    }
}