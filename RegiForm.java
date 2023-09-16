package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class RegiForm {
public static void main(String[] args) {

JFrame f =new JFrame("Form");
JLabel l = new JLabel("Course Registration");
l.setBounds(20,10,300,30);
// l.setSize(200,200);
f.add(l);
JLabel l1 = new JLabel("Reg. No.");
JLabel l2 = new JLabel("Name");
JLabel l3 = new JLabel("Select a course: ");
 JTextField t1 = new JTextField();
 JTextField t2 = new JTextField();
 l1.setBounds(20,40,80,30);
 l2.setBounds(20,80,80,30);
 l3.setBounds(20,160, 100,50);
 t1.setBounds(100,40,110,30);
 t2.setBounds(100,80,110,30);
 f.add(l1);
 f.add(t1);
 f.add(l2);
 f.add(t2);
 f.add(l3);
 JLabel genderLabel = new JLabel("Gender");
 JRadioButton genderMale = new JRadioButton("Male", true);
 JRadioButton genderFemale = new JRadioButton("Female");
 genderLabel.setBounds(20,120,80,30);
 genderMale.setBounds(100,120,80,30);
 genderFemale.setBounds(180,120,100,30);
 f.add(genderLabel);
 f.add(genderMale);
 f.add(genderFemale);
 ButtonGroup genderGroup = new ButtonGroup();
 genderGroup.add(genderMale);
 genderGroup.add(genderFemale);
 JCheckBox checkBox1 = new JCheckBox("Computer Science");
 checkBox1.setBounds(120,160, 300,50);
 JCheckBox checkBox2 = new JCheckBox("Electricals");
 checkBox2.setBounds(120,200, 300,50);
 JCheckBox checkBox3 = new JCheckBox("AI");
 checkBox3.setBounds(120,240, 300,50);
 JCheckBox checkBox4 = new JCheckBox("Communication");
 checkBox4.setBounds(120,280, 300,50);
 f.add(checkBox1);
 f.add(checkBox2);
 f.add(checkBox3);
 f.add(checkBox4);
    JButton b = new JButton("Submit");
// b.addActionListener(this);
 b.setBounds(50,350,100,40);
 f.add(b);
 f.setSize(500,500);
 f.setLayout(null);
 f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    }
}
