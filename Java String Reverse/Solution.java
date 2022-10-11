/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int flag=0;
        for(int i=0;i<A.length();i++){
            if (A.charAt(i) != A.charAt(A.length()-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("No");
                   }
        else{
            System.out.println("Yes");
            }
        }     
    }




