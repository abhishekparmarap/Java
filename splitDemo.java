package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.TextArea;

public class splitDemo extends JFrame {
    JFrame f;
    JTextArea t1,t2;
    public static void main(String args[]){
        JFrame f = new JFrame();
        splitDemo s = new splitDemo();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JTextArea t1 = new JTextArea(10,10);
        JTextArea t2 = new JTextArea(10,10);
        t1.setText("First Area");
        t2.setText("Second Area");
        p1.add(t1);
        p2.add(t2);
        JSplitPane sp = new JSplitPane(SwingConstants.VERTICAL,p1,p2);
        f.add(sp);
        f.setSize(300,300);
        f.setVisible(true);
        f.show();
    }
}
