package com.company;

import java.awt.*;

public class GUIDemo {
    GUIDemo(){
//        Button b = new Button("click");
//        b.setBounds(30,100,80,30);
//        add(b);
//        b.setBackground(Color.green);
//        setSize(300,300);
//        setTitle("AWT");
//        setVisible(true);

        Frame f = new Frame();
        Label l = new Label("eid");
        Button b = new Button("Submit");
        TextField t = new TextField();
        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        f.add(b);
        f.add(t);
        f.add(l);
        f.setSize(300,300);
        f.setTitle("emp info");
        f.setVisible(true);
    }
    public static void main(String args[]){
        GUIDemo g = new GUIDemo();
    }
}
