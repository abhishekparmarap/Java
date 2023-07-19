package com.company;
import java.awt.*;
import javax.swing.*;

public class Toolbar{
    public static void main(final String args[]) {
        JFrame myframe = new JFrame("JToolBar Example");
        JToolBar toolbar = new JToolBar();

        toolbar.add(new JButton("ToolButton"));
        toolbar.add(new JComboBox(new String[] { "Java", "C++", "Python", "JavaScript" }));
        Container contentPane = myframe.getContentPane();
        contentPane.add(toolbar, BorderLayout.NORTH);
        JTextArea textArea = new JTextArea();
        JScrollPane mypane = new JScrollPane(textArea);
        contentPane.add(mypane, BorderLayout.EAST);
        myframe.setSize(450, 250);
        myframe.setVisible(true);
    }
}
