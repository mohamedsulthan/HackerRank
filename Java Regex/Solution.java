/*
Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. 
Use the following definition of an IP address:
*/
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}
