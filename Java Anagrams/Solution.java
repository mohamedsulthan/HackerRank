/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
*/
import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        A=A.toLowerCase();
       B=B.toLowerCase();
       boolean state = false;
      char[]  A1= A.toCharArray();
      Arrays.sort(A1);
      char[] B1 = B.toCharArray();
      Arrays.sort(B1);
      String a = new String (A1);
      String b = new String (B1);
      if (a.equals(b)) {
          state=true;
      }
        if(state)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
