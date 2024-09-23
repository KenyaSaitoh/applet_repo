package org.study.se.gui.swing;

import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GroupLayoutMain1 {

    public GroupLayoutMain1() {
        JFrame frame = new JFrame("GroupLayout Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        JLabel jLabel = new JLabel("<html><h1>GroupLayout </h1></html>");
        jPanel.add(jLabel);

        JTextField jField = new JTextField("How's Good?");
        jField.setPreferredSize(new Dimension(100, 40));
        jPanel.add(jField);

        JButton button = new JButton("<html><h2>OK</h2></html>");
        jPanel.add(button);

        // GroupLayoutオブジェクトを生成する。
        GroupLayout layout = new GroupLayout(jPanel);
        jPanel.setLayout(layout);

        // 自動的にコンポーネント間の隙間をあけるようにする。
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // 水平方向グループを生成する。
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

        // 水平方向グループにコンポーネントを追加する。
        hGroup.addComponent(jLabel).addComponent(jField).addComponent(button);

        // レイアウトマネージャに登録する。
        layout.setHorizontalGroup(hGroup);

        // 垂直方向グループを生成する。
        GroupLayout.ParallelGroup vGroup = 
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE);

        // 垂直方向グループにコンポーネントを追加する。
        vGroup.addComponent(jLabel).addComponent(jField).addComponent(button);

        // レイアウトマネージャに登録に登録する。
        layout.setVerticalGroup(vGroup);

        frame.add(jPanel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new GroupLayoutMain1();
            }
        });
    }
}