package com.company;
import java.io.*;

public class traceRoute {
    File trac=new File("tracert.txt");
    File trac1=new File("tracert.csv");
    public static void traceCmd(String command)
    {
        try
        {
            FileWriter fw=new FileWriter("tracert.txt");
            FileWriter fw1=new FileWriter("tracert.csv");
            Process pr = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(pr.getInputStream()));
            PrintWriter obj=new PrintWriter(fw);
            PrintWriter obj1=new PrintWriter(fw1);
            String str = "";
            while ((str = inputStream.readLine()) != null) {



                obj.write(str);
                obj.println();
                obj1.write(str);
                obj1.println();
                System.out.println(str);
            }
            fw.close();
            fw1.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }

    public static void main(String[] args)
    {
        String ipAdd = "www.google.com";
        traceCmd("tracert " + ipAdd);
    }
}
