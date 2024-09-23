package org.study.se.gui.swing;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GroupLayoutMain3 {

    public GroupLayoutMain3() {
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
        JLabel ageLabel = new JLabel("年齢");
        jPanel.add(firstNameLabel);

        JTextField lastNameField = new JTextField(10);
        jPanel.add(lastNameField);
        JTextField firstNameField = new JTextField(10);
        jPanel.add(firstNameField);
        JComboBox ageComboBox = new JComboBox(new String[] { "10 - 19",
                "20 - 29", "30 - 39", "40 - 49", "50 - 59" });
        jPanel.add(firstNameField);

        JLabel sexLabel = new JLabel("性別");
        jPanel.add(sexLabel);
        JLabel maleLabel = new JLabel("男性");
        jPanel.add(maleLabel);
        JLabel femaleLabel = new JLabel("女性");
        jPanel.add(femaleLabel);

        ButtonGroup group = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton();
        group.add(maleButton);
        jPanel.add(maleButton);
        JRadioButton femaleButton = new JRadioButton();
        group.add(femaleButton);
        jPanel.add(femaleButton);

        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

        hGroup.addGroup(layout.createParallelGroup()
                .addComponent(lastNameLabel).addComponent(firstNameLabel)
                .addComponent(ageLabel).addComponent(sexLabel));

        hGroup.addGroup(layout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addComponent(lastNameField)
                .addComponent(firstNameField).addGroup(
                        layout.createSequentialGroup()
                                .addComponent(ageComboBox).addGap(10, 20, 40))
                .addGroup(
                        layout.createSequentialGroup().addGap(5, 10, 20)
                                .addGroup(
                                        layout.createParallelGroup(
                                                GroupLayout.Alignment.CENTER)
                                                .addComponent(maleLabel)
                                                .addComponent(maleButton))
                                .addGap(5, 10, 20).addGroup(
                                        layout.createParallelGroup(
                                                GroupLayout.Alignment.CENTER)
                                                .addComponent(femaleLabel)
                                                .addComponent(femaleButton))
                                .addGap(5, 10, 20)));

        layout.setHorizontalGroup(hGroup);

        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        vGroup.addGroup(layout.createParallelGroup(
                GroupLayout.Alignment.BASELINE).addComponent(lastNameLabel)
                .addComponent(lastNameField));
        vGroup.addGroup(layout.createParallelGroup(
                GroupLayout.Alignment.BASELINE).addComponent(firstNameLabel)
                .addComponent(firstNameField));
        vGroup.addGroup(layout.createParallelGroup(
                GroupLayout.Alignment.BASELINE).addComponent(ageLabel)
                .addComponent(ageComboBox));
        vGroup.addGroup(layout.createParallelGroup(
                GroupLayout.Alignment.BASELINE).addComponent(sexLabel)
                .addComponent(maleLabel).addComponent(femaleLabel));
        vGroup.addGroup(layout.createParallelGroup().addComponent(maleButton)
                .addComponent(femaleButton));
        layout.setVerticalGroup(vGroup);

        frame.add(jPanel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new GroupLayoutMain3();
            }
        });
    }
}