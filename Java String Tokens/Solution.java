/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
We define a token to be one or more consecutive English alphabetic letters.
 Then, print the number of tokens, followed by each token on a new line.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String a=sc.nextLine();
         a = a.trim();
        if (a.length()==0){
             System.out.println("0");
         }
        else{
             String[] st = a.split("[!,?._' @]+"); 
             System.out.println(st.length);
        for (String b : st) 
            System.out.println(b);}
            
        }
    }

