package com.company;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class treeDemo {
    JFrame f;
    treeDemo(){
        f=new JFrame();
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode left=new DefaultMutableTreeNode("left");
        DefaultMutableTreeNode right=new DefaultMutableTreeNode("right");
        root.add(left);
        root.add(right);
        JTree jt = new JTree(root);
        f.add(jt);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setSize(500,600);
        DefaultMutableTreeNode item1=new DefaultMutableTreeNode("item1");
        DefaultMutableTreeNode item2=new DefaultMutableTreeNode("item2");
        DefaultMutableTreeNode item3=new DefaultMutableTreeNode("item3");
        DefaultMutableTreeNode item4=new DefaultMutableTreeNode("item4");
        left.add(item1); left.add(item2); left.add(item3); left.add(item4);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new treeDemo();
    }}