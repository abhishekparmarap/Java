package com.company;
import java.awt.*;
import java.awt.event.*;

class marksAnalysis extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t8,t7;
    Button b1,b2;
    marksAnalysis()
    {
        super("Marks Analysis System");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        l1=new Label("Student name:");
        l2=new Label("Marks:");
        l3=new Label("Average:");
        l4=new Label(null);
        l5=new Label("Lowest marks:");
        l6=new Label("Highest marks:");
        l7=new Label(null);
        l8=new Label(null);
        t1=new TextField();
        t2=new TextField();
        t3 = new TextField();
                t4 = new TextField();
                t5 = new TextField();
                t6 = new TextField();
                t7 = new TextField();
                t8 = new TextField();
        b1=new Button("Submit");
        b2=new Button("Clear");

        l1.setBounds(20, 80, 80, 30);
        add(l1);
        l2.setBounds(150,80,80,30);
        add(l2);
        t1.setBounds(20, 110, 80, 30);
        add(t1);
        t2.setBounds(150,110,80,30);
        add(t2);
        t3.setBounds(20, 140, 80, 30);
        add(t3);
        t4.setBounds(150, 140, 80, 30);
        add(t4);
        t5.setBounds(20, 170, 80, 30);
        add(t5);
        t6.setBounds(150, 170, 80, 30);
        add(t6);
        t7.setBounds(20, 200, 80, 30);
        add(t7);
        t8.setBounds(150, 200, 80, 30);
        add(t8);

        l3.setBounds(20,280,100,20);
        add(l3);
        l4.setBounds(120,280,60,20);
        add(l4);
        l5.setBounds(20,320,100,20);
        add(l5);
        l6.setBounds(20,360,80,20);
        add(l6);
        l7.setBounds(120,320,60,20);
        add(l7);
        l8.setBounds(120,360,60,20);
        add(l8);
        b1.setBounds(40,240,50,20);
        add(b1);
        b2.setBounds(160,240,50,20);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        float a,b,c,d,e;
        if(ae.getSource()==b1)
        {
            a=Integer.parseInt(t2.getText().trim());
            b=Integer.parseInt(t4.getText().trim());
            c=Integer.parseInt(t6.getText().trim());
            d=Integer.parseInt(t8.getText().trim());
            e=(a+b+c+d)/4;
            l4.setText(Float.toString(e));
            int min = (int) Math.min(Math.min(Math.min(a,b),c),d);
            l7.setText(Float.toString(min));
            int max= (int) Math.max(Math.max(Math.max(a,b),c),d);
            l8.setText(Float.toString(max));

        }
        else
        {
            t1.setText(null);
            t2.setText(null);
            l4.setText(null);
        }
    }

    public static void main(String s[])
    {
        marksAnalysis ob=new marksAnalysis();
    }
}