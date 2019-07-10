package com.auxo.resource;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Banter {
    private static Object JSONArray;

    public static void main(String...args) throws Exception
    {
        String s="";
        String result[]=new String[6];
        String arr[]= {"Name:","Street Name:","City:","Postal Code:","Phone:","Email Address:"};

        for(int i=0;i<arr.length;i++)
        {
            result[i]=returnWord(arr[i],"D:\\sample1.txt");
            if(result[i]=="")
            {
                result[i]=returnWord("Mail:","D:\\sample1.txt");
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            result[i]=returnWord(arr[i],"D:\\sample1.txt");
            if(result[i]=="")
            {
                result[i]=returnWord("Mail:","D:\\sample1.txt");
            }
        } System.out.println(Arrays.toString(result));


        send();

    }

    public static String returnWord(String pattern,String path) throws Exception
    {
        String temp="";
        String fileName = path;
        File file=new File(fileName);
        String s="";

        FileReader fr=new FileReader(file);
        BufferedReader  br=new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {



            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(s);
            if(m.find())
            {
                return s;
            }


        }
        return temp;
    }private static void send() {
        JSONObject obj = new JSONObject();
        obj.put(1,"Name");
        obj.put(2,"Street Name");
        obj.put(3,"City");
        obj.put(4,"Postal Code");
        obj.put(5,"Phone");


        //"D:\\sample1.txt"

        obj.put("0","patient");
        System.out.println(obj);
    }
}
