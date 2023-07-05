package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorDemo extends JFrame implements ActionListener {
    JTextArea ta = new JTextArea();
    colorDemo(){
        JFrame f = new JFrame("color Demo");
        JButton b1 = new JButton("choose color");
        b1.setBounds(50,150,100,40);
        ta.setBounds(50,100,100,40);
        b1.addActionListener(this);
        f.add(b1);
        f.add(ta);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        Color c = JColorChooser.showDialog(this,"choose", Color.CYAN);
        ta.setBackground(c);
    }
    public static void main(String args[]){
        new colorDemo();
    }

}
