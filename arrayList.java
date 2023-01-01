package com.company;
import java.util.*;

class arrayList
{
    public static void main(String[] args)
    {
        Stack<Integer> abc = new Stack<>();
        abc.add(10);
        abc.add(39);
        System.out.println("Stack is " + abc);
        ArrayList<Integer> obj= new ArrayList<Integer>();
        obj.add(1);
        obj.add(5);
        obj.add(10);
        obj.add(20);
        System.out.println("ArrayList is " + obj);
        obj.remove(2);
        System.out.println("ArrayList is " + obj);
        obj.clear();
        System.out.println("ArrayList is " + obj);
    }
}