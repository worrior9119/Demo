package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DirPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(dirPath(str));
        System.out.println(x);
        System.out.println();
        System.out.println();
    }
    public static String dirPath(String str){
        Stack<String> s = new Stack<String>();
        String[] p = str.split("/");
        for (String t: p){
            if(!t.isEmpty() && t.equals(".."))
                s.pop();
            else if(!t.equals(".")&&!t.equals("")&&!t.equals(".."))
                s.push(t);
        }
        List<String> res = new ArrayList<>(s);
        return "/"+String.join("/",res);
    }
}
