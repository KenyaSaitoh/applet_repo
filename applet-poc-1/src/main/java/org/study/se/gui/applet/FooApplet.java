package org.study.se.gui.applet;

import java.awt.Container;
import java.util.Vector;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class FooApplet extends JApplet {

    // パネルにのせる部品をフィールドとして定義
    private JPanel jPanel;
    private JButton jButton;
    private JLabel jLabel;
    private JToggleButton jToggle;
    private JCheckBox jCheckBox;
    private JRadioButton jRadio;
    private JList jList;
    private JComboBox jComboBox;
    private JTextField jTextField;
    private JPasswordField jPassword;
    private JTextArea jTextArea;
    private JScrollBar jScroll;
    // メニューバーにのせる部品をフィールドとして定義
    private JMenuBar jMenuBar;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JCheckBoxMenuItem jCheckBoxMenuItem;

    // 初期化メソッド
    public void init() {
        // アプレットの設定
        Container container = getContentPane();
        Vector<String> vec = new Vector<String>();
        vec.add("Foo");
        vec.add("Bar");
        vec.add("Baz");

        // パネルのオブジェクトの生成
        jPanel = new JPanel();
        jButton = new JButton("JButton");
        jLabel = new JLabel("JLabel");
        jToggle = new JToggleButton("JToggleButton");
        jCheckBox = new JCheckBox("JCheckBox");
        jRadio = new JRadioButton("JRadioButton");
        jList = new JList(vec);
        jComboBox = new JComboBox(vec);
        jTextField = new JTextField("JTextField");
        jPassword = new JPasswordField("JPasswordField");
        jTextArea = new JTextArea("JTextArea");
        jScroll = new JScrollBar();

        // パネルへの追加
        jPanel.add(jButton);
        jPanel.add(jLabel);
        jPanel.add(jToggle);
        jPanel.add(jCheckBox);
        jPanel.add(jRadio);
        jPanel.add(jList);
        jPanel.add(jComboBox);
        jPanel.add(jTextField);
        jPanel.add(jPassword);
        jPanel.add(jTextArea);
        jPanel.add(jScroll);

        // コンテンツペインにパネルを追加
        container.add(jPanel);

        // メニューバーのオブジェクトの生成
        jMenuBar = new JMenuBar();
        jMenu1 = new JMenu("JMenu1");
        jMenu2 = new JMenu("JMenu2");
        jMenuItem1 = new JMenuItem("JMenuItem1");
        jMenuItem2 = new JMenuItem("JMenuItem2");
        jCheckBoxMenuItem = new JCheckBoxMenuItem("JCheckBoxMenuItem");

        // メニューバーの作成
        jMenuBar.add(jMenu1);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jCheckBoxMenuItem);
        jMenu1.add(jMenu2);
        jMenu2.add(jMenuItem2);

        // アプレットにはメニューバーのサポートがないため、別のレイアウトを検討してください。
    }
}
