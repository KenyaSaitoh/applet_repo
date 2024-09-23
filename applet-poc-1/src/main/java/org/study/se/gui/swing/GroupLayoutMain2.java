package org.study.se.gui.swing;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GroupLayoutMain2 {

    public GroupLayoutMain2() {
        JFrame frame = new JFrame("GroupLayout Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        // GroupLayout
        GroupLayout layout = new GroupLayout(jPanel);
        jPanel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel lastNameLabel = new JLabel("Last Name");
        jPanel.add(lastNameLabel);
        JLabel firstNameLabel = new JLabel("First Name");
        jPanel.add(firstNameLabel);

        JTextField lastNameField = new JTextField(10);
        jPanel.add(lastNameField);
        JTextField firstNameField = new JTextField(10);
        jPanel.add(firstNameField);

        // 水平方向のシリアルグループを作成する。
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

        // ラベルを含むパラレルグループを作成する。
        GroupLayout.ParallelGroup pGroup1 = layout.createParallelGroup();
        pGroup1.addComponent(lastNameLabel).addComponent(firstNameLabel);

        // テキストフィールドを含むパラレルグループを作成する。
        GroupLayout.ParallelGroup pGroup2 = layout.createParallelGroup();
        pGroup2.addComponent(lastNameField).addComponent(firstNameField);

        // パラレルグループhGroup2とhGroup3を、シリアルグループhGroupに追加する。
        hGroup.addGroup(pGroup1).addGroup(pGroup2);

        layout.setHorizontalGroup(hGroup);

        // 垂直方向のシリアルグループを作成する。
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        // Last Nameのコンポーネントを含むパラレルグループを作成する。
        GroupLayout.ParallelGroup pGroup3 = layout
                .createParallelGroup(GroupLayout.Alignment.BASELINE);
        pGroup3.addComponent(lastNameLabel).addComponent(lastNameField);

        // First Nameのコンポーネントを含むパラレルグループを作成する。
        GroupLayout.ParallelGroup pGroup4 = layout
                .createParallelGroup(GroupLayout.Alignment.BASELINE);
        pGroup4.addComponent(firstNameLabel).addComponent(firstNameField);

        // パラレルグループhGroup2とhGroup3を、シリアルグループvGroupに追加する。
        vGroup.addGroup(pGroup3).addGroup(pGroup4);

        layout.setVerticalGroup(vGroup);

        frame.add(jPanel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new GroupLayoutMain2();
            }
        });
    }
}