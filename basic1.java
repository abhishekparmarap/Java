package com.company;
import java.util.Scanner;

public class basic1 {
    public static void sum(int a,int b){
        System.out.println(a + b);
    }
    public static void subt(int a, int b) {
        System.out.println(a - b);
    }
    public static void mult(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        subt(a,b);
        mult(a,b);
    }
}
